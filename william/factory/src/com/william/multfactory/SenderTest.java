package com.william.multfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SenderTest {
    @Test
    public void senderTest() {
        SenderFactory sf = new SenderFactory();
        Sender sender1 = sf.produceMailSender();
        assertEquals("Send Mail", sender1.send());

        Sender sender2 = sf.produceSmsSender();
        assertEquals("Send Sms", sender2.send());
    }
}
