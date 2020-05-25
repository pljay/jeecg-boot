package org.jeecg.modules.demo.erp.handle.supplier.service;

import org.jeecg.common.api.vo.Result;
import org.jeecg.common.entity.HkdBootConstant;
import org.springframework.scheduling.annotation.Async;

import javax.xml.soap.SOAPException;
import java.rmi.RemoteException;
import java.util.concurrent.Future;


/**
 * @author PLJay
 * @date 2020年4月27日
 * @apiNote 管道供应商交互 订单处理
 */
public interface HandleSupplierService {



    /**
     * 无返回值直接推送
     * @param id
     */
    Result<?> push(String id);
    /**
     * 订单确认提交
     * 生成manifest(可选服务)
     * @param id
     * @return
     */
    Result<?> submit(String id);


    /**
     * 订单删除
     * (可选服务)
     * 服务商
     * @param id
     * @return
     */
    Result<?> delete(String id);


    /**
     * 订单跟踪
     * (可选服务)
     * @param id
     * @return
     */
    Result<?> track(String id);


    /**
     * 面单获取
     * (可选服务)
     * @param id
     * @return
     */
    Result<?> label(String id);

}
