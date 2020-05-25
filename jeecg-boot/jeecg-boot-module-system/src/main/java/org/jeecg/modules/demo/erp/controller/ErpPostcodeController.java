package org.jeecg.modules.demo.erp.controller;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.demo.erp.entity.ErpPostcode;
import org.jeecg.modules.demo.erp.entity.ErpPostcodeImport;
import org.jeecg.modules.demo.erp.service.IErpPostcodeService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import org.jeecg.modules.system.model.TreeModel;
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
 * @Description: erp_postcode
 * @Author: jeecg-boot
 * @Date:   2020-04-15
 * @Version: V1.0
 */
@Api(tags="erp_postcode")
@RestController
@RequestMapping("/erp/postcode")
@Slf4j
public class ErpPostcodeController extends JeecgController<ErpPostcode, IErpPostcodeService> {
	@Autowired
	private IErpPostcodeService erpPostcodeService;

	/**
	 * 分页列表查询
	 *
	 * @param erpPostcode
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "erp_postcode-分页列表查询")
	@ApiOperation(value="erp_postcode-分页列表查询", notes="erp_postcode-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpPostcode erpPostcode,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
//		String parentId = erpPostcode.getPid();
//		if (oConvertUtils.isEmpty(parentId)) {
//			parentId = "0";
//		}
//		erpPostcode.setPid(parentId);
		QueryWrapper<ErpPostcode> queryWrapper = QueryGenerator.initQueryWrapper(erpPostcode, req.getParameterMap());
		queryWrapper.orderByAsc("area_type");
		queryWrapper.orderByAsc("country");
		queryWrapper.orderByAsc("state");
		queryWrapper.orderByAsc("city");
		queryWrapper.orderByAsc("postcode");
		Page<ErpPostcode> page = new Page<ErpPostcode>(pageNo, pageSize);
		IPage<ErpPostcode> pageList = erpPostcodeService.page(page, queryWrapper);
		return Result.ok(pageList);
	}

	/**
	 * 获取子数据
	 * @param testTree
	 * @param req
	 * @return
	 */
	@GetMapping(value = "/treeList")
	public Result<?> queryPageList(ErpPostcode erpPostcode,HttpServletRequest req) {
		String parentId = erpPostcode.getPid();
		if (oConvertUtils.isEmpty(parentId)) {
			parentId = "0";
		}
		erpPostcode.setPid(parentId);
		QueryWrapper<ErpPostcode> queryWrapper = QueryGenerator.initQueryWrapper(erpPostcode, req.getParameterMap());
		queryWrapper.orderByAsc("country");
		queryWrapper.orderByAsc("state");
		queryWrapper.orderByAsc("city");
		queryWrapper.orderByAsc("postcode");
		List<ErpPostcode> list = erpPostcodeService.list(queryWrapper);
		List <TreeModel> treeModels = new ArrayList <>();
		for (ErpPostcode postcode:list
		) {
			TreeModel treeModel = new TreeModel();
			treeModel.setIsLeaf(StringUtils.isEmpty(postcode.getHasChild()));
			treeModel.setKey(postcode.getId());
			treeModel.setValue(postcode.getId());
			treeModel.setParentId(postcode.getPid());
			switch (postcode.getAreaType()){
				case 1:
					treeModel.setTitle(postcode.getCountry());
					break;
				case 2:
					treeModel.setTitle(postcode.getState());
					break;
				case 3:
					treeModel.setTitle(postcode.getCity());
					break;
				case 4:
					treeModel.setTitle(postcode.getPostcode());
					break;
				default:break;
			}
			treeModels.add(treeModel);
		}
		return Result.ok(treeModels);
	}


	/**
	 *   添加
	 *
	 * @param erpPostcode
	 * @return
	 */
	@AutoLog(value = "erp_postcode-添加")
	@ApiOperation(value="erp_postcode-添加", notes="erp_postcode-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody ErpPostcode erpPostcode) {
		log.info("{}",erpPostcode);
		if("0".equals(erpPostcode.getPid())||StringUtils.isEmpty(erpPostcode.getPid())){
			erpPostcode.setCountry(erpPostcode.getValue());
			erpPostcode.setPid("0");
			erpPostcode.setAreaType(1);
		}else{
			ErpPostcode parentObj = erpPostcodeService.getById(erpPostcode.getPid());
			switch (parentObj.getAreaType()){
				case 1:
					erpPostcode.setCountry(parentObj.getCountry());
					erpPostcode.setState(erpPostcode.getValue());
					erpPostcode.setAreaType(2);
					break;
				case 2:
					erpPostcode.setCountry(parentObj.getCountry());
					erpPostcode.setState(parentObj.getState());
					erpPostcode.setCity(erpPostcode.getValue());
					erpPostcode.setAreaType(3);
					erpPostcode.setAbbr(null);
					break;
				case 3:
					erpPostcode.setCountry(parentObj.getCountry());
					erpPostcode.setState(parentObj.getState());
					erpPostcode.setCity(parentObj.getCity());
					erpPostcode.setAbbr(null);
					erpPostcode.setPostcode(erpPostcode.getValue());
					erpPostcode.setAreaType(4);
					break;
				default:

					break;
			}
		}
		erpPostcodeService.save(erpPostcode);
		return Result.ok("添加成功！");
	}

