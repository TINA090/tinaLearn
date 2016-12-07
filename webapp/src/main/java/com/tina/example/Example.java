package com.tina.example;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2016/12/5.
 */
@Path("/demo")
public class Example {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello World!" ;
    }




    @GET
    @Path("/{aaaa}-{bbbb}")
    @Produces("text/plain;charset=UTF-8")
    public String sayHelloToUTF8(@PathParam("aaaa") String username, @PathParam("bbbb") String password) {
        return "Hello " + username + "+" + password;
    }

    @GET
    @Path("/{aaaa}")
    @Produces("text/plain;charset=UTF-8")
    public String sayHelloToUTF82(@PathParam("aaaa") String username) {
        return "Hello " + username + "+";
    }
    

    

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public User sayHelloToJson(@QueryParam("username") String username, @QueryParam("id") int id) {
        User user= new User();
        user.setId(id);
        user.setName(username);
        return user;
    }


    @POST
    @Path("/update/{aaaa}")
    @Produces(MediaType.APPLICATION_JSON)
    public User updateUser(User user) {
        System.out.println(user);
        if (user == null) {
            user = new User();
        }
        user.setId(2);
        user.setName("update name:"+user.getName());
        return user;
    }
    

    
}
