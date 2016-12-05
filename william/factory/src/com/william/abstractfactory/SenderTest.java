package com.william.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SenderTest {
    @Test
    public void senderTest() {
        SenderFactory sf = new MailFactory();
        Sender sender1 = sf.produce();
        assertEquals("Send Mail", sender1.send());

        sf = new SmsFactory();
        Sender sender2 = sf.produce();
        assertEquals("Send Sms", sender2.send());
    }
}
