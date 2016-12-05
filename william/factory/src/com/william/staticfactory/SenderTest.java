package com.william.staticfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SenderTest {
    @Test
    public void senderTest() {
        Sender sender1 = SenderFactory.produceMailSender();
        assertEquals("Send Mail", sender1.send());

        Sender sender2 = SenderFactory.produceSmsSender();
        assertEquals("Send Sms", sender2.send());
    }
}
