package com.globalhua.pay.web.portal.security;

import com.globalhua.pay.facade.account.enums.AccountStatus;
import com.globalhua.pay.facade.account.service.AccountQueryFacade;
import com.globalhua.pay.facade.account.vo.AccountDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.Collections;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private AccountQueryFacade accountQueryFacade;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountDetails accountDetails = accountQueryFacade.queryAccountDetails(username);
        if (accountDetails == null) {
            throw new UsernameNotFoundException("账户不存在");
        }
        // TODO: 2021/3/22 权限？
        User user = new User(username, null,
                AccountStatus.findByValue(accountDetails.getStatus()),
                Collections.emptySet());
        return user;
    }
}
