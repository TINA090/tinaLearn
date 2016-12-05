package com.william;

/**
 * Created by Administrator on 2016/11/22.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton newInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
