package com.globalhua.pay.web.portal.security;

import com.globalhua.pay.facade.account.enums.AccountStatus;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.*;

/**
 * 用户
 */
public class User implements UserDetails, CredentialsContainer {

    private static final long serialVersionUID = 666L;

    private String password;

    private final String username;

    private final Set<GrantedAuthority> authorities;

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this(username, password, AccountStatus.ENABLED, authorities);
    }

    public User(String username, String password, AccountStatus accountStatus,
                Collection<? extends GrantedAuthority> authorities) {
        Assert.isTrue(username != null && !"".equals(username) && password != null,
                "Cannot pass null or empty values to constructor");
        this.username = username;
        this.password = password;
        this.accountStatus = accountStatus;
        this.authorities = Collections.unmodifiableSet(sortAuthorities(authorities));
    }

    /**
     * 姓名
     */
    private String realname;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * QQ
     */
    private String qq;

    /**
     * 账户ID
     */
    private Long accountId;

    /**
     * 账户状态
     */
    private AccountStatus accountStatus;

    @Override
    public void eraseCredentials() {
        this.password = null;
    }

    public User maskClone() {
        User user = new User(username,"N/A", null);
        user.setAccountStatus(accountStatus);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setPassword(password);
        user.setRealname(realname);
        user.setQq(qq);
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return AccountStatus.DESTROY != this.accountStatus;
    }

    @Override
    public boolean isAccountNonLocked() {
        return AccountStatus.LOCKED != this.accountStatus;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return AccountStatus.ENABLED == this.accountStatus;
    }

    @Override
    public Set<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            return this.username.equals(((User) obj).username);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.username.hashCode();
    }

    private static SortedSet<GrantedAuthority> sortAuthorities(Collection<? extends GrantedAuthority> authorities) {
        Assert.notNull(authorities, "Cannot pass a null GrantedAuthority collection");
        // Ensure array iteration order is predictable (as per
        // UserDetails.getAuthorities() contract and SEC-717)
        SortedSet<GrantedAuthority> sortedAuthorities = new TreeSet<>(new AuthorityComparator());
        for (GrantedAuthority grantedAuthority : authorities) {
            Assert.notNull(grantedAuthority, "GrantedAuthority list cannot contain any null elements");
            sortedAuthorities.add(grantedAuthority);
        }
        return sortedAuthorities;
    }

    private static class AuthorityComparator implements Comparator<GrantedAuthority>, Serializable {

        private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

        @Override
        public int compare(GrantedAuthority g1, GrantedAuthority g2) {
            // Neither should ever be null as each entry is checked before adding it to
            // the set. If the authority is null, it is a custom authority and should
            // precede others.
            if (g2.getAuthority() == null) {
                return -1;
            }
            if (g1.getAuthority() == null) {
                return 1;
            }
            return g1.getAuthority().compareTo(g2.getAuthority());
        }

    }
}
