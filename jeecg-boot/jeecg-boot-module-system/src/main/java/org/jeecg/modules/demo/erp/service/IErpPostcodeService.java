package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpPostcode;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: erp_postcode
 * @Author: jeecg-boot
 * @Date:   2020-04-15
 * @Version: V1.0
 */
public interface IErpPostcodeService extends IService<ErpPostcode> {

    /**
     * 根据父节点获取所有叶子节点
     * @param id
     * @return
     */
    List<ErpPostcode> getLeafNodesByParentId(String id);

}
