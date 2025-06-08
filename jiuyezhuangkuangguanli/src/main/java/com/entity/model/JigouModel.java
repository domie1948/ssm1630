package com.entity.model;

import com.entity.JigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 机构人员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-17
 */
public class JigouModel implements Serializable {
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
    private String jigouName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 照片
     */
    private String jigouPhoto;


    /**
     * 出生日期
     */
    private String jigouChushengriqi;


    /**
     * 民族
     */
    private String jigouNation;


    /**
     * 政治面貌
     */
    private Integer politicsTypes;


    /**
     * 工作单位
     */
    private String danwei;


    /**
     * 工作部门
     */
    private Integer bumenTypes;


    /**
     * 担任职位
     */
    private Integer zhiweiTypes;


    /**
     * 身份证号
     */
    private String jigouIdNumber;


    /**
     * 手机号
     */
    private String jigouPhone;


    /**
     * 家庭住址
     */
    private String jigouAddress;


    /**
     * 邮政编码
     */
    private String jigouYouzhengbianma;


    /**
     * 个人爱好
     */
    private String jigouAihaoContent;


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
    public String getJigouName() {
        return jigouName;
    }


    /**
	 * 设置：姓名
	 */
    public void setJigouName(String jigouName) {
        this.jigouName = jigouName;
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
    public String getJigouPhoto() {
        return jigouPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setJigouPhoto(String jigouPhoto) {
        this.jigouPhoto = jigouPhoto;
    }
    /**
	 * 获取：出生日期
	 */
    public String getJigouChushengriqi() {
        return jigouChushengriqi;
    }


    /**
	 * 设置：出生日期
	 */
    public void setJigouChushengriqi(String jigouChushengriqi) {
        this.jigouChushengriqi = jigouChushengriqi;
    }
    /**
	 * 获取：民族
	 */
    public String getJigouNation() {
        return jigouNation;
    }


    /**
	 * 设置：民族
	 */
    public void setJigouNation(String jigouNation) {
        this.jigouNation = jigouNation;
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
	 * 获取：工作单位
	 */
    public String getDanwei() {
        return danwei;
    }


    /**
	 * 设置：工作单位
	 */
    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }
    /**
	 * 获取：工作部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 设置：工作部门
	 */
    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 获取：担任职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 设置：担任职位
	 */
    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 获取：身份证号
	 */
    public String getJigouIdNumber() {
        return jigouIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setJigouIdNumber(String jigouIdNumber) {
        this.jigouIdNumber = jigouIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getJigouPhone() {
        return jigouPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setJigouPhone(String jigouPhone) {
        this.jigouPhone = jigouPhone;
    }
    /**
	 * 获取：家庭住址
	 */
    public String getJigouAddress() {
        return jigouAddress;
    }


    /**
	 * 设置：家庭住址
	 */
    public void setJigouAddress(String jigouAddress) {
        this.jigouAddress = jigouAddress;
    }
    /**
	 * 获取：邮政编码
	 */
    public String getJigouYouzhengbianma() {
        return jigouYouzhengbianma;
    }


    /**
	 * 设置：邮政编码
	 */
    public void setJigouYouzhengbianma(String jigouYouzhengbianma) {
        this.jigouYouzhengbianma = jigouYouzhengbianma;
    }
    /**
	 * 获取：个人爱好
	 */
    public String getJigouAihaoContent() {
        return jigouAihaoContent;
    }


    /**
	 * 设置：个人爱好
	 */
    public void setJigouAihaoContent(String jigouAihaoContent) {
        this.jigouAihaoContent = jigouAihaoContent;
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
