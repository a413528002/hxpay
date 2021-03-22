package com.globalhua.pay.facade.project.exception;

import com.globalhua.pay.common.exception.BizException;

public class ProjectBizException extends BizException {

    private static final long serialVersionUID = 1L;

    public ProjectBizException() {
    }

    public ProjectBizException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }

    @Override
    public ProjectBizException newInstance(String msgFormat, Object... args) {
        return new ProjectBizException(this.code, msgFormat, args);
    }
}
