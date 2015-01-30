package com.threestoges.bdreview.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.threestoges.bdreview.services.UserService;







@Path("/user")
public class UserController {

	 
    @GET
    @Path("/{parameter}")
    public Response responseMsg( @PathParam("parameter") String parameter,
            @DefaultValue("Nothing to say") @QueryParam("value") String value) {
 
    	System.out.println("hello");
        String output = "Hello from: " + parameter + " : " + value;
 
        return Response.status(200).entity(output).build();

    }   
    
    
    @GET
    @Produces("application/json")
    public Response getUsers() {
        Map<Object, Object> apiResponse = new HashMap<Object, Object>();
        try {

        	UserService us = new UserService();
            List<String> userList = us.getUsers();
        	
            Map<Object, Object> result = new HashMap<Object, Object>();
           
            result.put("total", userList.size())   ;
            apiResponse.put("result",result);
            apiResponse.put("entries",userList);

            return Response.ok(apiResponse).build();
        } catch (Exception e) {
          
            apiResponse.put("error",e.getMessage());
        }

        return Response.status(400).entity(apiResponse).build();
    }
	
}




