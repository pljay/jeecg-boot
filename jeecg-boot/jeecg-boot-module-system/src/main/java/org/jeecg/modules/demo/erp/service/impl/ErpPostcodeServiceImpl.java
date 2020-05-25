package org.jeecg.modules.demo.erp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.demo.erp.entity.ErpPostcode;
import org.jeecg.modules.demo.erp.mapper.ErpPostcodeMapper;
import org.jeecg.modules.demo.erp.service.IErpPostcodeService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: erp_postcode
 * @Author: jeecg-boot
 * @Date:   2020-04-15
 * @Version: V1.0
 */
@Slf4j
@Service
public class ErpPostcodeServiceImpl extends ServiceImpl<ErpPostcodeMapper, ErpPostcode> implements IErpPostcodeService {

    @Override
    public List<ErpPostcode> getLeafNodesByParentId(String id) {
        return this.queryLeafNodesByParentId(new ArrayList <ErpPostcode>(),id);
    }

    /**
     * 查询子节点
     * @param list
     * @param id
     * @return
     */
    private List<ErpPostcode> queryLeafNodesByParentId(List<ErpPostcode> list,String id){
        ErpPostcode erpPostcode = this.getById(id);

        //判断是否是邮编类型 即是叶子节点
        if(4==erpPostcode.getAreaType()){
            //加入自身节点
            list.add(erpPostcode);
        }else{
            List <ErpPostcode> selectList = this.baseMapper.selectList(new QueryWrapper <ErpPostcode>().eq("pid", erpPostcode.getId()));
            if(!CollectionUtils.isEmpty(selectList)){
                for (ErpPostcode postcode:selectList) {
                    this.queryLeafNodesByParentId(list,postcode.getId());
                }
            }
        }
        return list;
    }

}
