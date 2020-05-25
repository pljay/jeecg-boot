package org.jeecg.modules.demo.erp.service;

import org.jeecg.common.entity.HkdBootConstant;
import org.jeecg.modules.demo.erp.entity.ErpPartitionArea;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.scheduling.annotation.Async;

/**
 * @Description: 分区区域关系表
 * @Author: jeecg-boot
 * @Date:   2020-04-24
 * @Version: V1.0
 */
public interface IErpPartitionAreaService extends IService<ErpPartitionArea> {

    /**
     *  保存邮编分区对应数据
      * @param erpPartitionArea
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    void partitionAreaSave(ErpPartitionArea erpPartitionArea );
}
