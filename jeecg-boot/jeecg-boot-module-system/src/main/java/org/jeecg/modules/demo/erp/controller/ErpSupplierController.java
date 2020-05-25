package org.jeecg.modules.demo.erp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.demo.erp.entity.ErpChannel;
import org.jeecg.modules.demo.erp.entity.ErpSupplier;
import org.jeecg.modules.demo.erp.service.IErpChannelService;
import org.jeecg.modules.demo.erp.service.IErpSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;


 /**
 * @Description: 供应商表
 * @Author: jeecg-boot
 * @Date:   2020-03-25
 * @Version: V1.0
 */
@RestController
@RequestMapping("/erp/supplier")
@Slf4j
public class ErpSupplierController extends JeecgController<ErpSupplier, IErpSupplierService> {

	@Autowired
	private IErpSupplierService erpSupplierService;

	@Autowired
	private IErpChannelService erpChannelService;


	/*---------------------------------主表处理-begin-------------------------------------*/

	/**
	 * 分页列表查询
	 * @param erpSupplier
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpSupplier erpSupplier,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpSupplier> queryWrapper = QueryGenerator.initQueryWrapper(erpSupplier, req.getParameterMap());
		Page<ErpSupplier> page = new Page<ErpSupplier>(pageNo, pageSize);
		IPage<ErpSupplier> pageList = erpSupplierService.page(page, queryWrapper);
		return Result.ok(pageList);
	}

	/**
     *   添加
     * @param erpSupplier
     * @return
     */
    @PostMapping(value = "/add")
    public Result<?> add(@RequestBody ErpSupplier erpSupplier) {
        erpSupplierService.save(erpSupplier);
        return Result.ok("添加成功！");
    }

    /**
     *  编辑
     * @param erpSupplier
     * @return
     */
    @PutMapping(value = "/edit")
    public Result<?> edit(@RequestBody ErpSupplier erpSupplier) {
        erpSupplierService.updateById(erpSupplier);
        return Result.ok("编辑成功!");
    }

    /**
     * 通过id删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete")
    public Result<?> delete(@RequestParam(name="id",required=true) String id) {
        erpSupplierService.delMain(id);
        return Result.ok("删除成功!");
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping(value = "/deleteBatch")
    public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
        this.erpSupplierService.delBatchMain(Arrays.asList(ids.split(",")));
        return Result.ok("批量删除成功!");
    }

    /**
     * 导出
     * @return
     */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpSupplier erpSupplier) {
        return super.exportXls(request, erpSupplier, ErpSupplier.class, "供应商表");
    }

    /**
     * 导入
     * @return
     */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, ErpSupplier.class);
    }
	/*---------------------------------主表处理-end-------------------------------------*/


    /*--------------------------------子表处理-渠道列表-begin----------------------------------------------*/
	/**
	 * 查询子表信息 会传入主表ID
	 * @return
	 */
	@GetMapping(value = "/listErpChannelByMainId")
    public Result<?> listErpChannelByMainId(ErpChannel erpChannel,
											@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
											@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
											HttpServletRequest req) {
        QueryWrapper<ErpChannel> queryWrapper = QueryGenerator.initQueryWrapper(erpChannel, req.getParameterMap());
        Page<ErpChannel> page = new Page<ErpChannel>(pageNo, pageSize);
        IPage<ErpChannel> pageList = erpChannelService.page(page, queryWrapper);
        return Result.ok(pageList);
    }

	/**
	 * 添加
	 * @param erpChannel
	 * @return
	 */
	@PostMapping(value = "/addErpChannel")
	public Result<?> addErpChannel(@RequestBody ErpChannel erpChannel) {
		erpChannelService.save(erpChannel);
		return Result.ok("添加成功！");
	}

    /**
	 * 编辑
	 * @param erpChannel
	 * @return
	 */
	@PutMapping(value = "/editErpChannel")
	public Result<?> editErpChannel(@RequestBody ErpChannel erpChannel) {
		erpChannelService.updateById(erpChannel);
		return Result.ok("编辑成功!");
	}

	/**
	 * 通过id删除
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/deleteErpChannel")
	public Result<?> deleteErpChannel(@RequestParam(name="id",required=true) String id) {
		erpChannelService.removeById(id);
		return Result.ok("删除成功!");
	}

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@DeleteMapping(value = "/deleteBatchErpChannel")
	public Result<?> deleteBatchErpChannel(@RequestParam(name="ids",required=true) String ids) {
		this.erpChannelService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功!");
	}

    /*--------------------------------子表处理-渠道列表-end----------------------------------------------*/




}
