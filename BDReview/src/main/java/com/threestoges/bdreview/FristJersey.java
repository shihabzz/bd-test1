package com.threestoges.bdreview;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;



@Path("/firstJersey")
public class FristJersey {

	 
    @GET
    @Path("/{parameter}")
    public Response responseMsg( @PathParam("parameter") String parameter,
            @DefaultValue("Nothing to say") @QueryParam("value") String value) {
 
    	System.out.println("hello");
        String output = "Hello from: " + parameter + " : " + value;
 
        return Response.status(200).entity(output).build();

    }   
	
}




