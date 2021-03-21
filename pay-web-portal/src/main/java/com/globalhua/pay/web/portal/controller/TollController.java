package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.common.web.vo.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 代发
 */
@RestController
@RequestMapping("toll")
public class TollController {

    /**
     * 导入Excel
     */
    @PostMapping("importExcel")
    public CommonResult<Void> importExcel(MultipartFile file) {
        return CommonResult.ok();
    }

}
