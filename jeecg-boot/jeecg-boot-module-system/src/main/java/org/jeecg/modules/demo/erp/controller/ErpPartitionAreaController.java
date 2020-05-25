package org.jeecg.modules.demo.erp.controller;

import java.util.*;
import java.util.stream.Collectors;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.hutool.core.thread.ThreadUtil;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.demo.erp.entity.ErpPartitionArea;
import org.jeecg.modules.demo.erp.entity.ErpPostcode;
import org.jeecg.modules.demo.erp.service.IErpPartitionAreaService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import org.jeecg.modules.demo.erp.service.IErpPostcodeService;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;
import org.jeecg.common.system.base.controller.JeecgController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jeecg.common.aspect.annotation.AutoLog;

 /**
 * @Description: 分区区域关系表
 * @Author: jeecg-boot
 * @Date:   2020-04-24
 * @Version: V1.0
 */
@Api(tags="分区区域关系表")
@RestController
@RequestMapping("/erp/partitionArea")
@Slf4j
public class ErpPartitionAreaController extends JeecgController<ErpPartitionArea, IErpPartitionAreaService> {
	@Autowired
	private IErpPartitionAreaService erpPartitionAreaService;

	@Autowired
	private IErpPostcodeService erpPostcodeService;
	/**
	 * 分页列表查询
	 *
	 * @param erpPartitionArea
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "分区区域关系表-分页列表查询")
	@ApiOperation(value="分区区域关系表-分页列表查询", notes="分区区域关系表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpPartitionArea erpPartitionArea,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpPartitionArea> queryWrapper = QueryGenerator.initQueryWrapper(erpPartitionArea, req.getParameterMap());
		Page<ErpPartitionArea> page = new Page<ErpPartitionArea>(pageNo, pageSize);
		IPage<ErpPartitionArea> pageList = erpPartitionAreaService.page(page, queryWrapper);
		return Result.ok(pageList);
	}

	/**
	 *   添加
	 *
	 * @param erpPartitionArea
	 * @return
	 */
	@AutoLog(value = "分区区域关系表-添加")
	@ApiOperation(value="分区区域关系表-添加", notes="分区区域关系表-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody ErpPartitionArea erpPartitionArea) {
		String ids = erpPartitionArea.getPostcodeId();
		String[] split = ids.split(",");
		if(split.length>0){
			this.erpPartitionAreaService.partitionAreaSave(erpPartitionArea);
        }else{
            throw new RuntimeException("所选节点为空");
        }
		return Result.ok("添加成功！");
	}

	/**
	 *  编辑
	 *
	 * @param erpPartitionArea
	 * @return
	 */
	@AutoLog(value = "分区区域关系表-编辑")
	@ApiOperation(value="分区区域关系表-编辑", notes="分区区域关系表-编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody ErpPartitionArea erpPartitionArea) {
		erpPartitionAreaService.updateById(erpPartitionArea);
		return Result.ok("编辑成功!");
	}

	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "分区区域关系表-通过id删除")
	@ApiOperation(value="分区区域关系表-通过id删除", notes="分区区域关系表-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		erpPartitionAreaService.removeById(id);
		return Result.ok("删除成功!");
	}

	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "分区区域关系表-批量删除")
	@ApiOperation(value="分区区域关系表-批量删除", notes="分区区域关系表-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.erpPartitionAreaService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功!");
	}

	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "分区区域关系表-通过id查询")
	@ApiOperation(value="分区区域关系表-通过id查询", notes="分区区域关系表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		ErpPartitionArea erpPartitionArea = erpPartitionAreaService.getById(id);
		if(erpPartitionArea==null) {
			return Result.error("未找到对应数据");
		}
		return Result.ok(erpPartitionArea);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param erpPartitionArea
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpPartitionArea erpPartitionArea) {
        return super.exportXls(request, erpPartitionArea, ErpPartitionArea.class, "分区区域关系表");
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
        return super.importExcel(request, response, ErpPartitionArea.class);
    }

}
