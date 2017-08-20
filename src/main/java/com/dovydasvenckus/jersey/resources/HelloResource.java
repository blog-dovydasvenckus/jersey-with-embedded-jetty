package com.dovydasvenckus.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(@PathParam("param") String msg) {
        return "Hello " + msg + "\n";
    }
}
