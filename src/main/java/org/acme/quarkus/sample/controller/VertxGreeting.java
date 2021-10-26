package org.acme.quarkus.sample.controller;

import io.quarkus.vertx.web.RouteBase;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.enterprise.context.ApplicationScoped;

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
}
