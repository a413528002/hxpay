package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.facade.toll.service.TollManagementFacade;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 代发
 */
@RestController
@RequestMapping("toll")
public class TollController {

    @Resource
    TollManagementFacade tollManagementFacade;

    /**
     * 导入Excel
     */
    @PostMapping("importExcel")
    public CommonResult<Void> importExcel(MultipartFile file) {
        return CommonResult.ok();
    }

    /**
     * 确认代发
     */
    @PostMapping("confirmToll")
    public CommonResult<Void> confirmToll() {
        return CommonResult.ok();
    }



}
