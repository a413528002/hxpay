package com.globalhua.pay.facade.account.service.impl;

import com.globalhua.pay.core.account.biz.AccountBiz;
import com.globalhua.pay.facade.account.service.AccountManagementFacade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountManagementFacadeImpl implements AccountManagementFacade {

    @Resource
    AccountBiz accountBiz;

    @Override
    public boolean validatePassword(String username, String password) {
        return accountBiz.validatePassword(username, password);
    }

    @Override
    public boolean validatePayPassword(String username, String password) {
        return accountBiz.validatePassword(username, password);
    }

    @Override
    public void resetPassword(String username, String password) {
        accountBiz.resetPassword(username, password);
    }

    @Override
    public void resetPayPassword(String username, String payPassword) {
        accountBiz.resetPayPassword(username, payPassword);
    }
}
