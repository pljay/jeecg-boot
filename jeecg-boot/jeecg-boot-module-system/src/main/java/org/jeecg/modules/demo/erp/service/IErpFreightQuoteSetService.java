package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpFreightQuoteSet;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 运费报价配置表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
public interface IErpFreightQuoteSetService extends IService<ErpFreightQuoteSet> {

	public List<ErpFreightQuoteSet> selectByMainId(String mainId);
}
