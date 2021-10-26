package org.acme.quarkus.sample.controller;

import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Param;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import org.acme.quarkus.sample.model.Greeting;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.enterprise.context.ApplicationScoped;

import static io.quarkus.vertx.web.Route.HttpMethod.DELETE;
import static io.quarkus.vertx.web.Route.HttpMethod.GET;
import static io.quarkus.vertx.web.Route.HttpMethod.POST;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-demo
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/26/2021
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
@ApplicationScoped
@RouteBase(path = "/vertx", produces = "application/json")
@Tag(name = "Vert.x Resource", description = "Basic Hello World using Vert.x")
public class VertxGreeting {
    @Route(path = "/hello", methods = GET)
    public Greeting helloVertX() {
        return new Greeting("Hello", "Vert.x");
    }

    @Route(path = "/hello", methods = POST)
    public Greeting newHelloVertX(@Body Greeting greeting) {
        return greeting;
    }

    @Route(path = "/hello/:message", methods = DELETE)
    public boolean deleteHelloVertX(@Param("message") String message) {
        return true;
    }
}
