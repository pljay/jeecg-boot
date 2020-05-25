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
 * @Description: 订单日志表
 * @Author: jeecg-boot
 * @Date:   2020-04-09
 * @Version: V1.0
 */
@Data
@TableName("erp_shipment_log")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="erp_shipment_log对象", description="订单日志表")
public class ErpShipmentLog implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ID_WORKER_STR)
    @ApiModelProperty(value = "id")
    private String id;
	/**创建人*/
	@Excel(name = "创建人", width = 15)
    @ApiModelProperty(value = "创建人")
    private String createBy;
	/**创建日期*/
	@Excel(name = "创建日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "创建日期")
    private Date createTime;
	/**更新人*/
	@Excel(name = "更新人", width = 15)
    @ApiModelProperty(value = "更新人")
    private String updateBy;
	/**更新日期*/
	@Excel(name = "更新日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新日期")
    private Date updateTime;
	/**所属部门*/
	@Excel(name = "所属部门", width = 15)
    @ApiModelProperty(value = "所属部门")
    private String sysOrgCode;
	/**订单id*/
	@Excel(name = "系统编号", width = 15,dictTable ="erp_shipment" , dicCode = "id", dicText = "shipment_no")
    @Dict(dictTable ="erp_shipment" , dicCode = "id", dicText = "shipment_no")
    @ApiModelProperty(value = "订单id")
    private String shipmentId;
	/**时间*/
	@Excel(name = "时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "时间")
    private Date time;
	/**状态*/
	@Excel(name = "状态", width = 15, dicCode = "shipment_status")
	@Dict(dicCode = "shipment_status")
    @ApiModelProperty(value = "状态")
    private String shipmentStatus;
	/**状态描述*/
	@Excel(name = "状态描述", width = 15)
    @ApiModelProperty(value = "状态描述")
    private String statusDes;
	/**中文详情*/
	@Excel(name = "中文详情", width = 15)
    @ApiModelProperty(value = "中文详情")
    private String cnContent;
	/**英文详情*/
	@Excel(name = "英文详情", width = 15)
    @ApiModelProperty(value = "英文详情")
    private String enContent;
	/**目的国详情*/
	@Excel(name = "目的国详情", width = 15)
    @ApiModelProperty(value = "目的国详情")
    private String dnContent;
}
