package com.tina.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/12/5.
 */
@Path("/user")
public class Example {
    @POST
    @Path("/insert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User insert(User user) {
        Store.save(user);
        return user;
    }

    @GET
    @Path("/list")
    public List<User> list() {
        return Store.getUserList();
    }

    @GET
    @Path("/{id}")
    public User getById(@PathParam("id") int id) {
        for (User user : Store.getUserList()) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @GET
    public List<User> getByUsername(@QueryParam("username") String username) {
        List<User> returnUser = new ArrayList<User>();
        for (User user : Store.getUserList()) {
            if (user.getUsername().equals(username)) {
                returnUser.add(user);
            }
        }
        return returnUser;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User updateById(@PathParam("id")int id, User user) {
        for (User storedUser : Store.getUserList()) {
            if (storedUser.getId() == id) {
                storedUser.setUsername(user.getUsername());
                storedUser.setPassword(user.getPassword());
                return storedUser;
            }
        }
        return null;
    }

    @DELETE
    @Path("/{id}")
    public User removeById(@PathParam("id")int id) {
        Iterator<User> it = Store.getUserList().iterator();
        while(it.hasNext()) {
            User user = it.next();
            if (user.getId() == id) {
                it.remove();
                return user;
            }
        }
        return null;
    }

}
