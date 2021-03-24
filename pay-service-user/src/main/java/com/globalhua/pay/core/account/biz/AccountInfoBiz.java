package com.globalhua.pay.core.account.biz;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.globalhua.pay.core.account.mapper.AccountInfoMapper;
import com.globalhua.pay.facade.account.entity.AccountInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

@Component
public class AccountInfoBiz {

    @Resource
    AccountInfoMapper accountInfoMapper;

    public AccountInfo getByAccountId(Long accountId) {
        Objects.requireNonNull(accountId);
        AccountInfo accountInfo = accountInfoMapper.selectOne(Wrappers.<AccountInfo>lambdaQuery()
                .eq(AccountInfo::getAccountId, accountId));
        return accountInfo;
    }
}
