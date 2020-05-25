package org.jeecg.modules.demo.erp.handle.supplier.service.impl;

import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.Action;
import org.jeecg.modules.demo.erp.handle.supplier.service.HandleSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.xml.soap.SOAPException;
import java.rmi.RemoteException;
import java.util.concurrent.Future;

/**
 * @author PLJay
 * @date 2020年4月27日
 * @apiNote 德国dpd接口实现
 */
@Service("DPDDE")

public class DeDpdImpl implements HandleSupplierService  {

    @Autowired
    private Action action;

    @Override
    public Result <?> push(String id) {
       return this.action.Create(id);
    }

    @Override
    public Result <?> submit(String id) {
        return null;
    }

    @Override
    public Result <?> delete(String id) {
        return null;
    }

    @Override
    public Result <?> track(String id) {
        return null;
    }

    @Override
    public Result <?> label(String id) {
        return null;
    }
}
