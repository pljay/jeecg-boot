package org.jeecg.modules.demo.erp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.entity.HkdBootConstant;
import org.jeecg.modules.demo.erp.entity.ErpPartitionArea;
import org.jeecg.modules.demo.erp.entity.ErpPartitionSet;
import org.jeecg.modules.demo.erp.entity.ErpPostcode;
import org.jeecg.modules.demo.erp.mapper.ErpPartitionAreaMapper;
import org.jeecg.modules.demo.erp.service.IErpPartitionAreaService;
import org.jeecg.modules.demo.erp.service.IErpPartitionService;
import org.jeecg.modules.demo.erp.service.IErpPartitionSetService;
import org.jeecg.modules.demo.erp.service.IErpPostcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 分区区域关系表
 * @Author: jeecg-boot
 * @Date:   2020-04-24
 * @Version: V1.0
 */
@Slf4j
@Service
public class ErpPartitionAreaServiceImpl extends ServiceImpl<ErpPartitionAreaMapper, ErpPartitionArea> implements IErpPartitionAreaService {

    @Autowired
    private IErpPostcodeService erpPostcodeService;
    @Autowired
    private IErpPartitionSetService iErpPartitionSetService;
    @Override
    public void partitionAreaSave(ErpPartitionArea erpPartitionArea) {
        ErpPartitionSet partitionSet = this.iErpPartitionSetService.getById(erpPartitionArea.getPartitionSetId());
        String ids = erpPartitionArea.getPostcodeId();
        String[] split = ids.split(",");
        for (int i=0;i<split.length;i++) {
            log.info("开始执行主异步线程");
            this.asyncPartitionAreaSave(split[i],erpPartitionArea.getPartitionSetId(),partitionSet.getPartitionId());

        }
    }

    @Async(HkdBootConstant.ASYNC_POOL)
    void asyncPartitionAreaSave(String postcodeId,String partitionSetId,String partitionId){
        log.info("开始执行子异步线程");
        List<ErpPartitionArea> erpPartitionAreas = new ArrayList<>();
        List <ErpPostcode> leafNodes = this.erpPostcodeService.getLeafNodesByParentId(postcodeId);
        for (ErpPostcode postcode:leafNodes) {
            ErpPartitionArea partitionArea = new ErpPartitionArea();
            partitionArea.setPartitionSetId(partitionSetId);
            partitionArea.setPostcodeId(postcode.getId());
            partitionArea.setPartitionId(partitionId);
            erpPartitionAreas.add(partitionArea);
        }
        this.saveBatch(erpPartitionAreas);
    }

}
