package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpShipmentProduct;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 产品表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
public interface IErpShipmentProductService extends IService<ErpShipmentProduct> {

	public List<ErpShipmentProduct> selectByMainId(String mainId);
}
