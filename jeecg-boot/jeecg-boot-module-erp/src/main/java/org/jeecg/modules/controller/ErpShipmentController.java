package org.jeecg.modules.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.jeecg.modules.entity.ErpShipment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecg.common.system.query.QueryGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.jeecg.modules.service.IErpShipmentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

 /**
 * @Description: 运单表
 * @Author: jeecg-boot
 * @Date:   2020-05-26
 * @Version: V1.0
 */
@Api(tags="运单表")
@RestController
@RequestMapping("/shipmentTest/erpShipment")
@Slf4j
public class ErpShipmentController extends JeecgController<ErpShipment, IErpShipmentService> {
	@Autowired
	private IErpShipmentService erpShipmentService;

	/**
	 * 分页列表查询
	 *
	 * @param erpShipment
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "运单表-分页列表查询")
	@ApiOperation(value="运单表-分页列表查询", notes="运单表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpShipment erpShipment,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpShipment> queryWrapper = QueryGenerator.initQueryWrapper(erpShipment, req.getParameterMap());
		Page<ErpShipment> page = new Page<ErpShipment>(pageNo, pageSize);
		IPage<ErpShipment> pageList = erpShipmentService.page(page, queryWrapper);
		return Result.ok(pageList);
	}

	/**
	 *   添加
	 *
	 * @param erpShipment
	 * @return
	 */
	@AutoLog(value = "运单表-添加")
	@ApiOperation(value="运单表-添加", notes="运单表-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody ErpShipment erpShipment) {
		erpShipmentService.save(erpShipment);
		return Result.ok("添加成功！");
	}

	/**
	 *  编辑
	 *
	 * @param erpShipment
	 * @return
	 */
	@AutoLog(value = "运单表-编辑")
	@ApiOperation(value="运单表-编辑", notes="运单表-编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody ErpShipment erpShipment) {
		erpShipmentService.updateById(erpShipment);
		return Result.ok("编辑成功!");
	}

	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "运单表-通过id删除")
	@ApiOperation(value="运单表-通过id删除", notes="运单表-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		erpShipmentService.removeById(id);
		return Result.ok("删除成功!");
	}

	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "运单表-批量删除")
	@ApiOperation(value="运单表-批量删除", notes="运单表-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.erpShipmentService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功!");
	}

	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "运单表-通过id查询")
	@ApiOperation(value="运单表-通过id查询", notes="运单表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		ErpShipment erpShipment = erpShipmentService.getById(id);
		if(erpShipment==null) {
			return Result.error("未找到对应数据");
		}
		return Result.ok(erpShipment);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param erpShipment
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpShipment erpShipment) {
        return super.exportXls(request, erpShipment, ErpShipment.class, "运单表");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, ErpShipment.class);
    }

}
