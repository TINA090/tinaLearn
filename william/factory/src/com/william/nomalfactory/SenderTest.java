package com.william.nomalfactory;

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
        Sender sender1 = sf.produce("mail");
        assertEquals("Send Mail", sender1.send());

        Sender sender2 = sf.produce("sms");
        assertEquals("Send Sms", sender2.send());

        Sender sender3 = sf.produce("Xxx");
        assertNull(sender3);
    }
}
