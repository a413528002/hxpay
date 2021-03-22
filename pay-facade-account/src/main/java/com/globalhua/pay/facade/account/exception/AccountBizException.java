package com.globalhua.pay.facade.account.exception;

import com.globalhua.pay.common.exception.BizException;

/**
 * 账号业务异常
 */
public class AccountBizException extends BizException {

    private static final long serialVersionUID = 1L;

    public static final AccountBizException ACCOUNT_NOT_EXIT = new AccountBizException(20080001, "账户不存在");

    public static final AccountBizException ACCOUNT_PASSWORD_ERROR = new AccountBizException(20080002, "账户密码错误");

    public static final AccountBizException ACCOUNT_STATUS_IS_LOCKED = new AccountBizException(20080102, "账户已锁定");

    public static final AccountBizException ACCOUNT_STATUS_IS_DESTROY = new AccountBizException(20080102, "账户已注销");

    public static final AccountBizException ACCOUNT_PAY_PASSWORD_ERROR = new AccountBizException(20080104, "交易密码错误");

    public AccountBizException() {
    }

    public AccountBizException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }

    @Override
    public AccountBizException newInstance(String msgFormat, Object... args) {
        return new AccountBizException(this.code, msgFormat, args);
    }
}
