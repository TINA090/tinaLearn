package com.thoughtworks.member;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/24.
 */
public abstract class Member {

    protected String userId;
    protected Date registrationDate;
    protected Date expiryDate;
    protected float price;
    protected int freePerMonth;
    protected float additionalPercentage;
    protected Member(String userId, float price, int freePerMonth, float additionalPercentage) {
        this.userId = userId;
        this.price = price;
        this.freePerMonth = freePerMonth;
        this.registrationDate = new Date();
        this.calExpiryDate();

    }
    protected abstract void calExpiryDate();
}
