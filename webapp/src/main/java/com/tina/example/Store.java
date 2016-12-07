package com.tina.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/7.
 */
public class Store {
    private static Store store;
    private List<User> userList;
    private int nextId;
    private Store(){
        userList = new ArrayList<User>();
        nextId = 0;
    }

    public static Store getInstance() {
        if (store == null) {
            store = new Store();
        }
        return store;
    }

    public static User save(User user) {
        if (user != null) {
            Store store = getInstance();
            int id = store.getNextId();
            user.setId(id);
            store.getUserList().add(user);
        }
        return user;
    }

    public List<User> getList() {
        return userList;
    }

    public static List<User> getUserList() {
        Store store = getInstance();
        return store.getList();
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getNextId() {
        return nextId ++;
    }

}
