package org.jeecg.modules.demo.erp.service;

import org.apache.poi.ss.formula.functions.T;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.entity.HkdBootConstant;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

/**
 * @author PLJay
 * @date  2020年4月27日
 * @apiNote 订单处理 erp统一内部操作
 */
public interface OrderHandleErpService {


    /**
     * 订单结算
     * (可选服务)
     * @param id
     * @return
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    Future<Result<T>> orderSettle(String id);


    /**
     * 订单付款
     * (可选服务)
     * @param id
     * @return
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    Future<Result<T>> orderPay(String id);
}
