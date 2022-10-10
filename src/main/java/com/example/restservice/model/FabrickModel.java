package com.example.restservice.model;

import java.util.Date;

public class FabrickModel {


    private String accountId;
    private String iban;
    private String abiCode;

    @Override
    public String toString() {
        return "FabrickModel{" +
                "accountId='" + accountId + '\'' +
                ", iban='" + iban + '\'' +
                ", abiCode='" + abiCode + '\'' +
                ", cabCode='" + cabCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", internationalCin='" + internationalCin + '\'' +
                ", nationalCin='" + nationalCin + '\'' +
                ", account='" + account + '\'' +
                ", alias='" + alias + '\'' +
                ", productName='" + productName + '\'' +
                ", holderName='" + holderName + '\'' +
                ", activatedDate=" + activatedDate +
                ", currency='" + currency + '\'' +
                '}';
    }

    private String cabCode;
    private String countryCode;
    private String internationalCin;
    private String nationalCin;
    private String account;
    private String alias;
    private String productName;
    private String holderName;
    private Date activatedDate;
    private String currency;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAbiCode() {
        return abiCode;
    }

    public void setAbiCode(String abiCode) {
        this.abiCode = abiCode;
    }

    public String getCabCode() {
        return cabCode;
    }

    public void setCabCode(String cabCode) {
        this.cabCode = cabCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getInternationalCin() {
        return internationalCin;
    }

    public void setInternationalCin(String internationalCin) {
        this.internationalCin = internationalCin;
    }

    public String getNationalCin() {
        return nationalCin;
    }

    public void setNationalCin(String nationalCin) {
        this.nationalCin = nationalCin;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Date getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(Date activatedDate) {
        this.activatedDate = activatedDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountId() {
        return accountId;
    }


    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }



}
