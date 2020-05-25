package org.jeecg.modules.demo.erp.controller;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.constant.LabelConstant;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.system.vo.LoginUser;
import org.jeecg.common.util.FillRuleUtil;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.demo.erp.entity.*;
import org.jeecg.modules.demo.erp.handle.shipment.serivce.HandleShipmentService;
import org.jeecg.modules.demo.erp.service.*;
import org.jeecg.modules.demo.erp.vo.ErpShipmentPage;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * @Description: 订单表
 * @Author: jeecg-boot
 * @Date:   2020-04-13
 * @Version: V1.0
 */
@Api(tags="订单表")
@RestController
@RequestMapping("/erp/shipment")
@Slf4j
public class ErpShipmentController {
	@Autowired
	private IErpShipmentService erpShipmentService;
	@Autowired
	private IErpShipmentParcelService erpShipmentParcelService;
	@Autowired
	private IErpShipmentProductService erpShipmentProductService;
	@Autowired
	private IErpShipmentLogService erpShipmentLogService;
	@Autowired
    private IErpShipmentLabelService iErpShipmentLabelService;

	@Autowired
	private HandleShipmentService handleShipmentService;
	 @Value(value = "${jeecg.path.upload}")
	 private String uploadPath;

	/**
	 * 分页列表查询
	 *
	 * @param erpShipment
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "订单表-分页列表查询")
	@ApiOperation(value="订单表-分页列表查询", notes="订单表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpShipment erpShipment,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpShipment> queryWrapper = QueryGenerator.initQueryWrapper(erpShipment, req.getParameterMap());
		Page<ErpShipment> page = new Page<ErpShipment>(pageNo, pageSize);
		IPage<ErpShipment> pageList = erpShipmentService.page(page, queryWrapper);
		List <ErpShipment> erpShipments = pageList.getRecords();
		for (ErpShipment shipment:erpShipments) {
			QueryWrapper <ErpShipmentLog> wrapper = new QueryWrapper <>();
			wrapper.eq("shipment_id",shipment.getId());
			wrapper.orderByAsc("shipment_status+0");
			List <ErpShipmentLog> list = erpShipmentLogService.list(wrapper);
			if(!CollectionUtils.isEmpty(list)){
				shipment.setShipmentLogList(list);
				shipment.setShipmentStatus(list.get(list.size()-1).getShipmentStatus());
			}
            QueryWrapper <ErpShipmentLabel> shipmentLabelQueryWrapper = new QueryWrapper <>();
            shipmentLabelQueryWrapper.eq("shipment_id",shipment.getId());
            wrapper.orderByAsc("track_number");
            List <ErpShipmentLabel> erpShipmentLabels = this.iErpShipmentLabelService.list(shipmentLabelQueryWrapper);
            if(!CollectionUtils.isEmpty(erpShipmentLabels)){

                shipment.setErpShipmentLabelList(erpShipmentLabels);
                List <ErpShipmentLabel> collect = erpShipmentLabels.stream().filter(i -> i.getLabelType().equals(LabelConstant.PDF_TYPE_LABEL)).collect(Collectors.toList());
				File file = FileUtil.file(uploadPath + (CollectionUtils.isEmpty(collect) ? null : collect.get(0).getContent()));

				if(file.exists()){
					shipment.setLabelContent(CollectionUtils.isEmpty(collect) ? null : collect.get(0).getContent());
				}

				shipment.setErpShipmentLabelList(erpShipmentLabels);
            }

        }
		return Result.ok(pageList);
	}

	/**
	 *   添加
	 *
	 * @param erpShipmentPage
	 * @return
	 */
	@AutoLog(value = "订单表-添加")
	@ApiOperation(value="订单表-添加", notes="订单表-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody ErpShipmentPage erpShipmentPage) throws ExecutionException, InterruptedException {
		ErpShipment erpShipment = new ErpShipment();
		BeanUtils.copyProperties(erpShipmentPage, erpShipment);
		erpShipmentService.saveMain(erpShipment, erpShipmentPage.getErpShipmentParcelList(),erpShipmentPage.getErpShipmentProductList());
		this.handleShipmentService.calculateFreight(erpShipment.getId());
		this.handleShipmentService.push(erpShipment.getId());
		return Result.ok("添加成功！");
	}

