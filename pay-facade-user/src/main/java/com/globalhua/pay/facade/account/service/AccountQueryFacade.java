package com.globalhua.pay.facade.account.service;

import com.globalhua.pay.facade.account.vo.AccountDetails;

/**
 * 账户查询
 */
public interface AccountQueryFacade {

    /**
     * 查询账户详情
     * @param username 用户名
     * @return
     */
    AccountDetails queryAccountDetails(String username);

}
