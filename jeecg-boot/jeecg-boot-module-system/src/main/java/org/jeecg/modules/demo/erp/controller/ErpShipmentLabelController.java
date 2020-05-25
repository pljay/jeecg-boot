package org.jeecg.modules.demo.erp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.demo.erp.entity.ErpShipmentLabel;
import org.jeecg.modules.demo.erp.service.IErpShipmentLabelService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;
import org.jeecg.common.system.base.controller.JeecgController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jeecg.common.aspect.annotation.AutoLog;

 /**
 * @Description: label表
 * @Author: jeecg-boot
 * @Date:   2020-05-06
 * @Version: V1.0
 */
@Api(tags="label表 ")
@RestController
@RequestMapping("/erp/shipmentLabel")
@Slf4j
public class ErpShipmentLabelController extends JeecgController<ErpShipmentLabel, IErpShipmentLabelService> {
	@Autowired
	private IErpShipmentLabelService erpShipmentLabelService;

	/**
	 * 分页列表查询
	 *
	 * @param erpShipmentLabel
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "label表 -分页列表查询")
	@ApiOperation(value="label表 -分页列表查询", notes="label表 -分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpShipmentLabel erpShipmentLabel,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpShipmentLabel> queryWrapper = QueryGenerator.initQueryWrapper(erpShipmentLabel, req.getParameterMap());
		Page<ErpShipmentLabel> page = new Page<ErpShipmentLabel>(pageNo, pageSize);
		IPage<ErpShipmentLabel> pageList = erpShipmentLabelService.page(page, queryWrapper);
		return Result.ok(pageList);
	}

	/**
	 *   添加
	 *
	 * @param erpShipmentLabel
	 * @return
	 */
	@AutoLog(value = "label表 -添加")
	@ApiOperation(value="label表 -添加", notes="label表 -添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody ErpShipmentLabel erpShipmentLabel) {
		erpShipmentLabelService.save(erpShipmentLabel);
		return Result.ok("添加成功！");
	}

	/**
	 *  编辑
	 *
	 * @param erpShipmentLabel
	 * @return
	 */
	@AutoLog(value = "label表 -编辑")
	@ApiOperation(value="label表 -编辑", notes="label表 -编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody ErpShipmentLabel erpShipmentLabel) {
		erpShipmentLabelService.updateById(erpShipmentLabel);
		return Result.ok("编辑成功!");
	}

	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "label表 -通过id删除")
	@ApiOperation(value="label表 -通过id删除", notes="label表 -通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		erpShipmentLabelService.removeById(id);
		return Result.ok("删除成功!");
	}

	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "label表 -批量删除")
	@ApiOperation(value="label表 -批量删除", notes="label表 -批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.erpShipmentLabelService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功!");
	}

	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "label表 -通过id查询")
	@ApiOperation(value="label表 -通过id查询", notes="label表 -通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		ErpShipmentLabel erpShipmentLabel = erpShipmentLabelService.getById(id);
		if(erpShipmentLabel==null) {
			return Result.error("未找到对应数据");
		}
		return Result.ok(erpShipmentLabel);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param erpShipmentLabel
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpShipmentLabel erpShipmentLabel) {
        return super.exportXls(request, erpShipmentLabel, ErpShipmentLabel.class, "label表 ");
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
        return super.importExcel(request, response, ErpShipmentLabel.class);
    }

}
