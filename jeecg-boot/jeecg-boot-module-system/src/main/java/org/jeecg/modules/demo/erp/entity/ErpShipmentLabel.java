package org.jeecg.modules.demo.erp.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: label表
 * @Author: jeecg-boot
 * @Date:   2020-05-06
 * @Version: V1.0
 */
@Data
@TableName("erp_shipment_label")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="erp_shipment_label对象", description="label表 ")
public class ErpShipmentLabel implements Serializable {
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
	/**订单编号*/
	@Excel(name = "订单编号", width = 15, dictTable = "erp_shipment", dicText = "shipment_no", dicCode = "id")
	@Dict(dictTable = "erp_shipment", dicText = "shipment_no", dicCode = "id")
    @ApiModelProperty(value = "订单编号")
    private String shipmentId;
	/**包裹编号*/
	@Excel(name = "包裹编号", width = 15, dictTable = "erp_shipment_parcel", dicText = "parcel_no", dicCode = "id")
	@Dict(dictTable = "erp_shipment_parcel", dicText = "parcel_no", dicCode = "id")
    @ApiModelProperty(value = "包裹编号")
    private String parcelId;
	/**派送单号*/
	@Excel(name = "派送单号", width = 15)
    @ApiModelProperty(value = "派送单号")
    private String trackNumber;
	/**标签类型*/
	@Excel(name = "标签类型", width = 15)
    @ApiModelProperty(value = "标签类型")
    private String labelType;
	/**内容*/
	@Excel(name = "内容", width = 15)
    @ApiModelProperty(value = "内容")
    private String content;
}
