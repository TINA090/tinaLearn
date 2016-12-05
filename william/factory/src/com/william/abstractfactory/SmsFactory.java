package com.william.abstractfactory;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SmsFactory implements SenderFactory{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
