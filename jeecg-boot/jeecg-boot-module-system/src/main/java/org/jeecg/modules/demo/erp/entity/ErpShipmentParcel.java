package org.jeecg.modules.demo.erp.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: 包裹表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
@ApiModel(value="erp_shipment对象", description="订单表")
@Data
@TableName("erp_shipment_parcel")
public class ErpShipmentParcel implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ID_WORKER_STR)
	@ApiModelProperty(value = "主键")
	private String id;
	/**创建人*/
	@Excel(name = "创建人", width = 15)
	@ApiModelProperty(value = "创建人")
	private String createBy;
	/**创建日期*/
	@Excel(name = "创建日期", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "创建日期")
	private Date createTime;
	/**更新人*/
	@Excel(name = "更新人", width = 15)
	@ApiModelProperty(value = "更新人")
	private String updateBy;
	/**更新日期*/
	@Excel(name = "更新日期", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "更新日期")
	private Date updateTime;
	/**所属部门*/
	@Excel(name = "所属部门", width = 15)
	@ApiModelProperty(value = "所属部门")
	private String sysOrgCode;
	/**外联货箱ID*/
	@ApiModelProperty(value = "外联货箱ID")
	private String parcelOutboundId;
	/**主单id*/
	@ApiModelProperty(value = "主单id")
	private String shipmentId;
	/**系统包裹号*/
	@Excel(name = "系统包裹号", width = 15)
	@ApiModelProperty(value = "系统包裹号")
	private String parcelNo;
	/**客户包裹号*/
	@Excel(name = "客户包裹号", width = 15)
	@ApiModelProperty(value = "客户包裹号")
	private String parcelReference;
	/**体积重(KG)*/
	@Excel(name = "体积重(KG)", width = 15)
	@ApiModelProperty(value = "体积重(KG)")
	private java.math.BigDecimal volumeWeight;
	/**重量(KG)*/
	@Excel(name = "重量(KG)", width = 15)
	@ApiModelProperty(value = "重量(KG)")
	private java.math.BigDecimal weight;
	/**长(CM)*/
	@Excel(name = "长(CM)", width = 15)
	@ApiModelProperty(value = "长(CM)")
	private java.math.BigDecimal length;
	/**宽(CM)*/
	@Excel(name = "宽(CM)", width = 15)
	@ApiModelProperty(value = "宽(CM)")
	private java.math.BigDecimal width;
	/**高(CM)*/
	@Excel(name = "高(CM)", width = 15)
	@ApiModelProperty(value = "高(CM)")
	private java.math.BigDecimal height;
}
