package org.acme.quarkus.sample.model;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-demo
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/26/2021
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
@QuarkusTest
public class GreetingTest {
    @Test
    public void testJaxRsEndpoint() {
        given()
                .when().get("/jax-rs/hello")
                .then()
                .statusCode(200)
                .body(containsString("Hello"), containsString("JAX-RS"));
    }

    @Test
    public void testSpringEndpoint() {
        given()
                .when().get("/spring/hello")
                .then()
                .statusCode(200)
                .body(containsString("Hello"), containsString("Spring"));
    }


    @Test
    public void testVertxEndpoint() {
        given()
                .when().get("/vertx/hello")
                .then()
                .statusCode(200)
                .body(containsString("Hello"), containsString("Vert.x"));
    }

}
