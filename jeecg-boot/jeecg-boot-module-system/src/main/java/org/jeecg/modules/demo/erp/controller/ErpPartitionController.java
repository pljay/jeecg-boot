package org.jeecg.modules.demo.erp.controller;

import org.apache.commons.lang.StringUtils;
import org.jeecg.common.system.query.QueryGenerator;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.demo.erp.entity.ErpPostcode;
import org.jeecg.modules.system.model.TreeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.demo.erp.entity.ErpPartitionSet;
import org.jeecg.modules.demo.erp.entity.ErpPartition;
import org.jeecg.modules.demo.erp.service.IErpPartitionService;
import org.jeecg.modules.demo.erp.service.IErpPartitionSetService;


/**
 * @Description: 分区表
 * @Author: jeecg-boot
 * @Date:   2020-04-29
 * @Version: V1.0
 */
@RestController
@RequestMapping("/erp/partition")
@Slf4j
public class ErpPartitionController extends JeecgController<ErpPartition, IErpPartitionService> {

    @Autowired
    private IErpPartitionService erpPartitionService;

    @Autowired
    private IErpPartitionSetService erpPartitionSetService;


    /*---------------------------------主表处理-begin-------------------------------------*/

    /**
     * 分页列表查询
     * @param erpPartition
     * @param pageNo
     * @param pageSize
     * @param req
     * @return
     */
    @GetMapping(value = "/list")
    public Result<?> queryPageList(ErpPartition erpPartition,
                                   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                                   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
                                   HttpServletRequest req) {
        QueryWrapper<ErpPartition> queryWrapper = QueryGenerator.initQueryWrapper(erpPartition, req.getParameterMap());
        Page<ErpPartition> page = new Page<ErpPartition>(pageNo, pageSize);
        IPage<ErpPartition> pageList = erpPartitionService.page(page, queryWrapper);
        return Result.ok(pageList);
    }

    /**
     * 查询根节点
     * @return
     */
    @GetMapping(value = "/rootList")
    public  Result<?> queryRootList(){
        List <TreeModel> treeModels = new ArrayList<>();
        List <ErpPartition> list = erpPartitionService.list();
        for (ErpPartition erpPartition:list) {
            TreeModel treeModel = new TreeModel();
            treeModel.setIsLeaf(false);
            treeModel.setKey(erpPartition.getId());
            treeModel.setValue(erpPartition.getId());
            treeModel.setParentId("0");
            treeModel.setTitle(erpPartition.getName());
            treeModels.add(treeModel);
        }
        return Result.ok(treeModels);
    }
    /**
     * 查询子节点
     * @return
     */
    @GetMapping(value = "/childrenList")
    public  Result<?> queryChildenList(@RequestParam(name="partitionId") String partitionId){
        List <TreeModel> treeModels = new ArrayList<>();
        List <ErpPartitionSet> list = erpPartitionSetService.selectByMainId(partitionId);
        for (ErpPartitionSet erpPartitionSet:list) {
            TreeModel treeModel = new TreeModel();
            treeModel.setIsLeaf(true);
            treeModel.setKey(erpPartitionSet.getId());
            treeModel.setValue(erpPartitionSet.getId());
            treeModel.setParentId(erpPartitionSet.getPartitionId());
            treeModel.setTitle(erpPartitionSet.getPartitionName());
            treeModels.add(treeModel);
        }
        return Result.ok(treeModels);
    }
    /**
     *   添加
     * @param erpPartition
     * @return
     */
    @PostMapping(value = "/add")
    public Result<?> add(@RequestBody ErpPartition erpPartition) {
        erpPartitionService.save(erpPartition);
        return Result.ok("添加成功！");
    }

    /**
     *  编辑
     * @param erpPartition
     * @return
     */
    @PutMapping(value = "/edit")
    public Result<?> edit(@RequestBody ErpPartition erpPartition) {
        erpPartitionService.updateById(erpPartition);
        return Result.ok("编辑成功!");
    }

    /**
     * 通过id删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete")
    public Result<?> delete(@RequestParam(name="id",required=true) String id) {
        erpPartitionService.delMain(id);
        return Result.ok("删除成功!");
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping(value = "/deleteBatch")
    public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
        this.erpPartitionService.delBatchMain(Arrays.asList(ids.split(",")));
        return Result.ok("批量删除成功!");
    }

    /**
     * 导出
     * @return
     */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpPartition erpPartition) {
        return super.exportXls(request, erpPartition, ErpPartition.class, "分区表");
    }

    /**
     * 导入
     * @return
     */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, ErpPartition.class);
    }
    /*---------------------------------主表处理-end-------------------------------------*/


    /*--------------------------------子表处理-分区配置表-begin----------------------------------------------*/
    /**
     * 查询子表信息 会传入主表ID
     * @return
     */
    @GetMapping(value = "/listErpPartitionSetByMainId")
    public Result<?> listErpPartitionSetByMainId(ErpPartitionSet erpPartitionSet,
                                                 @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                                 @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
                                                 HttpServletRequest req) {
        QueryWrapper<ErpPartitionSet> queryWrapper = QueryGenerator.initQueryWrapper(erpPartitionSet, req.getParameterMap());
        Page<ErpPartitionSet> page = new Page<ErpPartitionSet>(pageNo, pageSize);
        IPage<ErpPartitionSet> pageList = erpPartitionSetService.page(page, queryWrapper);
        return Result.ok(pageList);
    }

    /**
     * 添加
     * @param erpPartitionSet
     * @return
     */
    @PostMapping(value = "/addErpPartitionSet")
    public Result<?> addErpPartitionSet(@RequestBody ErpPartitionSet erpPartitionSet) {
        erpPartitionSetService.save(erpPartitionSet);
        return Result.ok("添加成功！");
    }

    /**
     * 编辑
     * @param erpPartitionSet
     * @return
     */
    @PutMapping(value = "/editErpPartitionSet")
    public Result<?> editErpPartitionSet(@RequestBody ErpPartitionSet erpPartitionSet) {
        erpPartitionSetService.updateById(erpPartitionSet);
        return Result.ok("编辑成功!");
    }

    /**
     * 通过id删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/deleteErpPartitionSet")
    public Result<?> deleteErpPartitionSet(@RequestParam(name="id",required=true) String id) {
        erpPartitionSetService.removeById(id);
        return Result.ok("删除成功!");
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping(value = "/deleteBatchErpPartitionSet")
    public Result<?> deleteBatchErpPartitionSet(@RequestParam(name="ids",required=true) String ids) {
        this.erpPartitionSetService.removeByIds(Arrays.asList(ids.split(",")));
        return Result.ok("批量删除成功!");
    }

    /*--------------------------------子表处理-分区配置表-end----------------------------------------------*/




}
