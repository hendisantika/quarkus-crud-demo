package org.acme.quarkus.sample.controller;

import org.acme.quarkus.sample.model.Greeting;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-demo
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/26/2021
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/jax-rs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "JAX-RS Resource", description = "Basic Hello World using JAX-RS")
public class JaxRsGreeting {
    @GET
    @Path("/hello")
    public Greeting helloJaxRs() {
        return new Greeting("Hello", "JAX-RS");
    }
}
