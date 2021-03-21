package com.globalhua.pay.facade.account.service;

/**
 * 账号管理
 */
public interface AccountManagementFacade {

    /**
     * 重置登陆密码
     * @param username
     * @param password
     * @return
     */
    boolean resetPassword(String username, String password);

    /**
     * 重置支付密码
     * @param username
     * @param payPassword
     * @return
     */
    boolean resetPayPassword(String username, String payPassword);
}
