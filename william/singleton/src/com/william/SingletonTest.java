package com.william;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton s1 = Singleton.newInstance();
        Singleton s2 = Singleton.newInstance();
        assertEquals(s1, s2);
    }
}
