package org.jeecg.erp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecgframework.poi.excel.annotation.Excel;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "erp_shipment")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ErpShipment implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "id")
    private String id ;
    @TableField(value = "create_by")
    private String create_by ;
    @TableField(value = "create_time")
    private String create_time ;
    @TableField(value = "update_by")
    private String update_by ;
    @TableField(value = "update_time")
    private String update_time ;
    @TableField(value = "sys_org_code")
    private String sys_org_code ;
    @TableField(value = "customer_refference")
    @Excel(name = "客户单号")
    private String customerRefference ;
    @TableField(value="shipment_no")
    @Excel(name = "客户单号")
    private String shipmentNo ;
    @TableField(value="service_id")
    @Excel(name = "服务id")
    private String serviceId ;
    @TableField(value="shipment_status")
    @Excel(name = "运单状态")
    private String shipmentStatus ;
    @TableField(value="cancel_time")
    @Excel(name = "撤销时间")
    private String cancel_time ;
    @TableField(value="shipper_id")
    @Excel(name = "发件人id")
    private String shipper_id ;
    @TableField(value="consignee_id")
    @Excel(name = "收件人id")
    private String consignee_id ;
    @TableField(value="shipment_remark")
    @Excel(name = "备注")
    private String shipment_remark ;

}
