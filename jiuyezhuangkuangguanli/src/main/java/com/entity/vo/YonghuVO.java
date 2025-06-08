package com.entity.vo;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-17
 */
@TableName("yonghu")
public class YonghuVO implements Serializable {
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

    @TableField(value = "name")
    private String name;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 照片
     */

    @TableField(value = "yonghu_photo")
    private String yonghuPhoto;


    /**
     * 出生日期
     */

    @TableField(value = "chushengriqi")
    private String chushengriqi;


    /**
     * 民族
     */

    @TableField(value = "nation")
    private String nation;


    /**
     * 政治面貌
     */

    @TableField(value = "politics_types")
    private Integer politicsTypes;


    /**
     * 学校
     */

    @TableField(value = "xuexiao_types")
    private Integer xuexiaoTypes;


    /**
     * 学院
     */

    @TableField(value = "xueyuan_types")
    private Integer xueyuanTypes;


    /**
     * 专业
     */

    @TableField(value = "zhuanye_types")
    private Integer zhuanyeTypes;


    /**
     * 班级
     */

    @TableField(value = "banji")
    private String banji;


    /**
     * 学号
     */

    @TableField(value = "xuehao")
    private String xuehao;


    /**
     * 身份证号
     */

    @TableField(value = "id_number")
    private String idNumber;


    /**
     * 手机号
     */

    @TableField(value = "phone")
    private String phone;


    /**
     * 家庭住址
     */

    @TableField(value = "address")
    private String address;


    /**
     * 邮箱
     */

    @TableField(value = "youxiang")
    private String youxiang;


    /**
     * 邮政编码
     */

    @TableField(value = "youzhengbianma")
    private String youzhengbianma;


    /**
     * 个人爱好
     */

    @TableField(value = "aihao_content")
    private String aihaoContent;


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
    public String getName() {
        return name;
    }


    /**
	 * 获取：姓名
	 */

    public void setName(String name) {
        this.name = name;
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
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：出生日期
	 */
    public String getChushengriqi() {
        return chushengriqi;
    }


    /**
	 * 获取：出生日期
	 */

    public void setChushengriqi(String chushengriqi) {
        this.chushengriqi = chushengriqi;
    }
    /**
	 * 设置：民族
	 */
    public String getNation() {
        return nation;
    }


    /**
	 * 获取：民族
	 */

    public void setNation(String nation) {
        this.nation = nation;
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
	 * 设置：学校
	 */
    public Integer getXuexiaoTypes() {
        return xuexiaoTypes;
    }


    /**
	 * 获取：学校
	 */

    public void setXuexiaoTypes(Integer xuexiaoTypes) {
        this.xuexiaoTypes = xuexiaoTypes;
    }
    /**
	 * 设置：学院
	 */
    public Integer getXueyuanTypes() {
        return xueyuanTypes;
    }


    /**
	 * 获取：学院
	 */

    public void setXueyuanTypes(Integer xueyuanTypes) {
        this.xueyuanTypes = xueyuanTypes;
    }
    /**
	 * 设置：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 获取：专业
	 */

    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 设置：班级
	 */
    public String getBanji() {
        return banji;
    }


    /**
	 * 获取：班级
	 */

    public void setBanji(String banji) {
        this.banji = banji;
    }
    /**
	 * 设置：学号
	 */
    public String getXuehao() {
        return xuehao;
    }


    /**
	 * 获取：学号
	 */

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }
    /**
	 * 设置：身份证号
	 */
    public String getIdNumber() {
        return idNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getPhone() {
        return phone;
    }


    /**
	 * 获取：手机号
	 */

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
	 * 设置：家庭住址
	 */
    public String getAddress() {
        return address;
    }


    /**
	 * 获取：家庭住址
	 */

    public void setAddress(String address) {
        this.address = address;
    }
    /**
	 * 设置：邮箱
	 */
    public String getYouxiang() {
        return youxiang;
    }


    /**
	 * 获取：邮箱
	 */

    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang;
    }
    /**
	 * 设置：邮政编码
	 */
    public String getYouzhengbianma() {
        return youzhengbianma;
    }


    /**
	 * 获取：邮政编码
	 */

    public void setYouzhengbianma(String youzhengbianma) {
        this.youzhengbianma = youzhengbianma;
    }
    /**
	 * 设置：个人爱好
	 */
    public String getAihaoContent() {
        return aihaoContent;
    }


    /**
	 * 获取：个人爱好
	 */

    public void setAihaoContent(String aihaoContent) {
        this.aihaoContent = aihaoContent;
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
