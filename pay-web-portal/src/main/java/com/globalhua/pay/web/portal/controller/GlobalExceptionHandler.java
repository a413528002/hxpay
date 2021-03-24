package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.common.exception.BizException;
import com.globalhua.pay.common.web.vo.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理器
 */
@ControllerAdvice("com.globalhua.pay.web.portal.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(BizException.class)
    public CommonResult<?> bizExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        BizException exception = (BizException) e;
        return CommonResult.error(exception.getCode(), exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public CommonResult<?> exceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return CommonResult.error(e.getMessage());
    }

}
