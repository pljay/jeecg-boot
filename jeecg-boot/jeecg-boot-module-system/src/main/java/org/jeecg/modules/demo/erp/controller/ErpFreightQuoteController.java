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
import org.jeecg.modules.demo.erp.entity.ErpFreightQuoteSet;
import org.jeecg.modules.demo.erp.entity.ErpFreightQuote;
import org.jeecg.modules.demo.erp.service.IErpFreightQuoteService;
import org.jeecg.modules.demo.erp.service.IErpFreightQuoteSetService;


 /**
 * @Description: 运费报价表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
@RestController
@RequestMapping("/erp/freightQuote")
@Slf4j
public class ErpFreightQuoteController extends JeecgController<ErpFreightQuote, IErpFreightQuoteService> {

	@Autowired
	private IErpFreightQuoteService erpFreightQuoteService;

	@Autowired
	private IErpFreightQuoteSetService erpFreightQuoteSetService;


	/*---------------------------------主表处理-begin-------------------------------------*/

	/**
	 * 分页列表查询
	 * @param erpFreightQuote
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpFreightQuote erpFreightQuote,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpFreightQuote> queryWrapper = QueryGenerator.initQueryWrapper(erpFreightQuote, req.getParameterMap());
		Page<ErpFreightQuote> page = new Page<ErpFreightQuote>(pageNo, pageSize);
		IPage<ErpFreightQuote> pageList = erpFreightQuoteService.page(page, queryWrapper);
		return Result.ok(pageList);
	}

	/**
     *   添加
     * @param erpFreightQuote
     * @return
     */
    @PostMapping(value = "/add")
    public Result<?> add(@RequestBody ErpFreightQuote erpFreightQuote) {
        erpFreightQuoteService.save(erpFreightQuote);
        return Result.ok("添加成功！");
    }

    /**
     *  编辑
     * @param erpFreightQuote
     * @return
     */
    @PutMapping(value = "/edit")
    public Result<?> edit(@RequestBody ErpFreightQuote erpFreightQuote) {
        erpFreightQuoteService.updateById(erpFreightQuote);
        return Result.ok("编辑成功!");
    }

    /**
     * 通过id删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete")
    public Result<?> delete(@RequestParam(name="id",required=true) String id) {
        erpFreightQuoteService.delMain(id);
        return Result.ok("删除成功!");
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping(value = "/deleteBatch")
    public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
        this.erpFreightQuoteService.delBatchMain(Arrays.asList(ids.split(",")));
        return Result.ok("批量删除成功!");
    }

    /**
     * 导出
     * @return
     */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpFreightQuote erpFreightQuote) {
        return super.exportXls(request, erpFreightQuote, ErpFreightQuote.class, "运费报价表");
    }

    /**
     * 导入
     * @return
     */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, ErpFreightQuote.class);
    }
	/*---------------------------------主表处理-end-------------------------------------*/


    /*--------------------------------子表处理-运费报价配置表-begin----------------------------------------------*/
	/**
	 * 查询子表信息 会传入主表ID
	 * @return
	 */
	@GetMapping(value = "/listErpFreightQuoteSetByMainId")
    public Result<?> listErpFreightQuoteSetByMainId(ErpFreightQuoteSet erpFreightQuoteSet,
                                                    @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                                    @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
                                                    HttpServletRequest req) {
        QueryWrapper<ErpFreightQuoteSet> queryWrapper = QueryGenerator.initQueryWrapper(erpFreightQuoteSet, req.getParameterMap());
        Page<ErpFreightQuoteSet> page = new Page<ErpFreightQuoteSet>(pageNo, pageSize);
        IPage<ErpFreightQuoteSet> pageList = erpFreightQuoteSetService.page(page, queryWrapper);
        return Result.ok(pageList);
    }

	/**
	 * 添加
	 * @param erpFreightQuoteSet
	 * @return
	 */
	@PostMapping(value = "/addErpFreightQuoteSet")
	public Result<?> addErpFreightQuoteSet(@RequestBody ErpFreightQuoteSet erpFreightQuoteSet) {
		erpFreightQuoteSetService.save(erpFreightQuoteSet);
		return Result.ok("添加成功！");
	}

    /**
	 * 编辑
	 * @param erpFreightQuoteSet
	 * @return
	 */
	@PutMapping(value = "/editErpFreightQuoteSet")
	public Result<?> editErpFreightQuoteSet(@RequestBody ErpFreightQuoteSet erpFreightQuoteSet) {
		erpFreightQuoteSetService.updateById(erpFreightQuoteSet);
		return Result.ok("编辑成功!");
	}

	/**
	 * 通过id删除
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/deleteErpFreightQuoteSet")
	public Result<?> deleteErpFreightQuoteSet(@RequestParam(name="id",required=true) String id) {
		erpFreightQuoteSetService.removeById(id);
		return Result.ok("删除成功!");
	}

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@DeleteMapping(value = "/deleteBatchErpFreightQuoteSet")
	public Result<?> deleteBatchErpFreightQuoteSet(@RequestParam(name="ids",required=true) String ids) {
		this.erpFreightQuoteSetService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功!");
	}

    /*--------------------------------子表处理-运费报价配置表-end----------------------------------------------*/




}
