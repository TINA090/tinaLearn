package com.william.staticfactory;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SmsSender implements Sender {
    @Override
    public String send() {
        return "Send Sms";
    }
}
