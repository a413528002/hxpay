package com.globalhua.pay.common.web.annotation;

import java.lang.annotation.*;

/**
 * 请求体解密
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD })
public @interface DecryptRequestBody {
}
