package org.acme.quarkus.sample.controller;

import org.acme.quarkus.sample.model.Greeting;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-demo
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/26/2021
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/other/hello/*")
public class ServletGreeting extends HttpServlet {

    private static final Jsonb JSONB = JsonbBuilder.create();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType("application/json");
        Greeting greeting = new Greeting("Hello", "Other");
        PrintWriter out = response.getWriter();
        out.print(JSONB.toJson(greeting));
    }
}
