package com.globalhua.pay.facade.account.service;

/**
 * 账号操作
 */
public interface AccountManagementFacade {

    /**
     * 验证登录密码是否正确
     * @param username 用户名
     * @param password 登录密码
     * @return
     */
    boolean validatePassword(String username, String password);

    /**
     * 验证支付密码是否正确
     * @param username 用户名
     * @param password 支付密码
     * @return
     */
    boolean validatePayPassword(String username, String password);

    /**
     * 重置登陆密码
     * @param username 用户名
     * @param password 密码
     */
    void resetPassword(String username, String password);

    /**
     * 重置支付密码
     * @param username 用户名
     * @param payPassword 支付密码
     */
    void resetPayPassword(String username, String payPassword);
}
