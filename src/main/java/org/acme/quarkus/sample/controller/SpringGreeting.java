package org.acme.quarkus.sample.controller;

import org.acme.quarkus.sample.model.Greeting;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-demo
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/26/2021
 * Time: 3:40 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(value = "/spring", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Spring Resource", description = "Basic Hello World using Spring")
public class SpringGreeting {
    @GetMapping("/hello")
    public Greeting helloSpring() {
        return new Greeting("Hello", "Spring");
    }
}
