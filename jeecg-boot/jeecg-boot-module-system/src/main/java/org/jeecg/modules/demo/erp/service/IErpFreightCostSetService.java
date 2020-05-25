package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpFreightCostSet;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 运费成本配置表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
public interface IErpFreightCostSetService extends IService<ErpFreightCostSet> {

	public List<ErpFreightCostSet> selectByMainId(String mainId);
}
