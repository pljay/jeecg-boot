package org.jeecg.modules.demo.erp.vo;

import java.math.BigDecimal;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import org.jeecg.common.aspect.annotation.Dict;
import org.jeecg.modules.demo.erp.entity.*;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelEntity;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: 订单表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
@Data
@ApiModel(value="erp_shipmentPage对象", description="订单表")
public class ErpShipmentPage {

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
	/**客户单号*/
	@Excel(name = "客户单号", width = 15)
	@ApiModelProperty(value = "客户单号")
	private String customerReference;
	/**系统单号*/
	@Excel(name = "系统单号", width = 15)
	@ApiModelProperty(value = "系统单号")
	private String shipmentNo;
	/**订单状态*/
	@TableField(exist =false)
	private String shipmentStatus;
	/**服务*/
	@Excel(name = "服务", width = 15, dictTable = "erp_user_channel", dicText = "name", dicCode = "id")
	@Dict(dictTable = "erp_user_channel", dicText = "name", dicCode = "id")
	@ApiModelProperty(value = "服务")
	private String serviceId;
	/**用户*/
	@Excel(name = "用户", width = 15, dictTable = "sys_user", dicText = "realname", dicCode = "username")
	@Dict(dictTable = "sys_user", dicText = "realname", dicCode = "username")
	@ApiModelProperty(value = "用户")
	private String username;
	/**贸易类型*/
	@Excel(name = "贸易类型", width = 15, dicCode = "trade_type")
	@Dict(dicCode = "trade_type")
	@ApiModelProperty(value = "贸易类型")
	private String tradeType;
	/**货物类型*/
	@Excel(name = "货物类型", width = 15, dicCode = "cargo_type")
	@Dict(dicCode = "cargo_type")
	@ApiModelProperty(value = "货物类型")
	private String cargoType;
	/**清关方法*/
	@Excel(name = "清关方法", width = 15, dicCode = "cc_method")
	@Dict(dicCode = "cc_method")
	@ApiModelProperty(value = "清关方法")
	private String ccType;
	/**报关方法*/
	@Excel(name = "报关方法", width = 15, dicCode = "cd_method")
	@Dict(dicCode = "cd_method")
	@ApiModelProperty(value = "报关方法")
	private String cdType;
	/**交税方式*/
	@Excel(name = "交税方式", width = 15, dicCode = "tax_mode")
	@Dict(dicCode = "tax_mode")
	@ApiModelProperty(value = "交税方式")
	private String taxMode;
	/**税号*/
	@Excel(name = "税号", width = 15)
	@ApiModelProperty(value = "税号")
	private String taxNo;
	/**发件人名称*/
	@Excel(name = "发件人名称", width = 15)
	@ApiModelProperty(value = "发件人名称")
	private String shipperName;
	/**发件人公司*/
	@Excel(name = "发件人公司", width = 15)
	@ApiModelProperty(value = "发件人公司")
	private String shipperCompany;
	/**发件人手机号*/
	@Excel(name = "发件人手机号", width = 15)
	@ApiModelProperty(value = "发件人手机号")
	private java.lang.String shipperTelephone;
	/**发件人电话号*/
	@Excel(name = "发件人电话号", width = 15)
	@ApiModelProperty(value = "发件人电话号")
	private java.lang.String shipperMobile;
	/**发件人邮箱*/
	@Excel(name = "发件人邮箱", width = 15)
	@ApiModelProperty(value = "发件人邮箱")
	private java.lang.String shipperEmail;
	/**发件人国家(大写二字简码)*/
	@Excel(name = "发件人国家(大写二字简码)", width = 15)
	@ApiModelProperty(value = "发件人国家(大写二字简码)")
	private String shipperCountry;
	/**发件人省(州)*/
	@Excel(name = "发件人省(州)", width = 15)
	@ApiModelProperty(value = "发件人省(州)")
	private String shipperState;
	/**发件人城市*/
	@Excel(name = "发件人城市", width = 15)
	@ApiModelProperty(value = "发件人城市")
	private String shipperCity;
	/**发件人地址*/
	@Excel(name = "发件人地址", width = 15)
	@ApiModelProperty(value = "发件人地址")
	private String shipperAddress;
	/**发件人街道*/
	@Excel(name = "发件人街道", width = 15)
	@ApiModelProperty(value = "发件人街道")
	private String shipperStreet;
	/**发件人邮编*/
	@Excel(name = "发件人邮编", width = 15)
	@ApiModelProperty(value = "发件人邮编")
	private String shipperPostcode;
	/**收件人姓名*/
	@Excel(name = "收件人姓名", width = 15)
	@ApiModelProperty(value = "收件人姓名")
	private String consigneeName;
	/**收件人公司*/
	@Excel(name = "收件人公司", width = 15)
	@ApiModelProperty(value = "收件人公司")
	private String consigneeCompany;
	/**收件人手机号*/
	@Excel(name = "收件人手机号", width = 15)
	@ApiModelProperty(value = "收件人手机号")
	private java.lang.String consigneeTelephone;
	/**收件人电话号*/
	@Excel(name = "收件人电话号", width = 15)
	@ApiModelProperty(value = "收件人电话号")
	private java.lang.String consigneeMobile;
	/**收件人邮箱*/
	@Excel(name = "收件人邮箱", width = 15)
	@ApiModelProperty(value = "收件人邮箱")
	private java.lang.String consigneeEmail;
	/**收件人国家(大写二字简码)*/
	@Excel(name = "收件人国家(大写二字简码)", width = 15)
	@ApiModelProperty(value = "收件人国家(大写二字简码)")
	private String consigneeCountry;
	/**收件人省/州*/
	@Excel(name = "收件人省/州", width = 15)
	@ApiModelProperty(value = "收件人省/州")
	private String consigneeState;
	/**收件人城市*/
	@Excel(name = "收件人城市", width = 15)
	@ApiModelProperty(value = "收件人城市")
	private String consigneeCity;
	/**收件人地址1*/
	@Excel(name = "收件人地址1", width = 15)
	@ApiModelProperty(value = "收件人地址1")
	private String consigneeAddress1;
	/**收件人地址2*/
	@Excel(name = "收件人地址2", width = 15)
	@ApiModelProperty(value = "收件人地址2")
	private String consigneeAddress2;
	/**收件人街道*/
	@Excel(name = "收件人街道", width = 15)
	@ApiModelProperty(value = "收件人街道")
	private String consigneeStreet;
	/**收件人楼号*/
	@Excel(name = "收件人楼号", width = 15)
	@ApiModelProperty(value = "收件人楼号")
	private String consigneeHouse;
	/**收件人邮编*/
	@Excel(name = "收件人邮编", width = 15)
	@ApiModelProperty(value = "收件人邮编")
	private String consigneePostcode;
	/**包裹数量*/
	@Excel(name = "包裹数量", width = 15)
	@ApiModelProperty(value = "包裹数量")
	private Integer shipmentQuantity;
	/**订单总重*/
	@Excel(name = "订单总重", width = 15)
	@ApiModelProperty(value = "订单总重")
	private BigDecimal shipmentWeight;

	@ExcelCollection(name="包裹表")
	@ApiModelProperty(value = "包裹表")
	private List<ErpShipmentParcel> erpShipmentParcelList;
	@ExcelCollection(name="产品表")
	@ApiModelProperty(value = "产品表")
	private List<ErpShipmentProduct> erpShipmentProductList;

}