	/**
	 *  编辑
	 *
	 * @param erpPostcode
	 * @return
	 */
	@AutoLog(value = "erp_postcode-编辑")
	@ApiOperation(value="erp_postcode-编辑", notes="erp_postcode-编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody ErpPostcode erpPostcode) {

		ErpPostcode cuurentObj = erpPostcodeService.getById(erpPostcode.getId());
		switch (cuurentObj.getAreaType()){
			case 1:
				erpPostcode.setCountry(erpPostcode.getValue());
				break;
			case 2:
				erpPostcode.setState(erpPostcode.getValue());
				break;
			case 3:
				erpPostcode.setCity(erpPostcode.getValue());
				break;
			case 4:
				erpPostcode.setPostcode(erpPostcode.getValue());
				break;
			default:

				break;
		}

		erpPostcodeService.updateById(erpPostcode);
		return Result.ok("编辑成功!");
	}

	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "erp_postcode-通过id删除")
	@ApiOperation(value="erp_postcode-通过id删除", notes="erp_postcode-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		erpPostcodeService.removeById(id);
		return Result.ok("删除成功!");
	}

	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "erp_postcode-批量删除")
	@ApiOperation(value="erp_postcode-批量删除", notes="erp_postcode-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.erpPostcodeService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功!");
	}

	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "erp_postcode-通过id查询")
	@ApiOperation(value="erp_postcode-通过id查询", notes="erp_postcode-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		ErpPostcode erpPostcode = erpPostcodeService.getById(id);
		if(erpPostcode==null) {
			return Result.error("未找到对应数据");
		}
		return Result.ok(erpPostcode);
	}

	/**
	 * 导出excel
	 *
	 * @param request
	 * @param erpPostcode
	 */
	@RequestMapping(value = "/exportXls")
	public ModelAndView exportXls(HttpServletRequest request, ErpPostcode erpPostcode) {
		return super.exportXls(request, erpPostcode, ErpPostcode.class, "erp_postcode");
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
		return this.importPostcodeExcel(request, response, ErpPostcodeImport.class);
	}

	/**
	 * 通过excel导入数据
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	protected Result<?> importPostcodeExcel(HttpServletRequest request, HttpServletResponse response, Class<ErpPostcodeImport> clazz) {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<ErpPostcodeImport> list = ExcelImportUtil.importExcel(file.getInputStream(), clazz, params);


				//update-begin-author:taoyan date:20190528 for:批量插入数据
				long start = System.currentTimeMillis();

				//400条 saveBatch消耗时间1592毫秒  循环插入消耗时间1947毫秒
				//1200条  saveBatch消耗时间3687毫秒 循环插入消耗时间5212毫秒
				ErpPostcode one = this.erpPostcodeService.getOne(new QueryWrapper <ErpPostcode>().eq("abbr", list.get(0).getCountry()).eq("area_type", 1));


				//获取state
				ArrayList <ErpPostcodeImport> stateList = list.stream().collect(Collectors.collectingAndThen(
						Collectors.toCollection(() -> new TreeSet <>(Comparator.comparing(ErpPostcodeImport::getState))), ArrayList::new));
				for (ErpPostcodeImport postcodeImport:stateList
				) {
					ErpPostcode state = new ErpPostcode();
					state.setCountry(postcodeImport.getCountry());
					state.setState(postcodeImport.getState());
					state.setAbbr(postcodeImport.getAbbr());
					state.setHasChild("1");
					state.setPid(one.getId());
					state.setAreaType(2);
					this.erpPostcodeService.save(state);
					//获取city
					List <ErpPostcodeImport> cityList = list.stream().filter(i -> i.getState().equals(state.getState())).collect(Collectors.collectingAndThen(
							Collectors.toCollection(() -> new TreeSet <>(Comparator.comparing(ErpPostcodeImport::getCity))), ArrayList::new));;
					for (ErpPostcodeImport anImport:cityList
					) {
						ErpPostcode city = new ErpPostcode();
						city.setCountry(state.getCountry());
						city.setAbbr(state.getAbbr());
						city.setState(state.getState());
						city.setCity(anImport.getCity());
						city.setHasChild("1");
						city.setAreaType(3);
						city.setPid(state.getId());
						this.erpPostcodeService.save(city);
						//获取postcode
						List <ErpPostcodeImport> postList = list.stream().filter(i -> i.getState().equals(city.getState())).filter(i -> i.getCity().equals(city.getCity())).collect(Collectors.toList());
						for (ErpPostcodeImport erpPostcodeImport:postList
						) {
							ErpPostcode postcode = new ErpPostcode();
							postcode.setCountry(city.getCountry());
							postcode.setAbbr(city.getAbbr());
							postcode.setState(city.getState());
							postcode.setCity(city.getCity());
							postcode.setPostcode(erpPostcodeImport.getPostcode());
							postcode.setAreaType(4);
							postcode.setPid(city.getId());
							this.erpPostcodeService.save(postcode);
						}
					}
				}
				log.info("消耗时间" + (System.currentTimeMillis() - start) + "毫秒");
				//update-end-author:taoyan date:20190528 for:批量插入数据
				return Result.ok("文件导入成功！数据行数：" + list.size());
			} catch (Exception e) {
				log.error(e.getMessage(), e);
				return Result.error("文件导入失败:" + e.getMessage());
			} finally {
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return Result.error("文件导入失败！");
	}
}
