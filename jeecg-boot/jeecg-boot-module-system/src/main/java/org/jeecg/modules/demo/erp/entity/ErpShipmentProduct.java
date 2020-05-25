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
 * @Description: 产品表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
@ApiModel(value="erp_shipment对象", description="订单表")
@Data
@TableName("erp_shipment_product")
public class ErpShipmentProduct implements Serializable {
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
	/**主单id*/
	@ApiModelProperty(value = "主单id")
	private String shipmentId;
	/**包裹编号*/
	@Excel(name = "包裹编号", width = 15)
	@ApiModelProperty(value = "包裹编号")
	private String parcelReference;
	/**SKU*/
	@Excel(name = "SKU", width = 15)
	@ApiModelProperty(value = "SKU")
	private String sku;
	/**国外SKU*/
	@Excel(name = "国外SKU", width = 15)
	@ApiModelProperty(value = "国外SKU")
	private String fgnSku;
	/**HSCODE*/
	@Excel(name = "HSCODE", width = 15)
	@ApiModelProperty(value = "HSCODE")
	private String hscode;
	/**国外SKU*/
	@Excel(name = "国外SKU", width = 15)
	@ApiModelProperty(value = "国外SKU")
	private String fgnHscode;
	/**中文品名*/
	@Excel(name = "中文品名", width = 15)
	@ApiModelProperty(value = "中文品名")
	private String cnName;
	/**英文品名*/
	@Excel(name = "英文品名", width = 15)
	@ApiModelProperty(value = "英文品名")
	private String enName;
	/**中文品牌名*/
	@Excel(name = "中文品牌名", width = 15)
	@ApiModelProperty(value = "中文品牌名")
	private String cnBrand;
	/**英文品牌名*/
	@Excel(name = "英文品牌名", width = 15)
	@ApiModelProperty(value = "英文品牌名")
	private String enBrand;
	/**中文材质*/
	@Excel(name = "中文材质", width = 15)
	@ApiModelProperty(value = "中文材质")
	private String cnMaterial;
	/**英文材质*/
	@Excel(name = "英文材质", width = 15)
	@ApiModelProperty(value = "英文材质")
	private String enMaterial;
	/**中文用途*/
	@Excel(name = "中文用途", width = 15)
	@ApiModelProperty(value = "中文用途")
	private String cnUsage;
	/**英文用途*/
	@Excel(name = "英文用途", width = 15)
	@ApiModelProperty(value = "英文用途")
	private String enUsage;
	/**中文规格型号*/
	@Excel(name = "中文规格型号", width = 15)
	@ApiModelProperty(value = "中文规格型号")
	private String cnModel;
	/**英文规格型号*/
	@Excel(name = "英文规格型号", width = 15)
	@ApiModelProperty(value = "英文规格型号")
	private String enModel;
	/**数量*/
	@Excel(name = "数量", width = 15)
	@ApiModelProperty(value = "数量")
	private Integer quantity;
	/**单价*/
	@Excel(name = "单价", width = 15)
	@ApiModelProperty(value = "单价")
	private java.math.BigDecimal unitPrice;
	/**单位重量*/
	@Excel(name = "单位重量", width = 15)
	@ApiModelProperty(value = "单位重量")
	private java.math.BigDecimal unitWeight;
}
