package com.thoughtworks.member;

import java.util.Calendar;

/**
 * Created by Administrator on 2016/11/24.
 */
public class PermanentMember extends Member {
    protected PermanentMember(String userId) {
        super(userId, 10000, 30, 0.5f);
    }

    @Override
    protected void calExpiryDate() {
        Calendar fromCal = Calendar.getInstance();
        fromCal.setTime(this.registrationDate);
        fromCal.set(Calendar.YEAR, fromCal.get(Calendar.YEAR) + 10);
        this.expiryDate = fromCal.getTime();
    }
}