	/**
	 *  编辑
	 *
	 * @param erpShipmentPage
	 * @return
	 */
	@AutoLog(value = "订单表-编辑")
	@ApiOperation(value="订单表-编辑", notes="订单表-编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody ErpShipmentPage erpShipmentPage) {
		ErpShipment erpShipment = new ErpShipment();
		BeanUtils.copyProperties(erpShipmentPage, erpShipment);
		ErpShipment erpShipmentEntity = erpShipmentService.getById(erpShipment.getId());
		if(erpShipmentEntity==null) {
			return Result.error("未找到对应数据");
		}
		erpShipmentService.updateMain(erpShipment, erpShipmentPage.getErpShipmentParcelList(),erpShipmentPage.getErpShipmentProductList());
		return Result.ok("编辑成功!");
	}

	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "订单表-通过id删除")
	@ApiOperation(value="订单表-通过id删除", notes="订单表-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		erpShipmentService.delMain(id);
		return Result.ok("删除成功!");
	}

	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "订单表-批量删除")
	@ApiOperation(value="订单表-批量删除", notes="订单表-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.erpShipmentService.delBatchMain(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功！");
	}

	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "订单表-通过id查询")
	@ApiOperation(value="订单表-通过id查询", notes="订单表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		ErpShipment erpShipment = erpShipmentService.getById(id);
		if(erpShipment==null) {
			return Result.error("未找到对应数据");
		}
		return Result.ok(erpShipment);

	}

	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "包裹表集合-通过id查询")
	@ApiOperation(value="包裹表集合-通过id查询", notes="包裹表-通过id查询")
	@GetMapping(value = "/queryErpShipmentParcelByMainId")
	public Result<?> queryErpShipmentParcelListByMainId(@RequestParam(name="id",required=true) String id) {
		List<ErpShipmentParcel> erpShipmentParcelList = erpShipmentParcelService.selectByMainId(id);
		return Result.ok(erpShipmentParcelList);
	}
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "产品表集合-通过id查询")
	@ApiOperation(value="产品表集合-通过id查询", notes="产品表-通过id查询")
	@GetMapping(value = "/queryErpShipmentProductByMainId")
	public Result<?> queryErpShipmentProductListByMainId(@RequestParam(name="id",required=true) String id) {
		List<ErpShipmentProduct> erpShipmentProductList = erpShipmentProductService.selectByMainId(id);
		return Result.ok(erpShipmentProductList);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param erpShipment
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpShipment erpShipment) {
      // Step.1 组装查询条件查询数据
      QueryWrapper<ErpShipment> queryWrapper = QueryGenerator.initQueryWrapper(erpShipment, request.getParameterMap());
      LoginUser sysUser = (LoginUser) SecurityUtils.getSubject().getPrincipal();

      //Step.2 获取导出数据
      List<ErpShipment> queryList = erpShipmentService.list(queryWrapper);
      // 过滤选中数据
      String selections = request.getParameter("selections");
      List<ErpShipment> erpShipmentList = new ArrayList<ErpShipment>();
      if(oConvertUtils.isEmpty(selections)) {
          erpShipmentList = queryList;
      }else {
          List<String> selectionList = Arrays.asList(selections.split(","));
          erpShipmentList = queryList.stream().filter(item -> selectionList.contains(item.getId())).collect(Collectors.toList());
      }

      // Step.3 组装pageList
      List<ErpShipmentPage> pageList = new ArrayList<ErpShipmentPage>();
      for (ErpShipment main : erpShipmentList) {
          ErpShipmentPage vo = new ErpShipmentPage();
          BeanUtils.copyProperties(main, vo);
          List<ErpShipmentParcel> erpShipmentParcelList = erpShipmentParcelService.selectByMainId(main.getId());
          vo.setErpShipmentParcelList(erpShipmentParcelList);
          List<ErpShipmentProduct> erpShipmentProductList = erpShipmentProductService.selectByMainId(main.getId());
          vo.setErpShipmentProductList(erpShipmentProductList);
          pageList.add(vo);
      }

      // Step.4 AutoPoi 导出Excel
      ModelAndView mv = new ModelAndView(new JeecgEntityExcelView());
      mv.addObject(NormalExcelConstants.FILE_NAME, "订单表列表");
      mv.addObject(NormalExcelConstants.CLASS, ErpShipmentPage.class);
      mv.addObject(NormalExcelConstants.PARAMS, new ExportParams("订单表数据", "导出人:"+sysUser.getRealname(), "订单表"));
      mv.addObject(NormalExcelConstants.DATA_LIST, pageList);
      return mv;
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
      MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
      Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
      for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
          MultipartFile file = entity.getValue();// 获取上传文件对象
          ImportParams params = new ImportParams();
          params.setTitleRows(2);
          params.setHeadRows(1);
          params.setNeedSave(true);
          try {
              List<ErpShipmentPage> list = ExcelImportUtil.importExcel(file.getInputStream(), ErpShipmentPage.class, params);
              for (ErpShipmentPage page : list) {
                  ErpShipment po = new ErpShipment();
                  BeanUtils.copyProperties(page, po);
                  erpShipmentService.saveMain(po, page.getErpShipmentParcelList(),page.getErpShipmentProductList());
				  this.handleShipmentService.calculateFreight(po.getId());
                  this.handleShipmentService.push(po.getId());
              }
              return Result.ok("文件导入成功！数据行数:" + list.size());
          } catch (Exception e) {
              log.error(e.getMessage(),e);
              return Result.error("文件导入失败:"+e.getMessage());
          } finally {
              try {
                  file.getInputStream().close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      return Result.ok("文件导入失败！");
    }

}
