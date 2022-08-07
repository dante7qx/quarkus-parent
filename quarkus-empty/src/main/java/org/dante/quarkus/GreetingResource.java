package org.dante.quarkus;

import java.time.Instant;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dante.quarkus.vo.MsgVO;

/**
 * 你好 Quarkus
 * 
 * @author dante
 */
@Path("/")
public class GreetingResource {

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive！你好";
    }
    
    @GET
    @Path("msg")
    @Produces(MediaType.APPLICATION_JSON)
    public MsgVO msg() {
        return new MsgVO("11", "Quarkus", Date.from(Instant.now()));
    }
    
}