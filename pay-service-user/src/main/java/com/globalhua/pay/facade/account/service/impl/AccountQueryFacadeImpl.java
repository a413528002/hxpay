package com.globalhua.pay.facade.account.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.globalhua.pay.core.account.biz.AccountBiz;
import com.globalhua.pay.core.account.biz.AccountInfoBiz;
import com.globalhua.pay.core.account.mapper.AccountInfoMapper;
import com.globalhua.pay.facade.account.entity.Account;
import com.globalhua.pay.facade.account.entity.AccountInfo;
import com.globalhua.pay.facade.account.service.AccountQueryFacade;
import com.globalhua.pay.facade.account.vo.AccountDetails;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class AccountQueryFacadeImpl implements AccountQueryFacade {

    @Resource
    AccountBiz accountBiz;

    @Resource
    AccountInfoBiz accountInfoBiz;

    @Override
    public AccountDetails queryAccountDetails(String username) {
        Objects.requireNonNull(username);
        Account account = accountBiz.getByUsername(username);
        if (account == null) {
            return null;
        }
        AccountDetails result = new AccountDetails();
        BeanUtils.copyProperties(account, result);
        AccountInfo accountInfo = accountInfoBiz.getByAccountId(account.getId());
        result.setInfo(accountInfo);
        return result;
    }
}
