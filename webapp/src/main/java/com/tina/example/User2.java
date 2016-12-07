package com.tina.example;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/5.
 */
public class User2  implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String password;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
