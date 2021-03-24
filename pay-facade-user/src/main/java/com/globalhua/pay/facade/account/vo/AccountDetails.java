package com.globalhua.pay.facade.account.vo;

import com.globalhua.pay.facade.account.entity.Account;
import com.globalhua.pay.facade.account.entity.AccountInfo;

public class AccountDetails extends Account {

    protected AccountInfo info;

    public AccountInfo getInfo() {
        return info;
    }

    public void setInfo(AccountInfo info) {
        this.info = info;
    }
}
