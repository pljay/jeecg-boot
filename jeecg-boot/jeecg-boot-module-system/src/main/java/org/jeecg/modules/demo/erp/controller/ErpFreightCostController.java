package org.jeecg.modules.demo.erp.controller;

import org.jeecg.common.system.query.QueryGenerator;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecg.common.api.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import java.util.Arrays;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.demo.erp.entity.ErpFreightCostSet;
import org.jeecg.modules.demo.erp.entity.ErpFreightCost;
import org.jeecg.modules.demo.erp.service.IErpFreightCostService;
import org.jeecg.modules.demo.erp.service.IErpFreightCostSetService;


 /**
 * @Description: 运费成本表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
@RestController
@RequestMapping("/erp/freightCost")
@Slf4j
public class ErpFreightCostController extends JeecgController<ErpFreightCost, IErpFreightCostService> {

	@Autowired
	private IErpFreightCostService erpFreightCostService;

	@Autowired
	private IErpFreightCostSetService erpFreightCostSetService;


	/*---------------------------------主表处理-begin-------------------------------------*/

	/**
	 * 分页列表查询
	 * @param erpFreightCost
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpFreightCost erpFreightCost,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpFreightCost> queryWrapper = QueryGenerator.initQueryWrapper(erpFreightCost, req.getParameterMap());
		Page<ErpFreightCost> page = new Page<ErpFreightCost>(pageNo, pageSize);
		IPage<ErpFreightCost> pageList = erpFreightCostService.page(page, queryWrapper);
		return Result.ok(pageList);
	}

	/**
     *   添加
     * @param erpFreightCost
     * @return
     */
    @PostMapping(value = "/add")
    public Result<?> add(@RequestBody ErpFreightCost erpFreightCost) {
        erpFreightCostService.save(erpFreightCost);
        return Result.ok("添加成功！");
    }

    /**
     *  编辑
     * @param erpFreightCost
     * @return
     */
    @PutMapping(value = "/edit")
    public Result<?> edit(@RequestBody ErpFreightCost erpFreightCost) {
        erpFreightCostService.updateById(erpFreightCost);
        return Result.ok("编辑成功!");
    }

    /**
     * 通过id删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete")
    public Result<?> delete(@RequestParam(name="id",required=true) String id) {
        erpFreightCostService.delMain(id);
        return Result.ok("删除成功!");
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping(value = "/deleteBatch")
    public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
        this.erpFreightCostService.delBatchMain(Arrays.asList(ids.split(",")));
        return Result.ok("批量删除成功!");
    }

    /**
     * 导出
     * @return
     */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpFreightCost erpFreightCost) {
        return super.exportXls(request, erpFreightCost, ErpFreightCost.class, "运费成本表");
    }

    /**
     * 导入
     * @return
     */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, ErpFreightCost.class);
    }
	/*---------------------------------主表处理-end-------------------------------------*/


    /*--------------------------------子表处理-运费成本配置表-begin----------------------------------------------*/
	/**
	 * 查询子表信息 会传入主表ID
	 * @return
	 */
	@GetMapping(value = "/listErpFreightCostSetByMainId")
    public Result<?> listErpFreightCostSetByMainId(ErpFreightCostSet erpFreightCostSet,
                                                    @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                                    @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
                                                    HttpServletRequest req) {
        QueryWrapper<ErpFreightCostSet> queryWrapper = QueryGenerator.initQueryWrapper(erpFreightCostSet, req.getParameterMap());
        Page<ErpFreightCostSet> page = new Page<ErpFreightCostSet>(pageNo, pageSize);
        IPage<ErpFreightCostSet> pageList = erpFreightCostSetService.page(page, queryWrapper);
        return Result.ok(pageList);
    }

	/**
	 * 添加
	 * @param erpFreightCostSet
	 * @return
	 */
	@PostMapping(value = "/addErpFreightCostSet")
	public Result<?> addErpFreightCostSet(@RequestBody ErpFreightCostSet erpFreightCostSet) {
		erpFreightCostSetService.save(erpFreightCostSet);
		return Result.ok("添加成功！");
	}

    /**
	 * 编辑
	 * @param erpFreightCostSet
	 * @return
	 */
	@PutMapping(value = "/editErpFreightCostSet")
	public Result<?> editErpFreightCostSet(@RequestBody ErpFreightCostSet erpFreightCostSet) {
		erpFreightCostSetService.updateById(erpFreightCostSet);
		return Result.ok("编辑成功!");
	}

	/**
	 * 通过id删除
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/deleteErpFreightCostSet")
	public Result<?> deleteErpFreightCostSet(@RequestParam(name="id",required=true) String id) {
		erpFreightCostSetService.removeById(id);
		return Result.ok("删除成功!");
	}

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@DeleteMapping(value = "/deleteBatchErpFreightCostSet")
	public Result<?> deleteBatchErpFreightCostSet(@RequestParam(name="ids",required=true) String ids) {
		this.erpFreightCostSetService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功!");
	}

    /*--------------------------------子表处理-运费成本配置表-end----------------------------------------------*/




}
