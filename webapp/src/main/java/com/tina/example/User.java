package com.tina.example;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/5.
 */
public class User  implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
