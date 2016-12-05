package com.william.multfactory;


public class SenderFactory {
    public Sender produceMailSender() {
        return new MailSender();
    }
    public Sender produceSmsSender() {
        return new SmsSender();
    }
}
