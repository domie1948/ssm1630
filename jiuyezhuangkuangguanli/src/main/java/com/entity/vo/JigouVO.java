package com.entity.vo;

import com.entity.JigouEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 机构人员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-17
 */
@TableName("jigou")
public class JigouVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 姓名
     */

    @TableField(value = "jigou_name")
    private String jigouName;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 照片
     */

    @TableField(value = "jigou_photo")
    private String jigouPhoto;


    /**
     * 出生日期
     */

    @TableField(value = "jigou_chushengriqi")
    private String jigouChushengriqi;


    /**
     * 民族
     */

    @TableField(value = "jigou_nation")
    private String jigouNation;


    /**
     * 政治面貌
     */

    @TableField(value = "politics_types")
    private Integer politicsTypes;


    /**
     * 工作单位
     */

    @TableField(value = "danwei")
    private String danwei;


    /**
     * 工作部门
     */

    @TableField(value = "bumen_types")
    private Integer bumenTypes;


    /**
     * 担任职位
     */

    @TableField(value = "zhiwei_types")
    private Integer zhiweiTypes;


    /**
     * 身份证号
     */

    @TableField(value = "jigou_id_number")
    private String jigouIdNumber;


    /**
     * 手机号
     */

    @TableField(value = "jigou_phone")
    private String jigouPhone;


    /**
     * 家庭住址
     */

    @TableField(value = "jigou_address")
    private String jigouAddress;


    /**
     * 邮政编码
     */

    @TableField(value = "jigou_youzhengbianma")
    private String jigouYouzhengbianma;


    /**
     * 个人爱好
     */

    @TableField(value = "jigou_aihao_content")
    private String jigouAihaoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：姓名
	 */
    public String getJigouName() {
        return jigouName;
    }


    /**
	 * 获取：姓名
	 */

    public void setJigouName(String jigouName) {
        this.jigouName = jigouName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：照片
	 */
    public String getJigouPhoto() {
        return jigouPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setJigouPhoto(String jigouPhoto) {
        this.jigouPhoto = jigouPhoto;
    }
    /**
	 * 设置：出生日期
	 */
    public String getJigouChushengriqi() {
        return jigouChushengriqi;
    }


    /**
	 * 获取：出生日期
	 */

    public void setJigouChushengriqi(String jigouChushengriqi) {
        this.jigouChushengriqi = jigouChushengriqi;
    }
    /**
	 * 设置：民族
	 */
    public String getJigouNation() {
        return jigouNation;
    }


    /**
	 * 获取：民族
	 */

    public void setJigouNation(String jigouNation) {
        this.jigouNation = jigouNation;
    }
    /**
	 * 设置：政治面貌
	 */
    public Integer getPoliticsTypes() {
        return politicsTypes;
    }


    /**
	 * 获取：政治面貌
	 */

    public void setPoliticsTypes(Integer politicsTypes) {
        this.politicsTypes = politicsTypes;
    }
    /**
	 * 设置：工作单位
	 */
    public String getDanwei() {
        return danwei;
    }


    /**
	 * 获取：工作单位
	 */

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }
    /**
	 * 设置：工作部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：工作部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：担任职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 获取：担任职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getJigouIdNumber() {
        return jigouIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setJigouIdNumber(String jigouIdNumber) {
        this.jigouIdNumber = jigouIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getJigouPhone() {
        return jigouPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setJigouPhone(String jigouPhone) {
        this.jigouPhone = jigouPhone;
    }
    /**
	 * 设置：家庭住址
	 */
    public String getJigouAddress() {
        return jigouAddress;
    }


    /**
	 * 获取：家庭住址
	 */

    public void setJigouAddress(String jigouAddress) {
        this.jigouAddress = jigouAddress;
    }
    /**
	 * 设置：邮政编码
	 */
    public String getJigouYouzhengbianma() {
        return jigouYouzhengbianma;
    }


    /**
	 * 获取：邮政编码
	 */

    public void setJigouYouzhengbianma(String jigouYouzhengbianma) {
        this.jigouYouzhengbianma = jigouYouzhengbianma;
    }
    /**
	 * 设置：个人爱好
	 */
    public String getJigouAihaoContent() {
        return jigouAihaoContent;
    }


    /**
	 * 获取：个人爱好
	 */

    public void setJigouAihaoContent(String jigouAihaoContent) {
        this.jigouAihaoContent = jigouAihaoContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
