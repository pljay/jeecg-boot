package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpShipmentParcel;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 包裹表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
public interface IErpShipmentParcelService extends IService<ErpShipmentParcel> {

	public List<ErpShipmentParcel> selectByMainId(String mainId);
}
