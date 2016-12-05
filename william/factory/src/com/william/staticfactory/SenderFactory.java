package com.william.staticfactory;


public class SenderFactory {
    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }
}
