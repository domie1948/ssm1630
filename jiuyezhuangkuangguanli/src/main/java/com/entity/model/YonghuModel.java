package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-17
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 姓名
     */
    private String name;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 照片
     */
    private String yonghuPhoto;


    /**
     * 出生日期
     */
    private String chushengriqi;


    /**
     * 民族
     */
    private String nation;


    /**
     * 政治面貌
     */
    private Integer politicsTypes;


    /**
     * 学校
     */
    private Integer xuexiaoTypes;


    /**
     * 学院
     */
    private Integer xueyuanTypes;


    /**
     * 专业
     */
    private Integer zhuanyeTypes;


    /**
     * 班级
     */
    private String banji;


    /**
     * 学号
     */
    private String xuehao;


    /**
     * 身份证号
     */
    private String idNumber;


    /**
     * 手机号
     */
    private String phone;


    /**
     * 家庭住址
     */
    private String address;


    /**
     * 邮箱
     */
    private String youxiang;


    /**
     * 邮政编码
     */
    private String youzhengbianma;


    /**
     * 个人爱好
     */
    private String aihaoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：姓名
	 */
    public String getName() {
        return name;
    }


    /**
	 * 设置：姓名
	 */
    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：出生日期
	 */
    public String getChushengriqi() {
        return chushengriqi;
    }


    /**
	 * 设置：出生日期
	 */
    public void setChushengriqi(String chushengriqi) {
        this.chushengriqi = chushengriqi;
    }
    /**
	 * 获取：民族
	 */
    public String getNation() {
        return nation;
    }


    /**
	 * 设置：民族
	 */
    public void setNation(String nation) {
        this.nation = nation;
    }
    /**
	 * 获取：政治面貌
	 */
    public Integer getPoliticsTypes() {
        return politicsTypes;
    }


    /**
	 * 设置：政治面貌
	 */
    public void setPoliticsTypes(Integer politicsTypes) {
        this.politicsTypes = politicsTypes;
    }
    /**
	 * 获取：学校
	 */
    public Integer getXuexiaoTypes() {
        return xuexiaoTypes;
    }


    /**
	 * 设置：学校
	 */
    public void setXuexiaoTypes(Integer xuexiaoTypes) {
        this.xuexiaoTypes = xuexiaoTypes;
    }
    /**
	 * 获取：学院
	 */
    public Integer getXueyuanTypes() {
        return xueyuanTypes;
    }


    /**
	 * 设置：学院
	 */
    public void setXueyuanTypes(Integer xueyuanTypes) {
        this.xueyuanTypes = xueyuanTypes;
    }
    /**
	 * 获取：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 设置：专业
	 */
    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 获取：班级
	 */
    public String getBanji() {
        return banji;
    }


    /**
	 * 设置：班级
	 */
    public void setBanji(String banji) {
        this.banji = banji;
    }
    /**
	 * 获取：学号
	 */
    public String getXuehao() {
        return xuehao;
    }


    /**
	 * 设置：学号
	 */
    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }
    /**
	 * 获取：身份证号
	 */
    public String getIdNumber() {
        return idNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getPhone() {
        return phone;
    }


    /**
	 * 设置：手机号
	 */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
	 * 获取：家庭住址
	 */
    public String getAddress() {
        return address;
    }


    /**
	 * 设置：家庭住址
	 */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
	 * 获取：邮箱
	 */
    public String getYouxiang() {
        return youxiang;
    }


    /**
	 * 设置：邮箱
	 */
    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang;
    }
    /**
	 * 获取：邮政编码
	 */
    public String getYouzhengbianma() {
        return youzhengbianma;
    }


    /**
	 * 设置：邮政编码
	 */
    public void setYouzhengbianma(String youzhengbianma) {
        this.youzhengbianma = youzhengbianma;
    }
    /**
	 * 获取：个人爱好
	 */
    public String getAihaoContent() {
        return aihaoContent;
    }


    /**
	 * 设置：个人爱好
	 */
    public void setAihaoContent(String aihaoContent) {
        this.aihaoContent = aihaoContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
