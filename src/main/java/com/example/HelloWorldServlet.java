package com.example;


import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/foo")
public class HelloWorldServlet {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String foo() {
        return "<b>Hello, World!</b>" + new Random().nextLong();
    }

}
