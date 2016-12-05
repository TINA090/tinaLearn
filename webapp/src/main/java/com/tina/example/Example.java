package com.tina.example;

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
    @Path("/{param}")
    @Produces("text/plain;charset=UTF-8")
    public String sayHelloToUTF8(@PathParam("param") String username) {
        return "Hello " + username;
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public User sayHelloToJson(@QueryParam("username") String username) {
        User user= new User();
        user.setId(1);
        user.setName(username);
        return user;
    }


    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User updateUser(User user) {
        user.setId(2);
        user.setName("update name:"+user.getName());
        return user;
    }
}
