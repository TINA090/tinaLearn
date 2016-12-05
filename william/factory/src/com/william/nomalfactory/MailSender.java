package com.william.nomalfactory;

/**
 * Created by Administrator on 2016/11/22.
 */
public class MailSender implements Sender {
    @Override
    public String send() {
        return "Send Mail";
    }
}
