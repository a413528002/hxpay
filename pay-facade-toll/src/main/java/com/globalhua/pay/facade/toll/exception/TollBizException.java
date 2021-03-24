package com.globalhua.pay.facade.toll.exception;

import com.globalhua.pay.common.exception.BizException;

/**
 * 代发业务异常
 */
public class TollBizException extends BizException {

    private static final long serialVersionUID = 1L;

    public TollBizException() {
    }

    public TollBizException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }

    @Override
    public TollBizException newInstance(String msgFormat, Object... args) {
        return new TollBizException(this.code, msgFormat, args);
    }
}
