package com.globalhua.pay.facade.project.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

/**
 * <p>
 * 项目信息表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-23
 */
@TableName("hx_component_project")
public class Project extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目编号
     */
    private String number;

    /**
     * 系统API配置KEY
     */
    private String merchantCode;

    /**
     * 系统API配置密钥
     */
    private String merchantSecret;

    /**
     * 网商支付ID
     */
    private String payOpenId;

    /**
     * 项目备注权限
     */
    private String scopes;

    /**
     * 状态
     */
    private String status;

    /**
     * 外键
     */
    private Long accountId;

    /**
     * 外键
     */
    private Long clientId;

    /**
     * 外键
     */
    private Long contractId;

    /**
     * 是否必签约
     */
    private Boolean signFlag;

    /**
     * 是否预开票
     */
    private Boolean beforeTicketFlag;

    /**
     * 开票内容
     */
    private String contentTicket;

    /**
     * 二维码
     */
    private String qrCodeImg;

    /**
     * 导入权限
     */
    private Boolean importFlag;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantSecret() {
        return merchantSecret;
    }

    public void setMerchantSecret(String merchantSecret) {
        this.merchantSecret = merchantSecret;
    }

    public String getPayOpenId() {
        return payOpenId;
    }

    public void setPayOpenId(String payOpenId) {
        this.payOpenId = payOpenId;
    }

    public String getScopes() {
        return scopes;
    }

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Boolean getSignFlag() {
        return signFlag;
    }

    public void setSignFlag(Boolean signFlag) {
        this.signFlag = signFlag;
    }

    public Boolean getBeforeTicketFlag() {
        return beforeTicketFlag;
    }

    public void setBeforeTicketFlag(Boolean beforeTicketFlag) {
        this.beforeTicketFlag = beforeTicketFlag;
    }

    public String getContentTicket() {
        return contentTicket;
    }

    public void setContentTicket(String contentTicket) {
        this.contentTicket = contentTicket;
    }

    public String getQrCodeImg() {
        return qrCodeImg;
    }

    public void setQrCodeImg(String qrCodeImg) {
        this.qrCodeImg = qrCodeImg;
    }

    public Boolean getImportFlag() {
        return importFlag;
    }

    public void setImportFlag(Boolean importFlag) {
        this.importFlag = importFlag;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", merchantCode='" + merchantCode + '\'' +
                ", merchantSecret='" + merchantSecret + '\'' +
                ", payOpenId='" + payOpenId + '\'' +
                ", scopes='" + scopes + '\'' +
                ", status='" + status + '\'' +
                ", accountId=" + accountId +
                ", clientId=" + clientId +
                ", contractId=" + contractId +
                ", signFlag=" + signFlag +
                ", beforeTicketFlag=" + beforeTicketFlag +
                ", contentTicket='" + contentTicket + '\'' +
                ", qrCodeImg='" + qrCodeImg + '\'' +
                ", importFlag=" + importFlag +
                ", id=" + id +
                '}';
    }
}
