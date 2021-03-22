package com.globalhua.pay.facade.account.enums;

/**
 * 账户状态
 */
public enum AccountStatus {

    ENABLED(1,"启用"),
    LOCKED(2,"锁定"),
    DESTROY(3,"注销")
    ;

    private int value;
    private String zh;

    AccountStatus(int value, String zh) {
        this.value = value;
        this.zh = zh;
    }

    public String getZh() {
        return zh;
    }

    public int getValue() {
        return value;
    }

    public static AccountStatus findByValue(int value) {
        for (AccountStatus accountStatus : values()) {
            if (accountStatus.value == value) {
                return accountStatus;
            }
        }
        throw new IllegalArgumentException();
    }
}
