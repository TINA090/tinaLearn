package com.tina.main;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.tina.example.User2;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int getPort(int defaultPort) {
        //grab port from environment, otherwise fall back to default port 9998
        String httpPort = System.getProperty("jersey.test.port");
        if (null != httpPort) {
            try {
                return Integer.parseInt(httpPort);
            } catch (NumberFormatException e) {
            }
        }
        return defaultPort;
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/").port(getPort(8080)).build();
    }

    public static final URI BASE_URI = getBaseURI();

    protected static HttpServer startServer() throws IOException {
        System.out.println("Starting grizzly...");
        ResourceConfig rc = new ResourceConfig();
        rc.packages(true, "com.tina");
        return GrizzlyHttpServerFactory.createHttpServer(getBaseURI(), rc);
    /*
        final Map<String, String> initParams = new HashMap<String, String>();

        initParams.put("com.sun.jersey.config.property.packages", "com.esri");

        System.out.println("Starting grizzly2...");
        return GrizzlyWebContainerFactory.create(BASE_URI, initParams);
    */
    }

    public static void main(String[] args) throws IOException {
        // Grizzly 2 initialization
        HttpServer httpServer = startServer();
        System.out.println(String.format("Jersey app started with WADL available at "
                        + "%sapplication.wadl \n Hit enter to stop it...",
                BASE_URI));
        System.in.read();
        httpServer.shutdown();
    }
    public List<User2> insertlist;
    public Main(){
    	 this.insertlist= new ArrayList<User2>();
    }
    //插入用户
    public void InsertUser(User2 u2){
    	insertlist.add(u2);
    }
    
    //查询所有用户
    public List SearchAllUser(){
    	return insertlist;
    }
    
    //查询指定username的用户
    public User2 SearchByUser(String name){
    	for(int i=0;i<insertlist.size();i++){
    		User2 tempUser= new User2();
    		if(tempUser.getName()==name){
    			return tempUser;
    		}
    	}
		return null;	
    }
    
    //查询指定id的用户
    public User2 SearchById(int id){
    	for(int i =0;i<insertlist.size();i++){
    		User2 tempUser= new User2();
    		if(tempUser.getId()==id){
    			return tempUser;
    		}
    	}
    	return null;
    }
    //编辑指定id的用户
    public User2 UpdateByID(int id, User2 ur){
    	for(int i =0;i<insertlist.size();i++){
    		User2 tempUser= new User2();
    		if(tempUser.getId()==id){
    			tempUser.setName(ur.getName());
    			tempUser.setPassword(ur.getPassword());
    			return tempUser;
    		}
    	}
    	return null;
    }
    
    public User2 DeleteByID(int id){
    	for(int i =0;i<insertlist.size();i++){
    		User2 tempUser= new User2();
    		if(tempUser.getId()==id){
    			insertlist.remove(tempUser);
    			return tempUser;
    		}
    	}
    	return null;
    }
    
    
 }
  
   
