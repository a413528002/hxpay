package com.globalhua.pay.facade.account.service;

import com.globalhua.pay.facade.account.vo.AccountDetails;

/**
 * 账户查询
 */
public interface AccountQueryFacade {

    /**
     * 检查账户详情
     * 如果密码正确则返回账户
     * @param username 用户名
     * @param password 密码
     * @return
     */
    AccountDetails queryAccountDetails(String username, String password);
}
