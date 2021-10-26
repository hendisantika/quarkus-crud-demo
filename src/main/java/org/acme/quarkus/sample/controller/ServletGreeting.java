package org.acme.quarkus.sample.controller;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

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
}
