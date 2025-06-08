package com.entity.model;

import com.entity.JiuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 就业信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-17
 */
public class JiuyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 是否就业
     */
    private Integer jiuyeTypes;


    /**
     * 就业地区
     */
    private Integer diquTypes;


    /**
     * 公司名称
     */
    private String gongsiName;


    /**
     * 公司负责人姓名
     */
    private String fuzerenName;


    /**
     * 公司负责人手机号
     */
    private String fuzerenIdNumber;


    /**
     * 担任职位
     */
    private Integer zhiweiTypes;


    /**
     * 备注
     */
    private String beizhuContent;


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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：是否就业
	 */
    public Integer getJiuyeTypes() {
        return jiuyeTypes;
    }


    /**
	 * 设置：是否就业
	 */
    public void setJiuyeTypes(Integer jiuyeTypes) {
        this.jiuyeTypes = jiuyeTypes;
    }
    /**
	 * 获取：就业地区
	 */
    public Integer getDiquTypes() {
        return diquTypes;
    }


    /**
	 * 设置：就业地区
	 */
    public void setDiquTypes(Integer diquTypes) {
        this.diquTypes = diquTypes;
    }
    /**
	 * 获取：公司名称
	 */
    public String getGongsiName() {
        return gongsiName;
    }


    /**
	 * 设置：公司名称
	 */
    public void setGongsiName(String gongsiName) {
        this.gongsiName = gongsiName;
    }
    /**
	 * 获取：公司负责人姓名
	 */
    public String getFuzerenName() {
        return fuzerenName;
    }


    /**
	 * 设置：公司负责人姓名
	 */
    public void setFuzerenName(String fuzerenName) {
        this.fuzerenName = fuzerenName;
    }
    /**
	 * 获取：公司负责人手机号
	 */
    public String getFuzerenIdNumber() {
        return fuzerenIdNumber;
    }


    /**
	 * 设置：公司负责人手机号
	 */
    public void setFuzerenIdNumber(String fuzerenIdNumber) {
        this.fuzerenIdNumber = fuzerenIdNumber;
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
	 * 获取：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
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
