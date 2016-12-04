package com.lwhtarena.purchase.pojo;

import java.io.Serializable;

/**
 * @author lwh
 * @folder com.lwhtarena.purchase.pojo
 * @date 2016/8/4.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class Applymention implements Serializable {

    private Integer id;

    private String date;

    private Double money;

    private Double fee;

    /*银行名称*/
    private String bankName;

    /*开户人*/
    private String bankUser;

    /*开户支行*/
    private String bankSubbranch;

    /*开户账号*/
    private String bankNo;

    /*绑定手机号*/
    private String phone;

    private Integer userId;

    private String status;

    public Applymention() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    public String getBankSubbranch() {
        return bankSubbranch;
    }

    public void setBankSubbranch(String bankSubbranch) {
        this.bankSubbranch = bankSubbranch;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
