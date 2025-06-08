package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 就业信息
 *
 * @author 
 * @email
 * @date 2021-03-17
 */
@TableName("jiuye")
public class JiuyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiuyeEntity() {

	}

	public JiuyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 是否就业
     */
    @TableField(value = "jiuye_types")

    private Integer jiuyeTypes;


    /**
     * 就业地区
     */
    @TableField(value = "diqu_types")

    private Integer diquTypes;


    /**
     * 公司名称
     */
    @TableField(value = "gongsi_name")

    private String gongsiName;


    /**
     * 公司负责人姓名
     */
    @TableField(value = "fuzeren_name")

    private String fuzerenName;


    /**
     * 公司负责人手机号
     */
    @TableField(value = "fuzeren_id_number")

    private String fuzerenIdNumber;


    /**
     * 担任职位
     */
    @TableField(value = "zhiwei_types")

    private Integer zhiweiTypes;


    /**
     * 备注
     */
    @TableField(value = "beizhu_content")

    private String beizhuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：是否就业
	 */
    public Integer getJiuyeTypes() {
        return jiuyeTypes;
    }


    /**
	 * 获取：是否就业
	 */

    public void setJiuyeTypes(Integer jiuyeTypes) {
        this.jiuyeTypes = jiuyeTypes;
    }
    /**
	 * 设置：就业地区
	 */
    public Integer getDiquTypes() {
        return diquTypes;
    }


    /**
	 * 获取：就业地区
	 */

    public void setDiquTypes(Integer diquTypes) {
        this.diquTypes = diquTypes;
    }
    /**
	 * 设置：公司名称
	 */
    public String getGongsiName() {
        return gongsiName;
    }


    /**
	 * 获取：公司名称
	 */

    public void setGongsiName(String gongsiName) {
        this.gongsiName = gongsiName;
    }
    /**
	 * 设置：公司负责人姓名
	 */
    public String getFuzerenName() {
        return fuzerenName;
    }


    /**
	 * 获取：公司负责人姓名
	 */

    public void setFuzerenName(String fuzerenName) {
        this.fuzerenName = fuzerenName;
    }
    /**
	 * 设置：公司负责人手机号
	 */
    public String getFuzerenIdNumber() {
        return fuzerenIdNumber;
    }


    /**
	 * 获取：公司负责人手机号
	 */

    public void setFuzerenIdNumber(String fuzerenIdNumber) {
        this.fuzerenIdNumber = fuzerenIdNumber;
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
	 * 设置：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
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

    @Override
    public String toString() {
        return "Jiuye{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiuyeTypes=" + jiuyeTypes +
            ", diquTypes=" + diquTypes +
            ", gongsiName=" + gongsiName +
            ", fuzerenName=" + fuzerenName +
            ", fuzerenIdNumber=" + fuzerenIdNumber +
            ", zhiweiTypes=" + zhiweiTypes +
            ", beizhuContent=" + beizhuContent +
            ", createTime=" + createTime +
        "}";
    }
}
