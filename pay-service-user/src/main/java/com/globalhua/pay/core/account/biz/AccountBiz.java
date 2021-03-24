package com.globalhua.pay.core.account.biz;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.globalhua.pay.common.entity.BaseEntity;
import com.globalhua.pay.common.exception.BizException;
import com.globalhua.pay.core.account.mapper.AccountMapper;
import com.globalhua.pay.facade.account.entity.Account;
import com.globalhua.pay.facade.account.exception.AccountBizException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Objects;

@Component
public class AccountBiz {

    @Resource
    AccountMapper accountMapper;

    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    public boolean validatePassword(String username, String password) {
        Account account = getByUsername(username);
        if (account == null) {
            throw AccountBizException.ACCOUNT_NOT_EXIST;
        }
        return passwordEncoder.matches(password, account.getPassword());
    }

    public boolean validatePayPassword(String username, String password) {
        Account account = getByUsername(username);
        if (account == null) {
            throw AccountBizException.ACCOUNT_NOT_EXIST;
        }
        return passwordEncoder.matches(password, account.getPayPassword());
    }

    public void resetPassword(String username, String password) {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);

        int i = accountMapper.update(null, Wrappers.<Account>lambdaUpdate()
                .set(Account::getPassword, passwordEncoder.encode(password))
                .set(BaseEntity::getModifiedTime, LocalDateTime.now())
                .eq(Account::getUsername, username));

        if (i == 0) {
            throw BizException.DB_UPDATE_RESULT_0;
        }
    }

    public void resetPayPassword(String username, String password) {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);

        int i = accountMapper.update(null, Wrappers.<Account>lambdaUpdate()
                .set(Account::getPayPassword, passwordEncoder.encode(password))
                .set(BaseEntity::getModifiedTime, LocalDateTime.now())
                .eq(Account::getUsername, username));

        if (i == 0) {
            throw BizException.DB_UPDATE_RESULT_0;
        }
    }

    public Account getByUsername(String username) {
        Account account = accountMapper.selectOne(Wrappers.<Account>lambdaQuery()
                .eq(Account::getUsername, username));
        return account;
    }




}