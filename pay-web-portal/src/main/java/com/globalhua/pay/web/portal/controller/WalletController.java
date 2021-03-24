package com.globalhua.pay.web.portal.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.facade.wallet.service.WalletQueryFacade;
import com.globalhua.pay.web.portal.biz.SelectProjectBiz;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 钱包/资金流水
 */
@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Resource
    WalletQueryFacade walletQueryFacade;

    @Resource
    SelectProjectBiz selectProjectBiz;

    /**
     * 根据项目ID获取钱包
     * @return
     */
    @GetMapping("get")
    public CommonResult<Void> get() {

        return CommonResult.ok();
    }

    /**
     * 查询流水
     * @param walletId
     * @return
     */
    @GetMapping("pageFlow")
    public CommonResult<Page<Void>> pageFlow(Long walletId) {
        return CommonResult.ok();
    }

    /**
     * 充值
     * @return
     */
    @PostMapping("recharge")
    public CommonResult<Void> recharge() {
        return CommonResult.ok();
    }
}
