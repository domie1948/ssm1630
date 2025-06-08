package com.controller;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.JigouEntity;

import com.service.JigouService;
import com.entity.view.JigouView;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 机构人员
 * 后端接口
 * @author
 * @email
 * @date 2021-03-17
*/
@RestController
@Controller
@RequestMapping("/jigou")
public class JigouController {
    private static final Logger logger = LoggerFactory.getLogger(JigouController.class);

    @Autowired
    private JigouService jigouService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        PageUtils page = jigouService.queryPage(params);

        //字典表数据转换
        List<JigouView> list =(List<JigouView>)page.getList();
        for(JigouView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JigouEntity jigou = jigouService.selectById(id);
        if(jigou !=null){
            //entity转view
            JigouView view = new JigouView();
            BeanUtils.copyProperties( jigou , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JigouEntity jigou, HttpServletRequest request) throws ParseException {
        logger.debug("save方法:,,Controller:{},,jigou:{}",this.getClass().getName(),jigou.toString());
        Wrapper<JigouEntity> queryWrapper = new EntityWrapper<JigouEntity>()
            .eq("username", jigou.getUsername())
            .or()
            .eq("jigou_id_number", jigou.getJigouIdNumber())
            .or()
            .eq("jigou_phone", jigou.getJigouPhone())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JigouEntity jigouEntity = jigouService.selectOne(queryWrapper);
        if(jigouEntity==null){
            jigou.setCreateTime(new Date());
            jigou.setPassword("123456");
            DateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date parse = format.parse(jigou.getJigouIdNumber().substring(6, 14));
            if(parse.getTime() < format.parse("19500101").getTime() || parse.getTime() > new Date().getTime()){
                return R.error(511,"身份证号中的年月日不正确");
            }else{
                StringBuilder chushengriqi = new StringBuilder();
                Calendar cal = Calendar.getInstance();
                cal.setTime(parse);
                chushengriqi.append(cal.get(Calendar.YEAR)).append("-").append(cal.get(Calendar.MONTH)+1).append("-").append(cal.get(Calendar.DAY_OF_MONTH));
                jigou.setJigouChushengriqi(chushengriqi.toString());
            }
            jigouService.insert(jigou);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JigouEntity jigou, HttpServletRequest request) throws ParseException {
        logger.debug("update方法:,,Controller:{},,jigou:{}",this.getClass().getName(),jigou.toString());
        //根据字段查询是否有相同数据
        Wrapper<JigouEntity> queryWrapper = new EntityWrapper<JigouEntity>()
            .notIn("id",jigou.getId())
            .andNew()
            .eq("username", jigou.getUsername())
            .or()
            .eq("jigou_id_number", jigou.getJigouIdNumber())
            .or()
            .eq("jigou_phone", jigou.getJigouPhone())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JigouEntity jigouEntity = jigouService.selectOne(queryWrapper);
        if("".equals(jigou.getJigouPhoto()) || "null".equals(jigou.getJigouPhoto())){
                jigou.setJigouPhoto(null);
        }
        if(jigouEntity==null){
            DateFormat format = new SimpleDateFormat("yyyyMMdd");
            if(StringUtil.isNotEmpty(jigou.getJigouIdNumber())){
                Date parse = format.parse(jigou.getJigouIdNumber().substring(6, 14));
                if(parse.getTime() < format.parse("19500101").getTime() || parse.getTime() > new Date().getTime()){
                    return R.error(511,"身份证号中的年月日不正确");
                }else{
                    StringBuilder chushengriqi = new StringBuilder();
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(parse);
                    chushengriqi.append(cal.get(Calendar.YEAR)).append("-").append(cal.get(Calendar.MONTH)+1).append("-").append(cal.get(Calendar.DAY_OF_MONTH));
                    jigou.setJigouChushengriqi(chushengriqi.toString());
                }
            }
            jigouService.updateById(jigou);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jigouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
     * 登录
     */
    @IgnoreAuth
    @PostMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        JigouEntity jigou = jigouService.selectOne(new EntityWrapper<JigouEntity>().eq("username", username));
        if(jigou==null || !jigou.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        String token = tokenService.generateToken(jigou.getId(),username, "jigou", "机构");
        R r = R.ok();
        r.put("token", token);
        r.put("role","机构");
        r.put("username",jigou.getJigouName());
        r.put("tableName","jigou");
        r.put("userId",jigou.getId());
        return r;
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  yonghuId){
        JigouEntity yonghu = new JigouEntity();
        yonghu.setPassword("123456");
        yonghu.setId(yonghuId);
        jigouService.updateById(yonghu);
        return R.ok();
    }

    /**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrYonghu(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        JigouEntity jigou = jigouService.selectById(id);
        return R.ok().put("data", jigou);
    }


    /**
     * 退出
     */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }


    /**
     * 找回密码
     */
    @IgnoreAuth
    @RequestMapping("/zhaohui")
    public R zhaohui(@RequestBody Map<String,String> map, HttpServletRequest request){
        logger.debug("zhaohui方法:,,Controller:{},,map:{}",this.getClass().getName(),JSONObject.toJSONString(map));
        JigouEntity jigouEntity = jigouService.selectOne(new EntityWrapper<JigouEntity>().eq("username", String.valueOf(map.get("username"))).eq("jigou_name", String.valueOf(map.get("name"))).eq("jigou_phone", String.valueOf(map.get("phone"))).eq("jigou_id_number", String.valueOf(map.get("idNumber"))));
        if(jigouEntity != null){
            jigouEntity.setPassword("123456");
            jigouService.updateById(jigouEntity);
            return R.ok();
        }else{
            return R.error("查找不到此账户");
        }
    }


}

