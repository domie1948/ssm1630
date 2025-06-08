package com.controller;


import java.text.DecimalFormat;
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

import com.entity.JiuyeEntity;

import com.service.JiuyeService;
import com.entity.view.JiuyeView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 就业信息
 * 后端接口
 * @author
 * @email
 * @date 2021-03-17
*/
@RestController
@Controller
@RequestMapping("/jiuye")
public class JiuyeController {
    private static final Logger logger = LoggerFactory.getLogger(JiuyeController.class);

    @Autowired
    private JiuyeService jiuyeService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service
    @Autowired
    private YonghuService yonghuService;


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
        PageUtils page = jiuyeService.queryPage(params);

        //字典表数据转换
        List<JiuyeView> list =(List<JiuyeView>)page.getList();
        for(JiuyeView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        R ok = R.ok();
        ok.put("data", page);
        int sumCount = jiuyeService.selectCount(new EntityWrapper<JiuyeEntity>());
        int jiuyeSumCount = jiuyeService.selectCount(new EntityWrapper<JiuyeEntity>().eq("jiuye_types",1));
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        String jiuyelv= "就业率："+df.format(jiuyeSumCount * 100.00 / sumCount) + "%";
        ok.put("jiuyelv",jiuyelv);
        return ok;
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiuyeEntity jiuye = jiuyeService.selectById(id);
        if(jiuye !=null){
            //entity转view
            JiuyeView view = new JiuyeView();
            BeanUtils.copyProperties( jiuye , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(jiuye.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
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
    public R save(@RequestBody JiuyeEntity jiuye, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiuye:{}",this.getClass().getName(),jiuye.toString());
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
            Integer userId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity.getName() == null || yonghuEntity.getIdNumber() ==null){
                return R.error(511,"先进行实名制");
            }
            JiuyeEntity jiuyeEntity = jiuyeService.selectOne(new EntityWrapper<JiuyeEntity>().eq("yonghu_id",userId ));
            if(jiuyeEntity==null){
                jiuye.setYonghuId(userId);
                jiuye.setCreateTime(new Date());
                jiuyeService.insert(jiuye);
                return R.ok();
            }else {
                return R.error(511,"您已经添加过就业信息了");
            }
        }else{
            return R.error(511,"您没有权限添加就业信息");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiuyeEntity jiuye, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiuye:{}",this.getClass().getName(),jiuye.toString());
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
            //根据字段查询是否有相同数据
            Wrapper<JiuyeEntity> queryWrapper = new EntityWrapper<JiuyeEntity>()
                .notIn("id",jiuye.getId())
                .eq("yonghu_id", request.getSession().getAttribute("userId"));
            logger.info("sql语句:"+queryWrapper.getSqlSegment());
            JiuyeEntity jiuyeEntity = jiuyeService.selectOne(queryWrapper);
            if(jiuyeEntity==null){
                jiuyeService.updateById(jiuye);//根据id更新
                return R.ok();
            }else {
                return R.error(511,"表中有相同数据");
            }
        }else {
            return R.error(511,"您没有权限修改此就业信息");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jiuyeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}

