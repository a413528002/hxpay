package com.globalhua.pay.web.portal.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.facade.toll.dto.TollTemplate;
import com.globalhua.pay.facade.toll.entity.TollOrder;
import com.globalhua.pay.facade.toll.service.TollManagementFacade;
import com.globalhua.pay.facade.toll.service.TollQueryFacade;
import com.globalhua.pay.facade.toll.vo.TollBatchVo;
import com.globalhua.pay.web.portal.biz.SelectProjectBiz;
import com.globalhua.pay.web.portal.dto.ConfirmTollRequest;
import com.globalhua.pay.web.portal.dto.PayTollRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 代发
 */
@RestController
@RequestMapping("toll")
public class TollController {

    @Resource
    TollManagementFacade tollManagementFacade;

    @Resource
    TollQueryFacade tollQueryFacade;

    @Resource
    SelectProjectBiz selectProjectBiz;

    /**
     * 分页查询代发批次
     * @return
     */
    @GetMapping("pageTollBatch")
    public CommonResult<Page<TollBatchVo>> pageTollBatch(@RequestParam(required = false) String batchNoLike,
                                                         Page<?> page) {
        Long currentProjectId = selectProjectBiz.getCurrentProjectId();
        Page<TollBatchVo> result = tollQueryFacade
                .pageTollBatchByProjectAndBatchNoLike(currentProjectId, batchNoLike, page);
        return CommonResult.ok(result);
    }

    /**
     * 分页查询代发流水
     * @return
     */
    @GetMapping("pageTollOrder")
    public CommonResult<Page<TollOrder>> pageTollOrder(@RequestParam Long batchId,
                                                       Page<?> page) {
        Page<TollOrder> result = tollQueryFacade.pageTollOrderByBatchId(batchId, page);
        return CommonResult.ok(result);
    }

    /**
     * 导入Excel
     */
    @PostMapping("importExcel")
    public CommonResult<TollBatchVo> importExcel(MultipartFile file) {
        // TODO: 2021/3/24
        List<TollTemplate> template = Collections.emptyList();

        TollBatchVo tollBatchVo = tollManagementFacade.importToll(template);
        return CommonResult.ok(tollBatchVo);
    }

    /**
     * 确认代发
     */
    @PostMapping("confirmToll")
    public CommonResult<Void> confirmToll(@RequestBody ConfirmTollRequest body) {
        return CommonResult.ok();
    }

    /**
     * 支付代发
     * @return
     */
    @PostMapping("payToll")
    public CommonResult<Void> payToll(@RequestBody PayTollRequest body) {
        return CommonResult.ok();
    }

}
