package com.tina.example;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2016/12/5.
 */
@Path("/demo")
public class Example2 {
	 public List<User2> insertlist;
	    public Example2(){
	    	 this.insertlist= new ArrayList<User2>();
	    }
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello World!" ;
    }

    //插入用户
    @POST
    @Path("/insert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User2 insertUser2(@QueryParam("name") String name,@QueryParam("password") String password){
    	User2 user= new User2();
    	user.setId(insertlist.size());
    	user.setName(name);
    	user.setPassword(password);
    	insertlist.add(user);
    	return user;
    }
    
    //查询所有用户
    @GET
    @Path("/user/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List SearchAllUser(){
    	return insertlist;
    }
    
    //查询指定username的用户
    @GET
    @Path("/user?username=<xxxx>")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User2 SearchByUser(@PathParam("username") String name){
    	for(int i=0;i<insertlist.size();i++){
    		
    		if(insertlist.get(i).getName()==name){
    			return insertlist.get(i);
    		}
    	}
		return null;	
    }

    //查询指定id的用户
    @GET
    @Path("/user/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User2 SearchById(@PathParam("id") int id){
    	for(int i =0;i<insertlist.size();i++){
    	
    		if(insertlist.get(i).getId()==id){
    			return insertlist.get(i);
    		}
    	}
    	return null;
    }
//  @GET
//  @Path("/{param}")
//  @Produces("text/plain;charset=UTF-8")
//  public String sayHelloToUTF8(@PathParam("param") String username) {
//      return "Hello " + username;
//  }

    //编辑指定id的用户
    @PUT
    @Path("/user/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User2 UpdateByID(@PathParam("id") int id, User2 user){
    	for(int i =0;i<insertlist.size();i++){
    		if(insertlist.get(i).getId()==id){
    			insertlist.get(i).setName(user.getName());
    			insertlist.get(i).setPassword(user.getPassword());
    			return insertlist.get(i);
    		}
    	}
    	return null;
    }
    
    
    //删除制定ID的user
    @DELETE
    @Path("/user/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User2 DeleteByID(@PathParam("id") int id){
    	for(int i =0;i<insertlist.size();i++){
    		User2 tempUser= new User2();
    		if(tempUser.getId()==id){
    			insertlist.remove(tempUser);
    			return tempUser;
    		}
    	}
    	return null;
    }
    
    

//    @GET
//    @Path("/get")
//    @Produces(MediaType.APPLICATION_JSON)
//    public User sayHelloToJson(@QueryParam("username") String username) {
//        User user= new User();
//        user.setId(1);
//        user.setName(username);
//        return user;
//    }


//    @POST
//    @Path("/update")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public User updateUser(User user) {
//        user.setId(2);
//        user.setName("update name:"+user.getName());
//        return user;
//    }
//    

    
}
