package com.globalhua.pay.facade.account.enums;

import java.util.Objects;

/**
 * 账户状态
 */
public enum AccountStatus {

    ENABLED("ENABLED","启用"),
    LOCKED("LOCKED","锁定"),
    DESTROY("DESTROY","注销")
    ;

    private String value;
    private String zh;

    AccountStatus(String value, String zh) {
        this.value = value;
        this.zh = zh;
    }

    public String getZh() {
        return zh;
    }

    public String getValue() {
        return value;
    }

    public static AccountStatus findByValue(String value) {
        for (AccountStatus accountStatus : values()) {
            if (Objects.equals(accountStatus.value, value)) {
                return accountStatus;
            }
        }
        throw new IllegalArgumentException();
    }
}
