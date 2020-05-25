package org.jeecg.modules.demo.erp.handle.shipment.serivce;

import org.jeecg.common.api.vo.Result;
import org.jeecg.common.entity.HkdBootConstant;
import org.jeecg.modules.demo.erp.entity.ErpFreight;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author PLJay
 * @date 2020年4月30日
 * @apiNote 订单id注入对应supplierServiceImpl
 */
public interface HandleShipmentService {


    /**
     * 订单推送
     * 服务商
     * 返回值
     * api 同步
     * @param id
     * @return Result
     * @throws ExecutionException
     * @throws InterruptedException
     */
    Result<?> syncPush(String id);

    /**
     * 订单推送
     * 服务商
     * 无返回值
     * web
     * @param id 订单id
     * @return
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    void push(String id);


    /**
     * 计算运费（成本报价）
     * @param id 订单id
     * @return
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    void calculateFreight(String id);
    /**
     * 订单确认提交
     * 生成manifest(可选服务)
     * @param id 订单id
     * @return
     */
    Result<?> submit(String id);


    /**
     * 订单删除
     * (可选服务)
     * 服务商
     * @param id 订单id
     * @return
     */
    Result<?> delete(String id);


    /**
     * 订单跟踪
     * (可选服务)
     * @param id 订单id
     * @return
     */
    Result<?> track(String id);


    /**
     * 获取面单
     * (可选服务)
     * @param id 订单id
     * @return
     */
    Result<?> label(String id);

}
