package org.jeecg.modules.demo.erp.handle.supplier.service.impl;

import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.Action;
import org.jeecg.modules.demo.erp.handle.supplier.service.HandleSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @author PLJay
 * 卓志大包服务
 */
@Service("ZZBPKG")
public class ZzBigPkgServiceImpl implements HandleSupplierService {

    @Autowired
    private Action action;

    @Override
    public Result <?> push(String id) {
        return  this.action.Create(id);
    }

    @Override
    public Result <?> submit(String id) {
        return Result.ok();
    }

    @Override
    public Result <?> delete(String id) {
        return Result.ok();
    }

    @Override
    public Result <?> track(String id) {
        return Result.ok();
    }

    @Override
    public Result <?> label(String id) {
        return Result.ok();
    }
}
