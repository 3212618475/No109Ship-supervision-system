package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 监造财务
 *
 * @author 
 * @email
 */
@TableName("jianzaocaiwu")
public class JianzaocaiwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JianzaocaiwuEntity() {

	}

	public JianzaocaiwuEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 项目
     */
    @ColumnInfo(comment="项目",type="int(11)")
    @TableField(value = "xiangmu_id")

    private Integer xiangmuId;


    /**
     * 员工
     */
    @ColumnInfo(comment="员工",type="int(11)")
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 监造财务编号
     */
    @ColumnInfo(comment="监造财务编号",type="varchar(200)")
    @TableField(value = "jianzaocaiwu_uuid_number")

    private String jianzaocaiwuUuidNumber;


    /**
     * 花费标题
     */
    @ColumnInfo(comment="花费标题",type="varchar(200)")
    @TableField(value = "jianzaocaiwu_name")

    private String jianzaocaiwuName;


    /**
     * 消费类型
     */
    @ColumnInfo(comment="消费类型",type="int(11)")
    @TableField(value = "jianzaocaiwu_types")

    private Integer jianzaocaiwuTypes;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "jianzaojindu_file")

    private String jianzaojinduFile;


    /**
     * 名称
     */
    @ColumnInfo(comment="名称",type="varchar(200)")
    @TableField(value = "jianzaocaiwu_mingcheng")

    private String jianzaocaiwuMingcheng;


    /**
     * 单价
     */
    @ColumnInfo(comment="单价",type="decimal(10,2)")
    @TableField(value = "jianzaocaiwu_danjia")

    private Double jianzaocaiwuDanjia;


    /**
     * 数量
     */
    @ColumnInfo(comment="数量",type="int(11)")
    @TableField(value = "jianzaocaiwu_number")

    private Integer jianzaocaiwuNumber;


    /**
     * 应金额
     */
    @ColumnInfo(comment="应金额",type="decimal(10,2)")
    @TableField(value = "jianzaocaiwu_zongjine")

    private Double jianzaocaiwuZongjine;


    /**
     * 实际金额
     */
    @ColumnInfo(comment="实际金额",type="decimal(10,2)")
    @TableField(value = "jianzaocaiwu_shiji_zongjine")

    private Double jianzaocaiwuShijiZongjine;


    /**
     * 是否合格
     */
    @ColumnInfo(comment="是否合格",type="int(11)")
    @TableField(value = "hege_types")

    private Integer hegeTypes;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "jianzaocaiwu_content")

    private String jianzaocaiwuContent;


    /**
     * 验收时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="验收时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }
    /**
	 * 设置：项目
	 */

    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }
    /**
	 * 设置：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：监造财务编号
	 */
    public String getJianzaocaiwuUuidNumber() {
        return jianzaocaiwuUuidNumber;
    }
    /**
	 * 设置：监造财务编号
	 */

    public void setJianzaocaiwuUuidNumber(String jianzaocaiwuUuidNumber) {
        this.jianzaocaiwuUuidNumber = jianzaocaiwuUuidNumber;
    }
    /**
	 * 获取：花费标题
	 */
    public String getJianzaocaiwuName() {
        return jianzaocaiwuName;
    }
    /**
	 * 设置：花费标题
	 */

    public void setJianzaocaiwuName(String jianzaocaiwuName) {
        this.jianzaocaiwuName = jianzaocaiwuName;
    }
    /**
	 * 获取：消费类型
	 */
    public Integer getJianzaocaiwuTypes() {
        return jianzaocaiwuTypes;
    }
    /**
	 * 设置：消费类型
	 */

    public void setJianzaocaiwuTypes(Integer jianzaocaiwuTypes) {
        this.jianzaocaiwuTypes = jianzaocaiwuTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getJianzaojinduFile() {
        return jianzaojinduFile;
    }
    /**
	 * 设置：附件
	 */

    public void setJianzaojinduFile(String jianzaojinduFile) {
        this.jianzaojinduFile = jianzaojinduFile;
    }
    /**
	 * 获取：名称
	 */
    public String getJianzaocaiwuMingcheng() {
        return jianzaocaiwuMingcheng;
    }
    /**
	 * 设置：名称
	 */

    public void setJianzaocaiwuMingcheng(String jianzaocaiwuMingcheng) {
        this.jianzaocaiwuMingcheng = jianzaocaiwuMingcheng;
    }
    /**
	 * 获取：单价
	 */
    public Double getJianzaocaiwuDanjia() {
        return jianzaocaiwuDanjia;
    }
    /**
	 * 设置：单价
	 */

    public void setJianzaocaiwuDanjia(Double jianzaocaiwuDanjia) {
        this.jianzaocaiwuDanjia = jianzaocaiwuDanjia;
    }
    /**
	 * 获取：数量
	 */
    public Integer getJianzaocaiwuNumber() {
        return jianzaocaiwuNumber;
    }
    /**
	 * 设置：数量
	 */

    public void setJianzaocaiwuNumber(Integer jianzaocaiwuNumber) {
        this.jianzaocaiwuNumber = jianzaocaiwuNumber;
    }
    /**
	 * 获取：应金额
	 */
    public Double getJianzaocaiwuZongjine() {
        return jianzaocaiwuZongjine;
    }
    /**
	 * 设置：应金额
	 */

    public void setJianzaocaiwuZongjine(Double jianzaocaiwuZongjine) {
        this.jianzaocaiwuZongjine = jianzaocaiwuZongjine;
    }
    /**
	 * 获取：实际金额
	 */
    public Double getJianzaocaiwuShijiZongjine() {
        return jianzaocaiwuShijiZongjine;
    }
    /**
	 * 设置：实际金额
	 */

    public void setJianzaocaiwuShijiZongjine(Double jianzaocaiwuShijiZongjine) {
        this.jianzaocaiwuShijiZongjine = jianzaocaiwuShijiZongjine;
    }
    /**
	 * 获取：是否合格
	 */
    public Integer getHegeTypes() {
        return hegeTypes;
    }
    /**
	 * 设置：是否合格
	 */

    public void setHegeTypes(Integer hegeTypes) {
        this.hegeTypes = hegeTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getJianzaocaiwuContent() {
        return jianzaocaiwuContent;
    }
    /**
	 * 设置：备注
	 */

    public void setJianzaocaiwuContent(String jianzaocaiwuContent) {
        this.jianzaocaiwuContent = jianzaocaiwuContent;
    }
    /**
	 * 获取：验收时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：验收时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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

    @Override
    public String toString() {
        return "Jianzaocaiwu{" +
            ", id=" + id +
            ", xiangmuId=" + xiangmuId +
            ", yuangongId=" + yuangongId +
            ", jianzaocaiwuUuidNumber=" + jianzaocaiwuUuidNumber +
            ", jianzaocaiwuName=" + jianzaocaiwuName +
            ", jianzaocaiwuTypes=" + jianzaocaiwuTypes +
            ", jianzaojinduFile=" + jianzaojinduFile +
            ", jianzaocaiwuMingcheng=" + jianzaocaiwuMingcheng +
            ", jianzaocaiwuDanjia=" + jianzaocaiwuDanjia +
            ", jianzaocaiwuNumber=" + jianzaocaiwuNumber +
            ", jianzaocaiwuZongjine=" + jianzaocaiwuZongjine +
            ", jianzaocaiwuShijiZongjine=" + jianzaocaiwuShijiZongjine +
            ", hegeTypes=" + hegeTypes +
            ", jianzaocaiwuContent=" + jianzaocaiwuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
