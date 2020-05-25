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
 * @Description: 用户渠道表
 * @Author: jeecg-boot
 * @Date:   2020-04-24
 * @Version: V1.0
 */
@Data
@TableName("erp_user_channel")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="erp_user_channel对象", description="用户渠道表")
public class ErpUserChannel implements Serializable {
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
	/**用户名称*/
	@Excel(name = "用户名称", width = 15, dictTable = "sys_user", dicText = "realname", dicCode = "username")
	@Dict(dictTable = "sys_user", dicText = "realname", dicCode = "username")
    @ApiModelProperty(value = "用户名称")
    private String username;
	/**渠道名称*/
	@Excel(name = "渠道名称", width = 15, dictTable = "erp_channel", dicText = "channel_name", dicCode = "id")
	@Dict(dictTable = "erp_channel", dicText = "channel_name", dicCode = "id")
    @ApiModelProperty(value = "渠道名称")
    private String channelId;
	/**服务代码*/
	@Excel(name = "服务代码", width = 15)
    @ApiModelProperty(value = "服务代码")
    private String code;
	/**服务名称*/
	@Excel(name = "服务名称", width = 15)
    @ApiModelProperty(value = "服务名称")
    private String name;
	/**标签格式*/
	@Excel(name = "标签格式", width = 15, dicCode = "label_format")
	@Dict(dicCode = "label_format")
    @ApiModelProperty(value = "标签格式")
    private Integer labelFormat;
	/**标签大小*/
	@Excel(name = "标签大小", width = 15, dicCode = "label_size")
	@Dict(dicCode = "label_size")
    @ApiModelProperty(value = "标签大小")
    private Integer labelSize;
	/**标签来源*/
	@Excel(name = "标签来源", width = 15, dicCode = "label_source")
	@Dict(dicCode = "label_source")
    @ApiModelProperty(value = "标签来源")
    private Integer labelSource;
	/**状态*/
	@Excel(name = "状态", width = 15, dicCode = "channel_status")
	@Dict(dicCode = "channel_status")
    @ApiModelProperty(value = "状态")
    private Integer status;
	/**运费成本*/
	@Excel(name = "运费成本", width = 15, dictTable = "erp_freight_cost", dicText = "name", dicCode = "id")
	@Dict(dictTable = "erp_freight_cost", dicText = "name", dicCode = "id")
    @ApiModelProperty(value = "运费成本")
    private String freightCostId;
	/**运费报价*/
	@Excel(name = "运费报价", width = 15, dictTable = "erp_freight_quote", dicText = "name", dicCode = "id")
	@Dict(dictTable = "erp_freight_quote", dicText = "name", dicCode = "id")
    @ApiModelProperty(value = "运费报价")
    private String freightQuoteId;
}
