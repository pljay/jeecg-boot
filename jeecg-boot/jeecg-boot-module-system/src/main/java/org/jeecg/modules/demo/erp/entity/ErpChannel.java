package org.jeecg.modules.demo.erp.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.jeecg.common.aspect.annotation.Dict;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import java.util.Date;

/**
 * @Description: 渠道列表
 * @Author: jeecg-boot
 * @Date:   2020-05-08
 * @Version: V1.0
 */
@Data
@TableName("erp_channel")
public class ErpChannel implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ID_WORKER_STR)
	private String id;
	/**创建人*/
	@Excel(name = "创建人", width = 15)
	private String createBy;
	/**创建日期*/
	@Excel(name = "创建日期", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	/**更新人*/
	@Excel(name = "更新人", width = 15)
	private String updateBy;
	/**更新日期*/
	@Excel(name = "更新日期", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	/**所属部门*/
	@Excel(name = "所属部门", width = 15)
	private String sysOrgCode;
	/**供应商id*/
	@Excel(name = "供应商id", width = 15)
	private String supplierId;
	/**渠道名称*/
	@Excel(name = "渠道名称", width = 15)
	private String channelName;
	/**渠道代码*/
	@Excel(name = "渠道代码", width = 15)
	private String channelCode;
	/**access_token*/
	@Excel(name = "access_token", width = 15)
	private String accessToken;
	/**refresh_token*/
	@Excel(name = "refresh_token", width = 15)
	private String refreshToken;
	/**配置内容*/
	@Excel(name = "配置内容", width = 15)
	private String content;
	/**一票多件*/
	@Excel(name = "一票多件", width = 15)
    @Dict(dicCode = "judgment_status")
	private String multipleTickets;
	/**渠道分区*/
    @Dict(dicCode = "id",dicText = "name",dictTable = "erp_partition")
	private String partitionId;
}
