package com.william.nomalfactory;


public class SenderFactory {
    public Sender produce(String type) {
        switch (type) {
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
            default:
                return null;
        }
    }
}
