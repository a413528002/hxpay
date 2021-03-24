package com.globalhua.pay.facade.wallet.exception;

import com.globalhua.pay.common.exception.BizException;

/**
 * 钱包业务异常
 */
public class WalletBizException extends BizException {

    private static final long serialVersionUID = 1L;

    public WalletBizException() {
    }

    public WalletBizException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }

    @Override
    public WalletBizException newInstance(String msgFormat, Object... args) {
        return new WalletBizException(this.code, msgFormat, args);
    }
}
