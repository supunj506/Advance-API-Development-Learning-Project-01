/*
 * Author  : supun@mj
 * Project : Hello_Java_EE
 * Date    : 9/12/2023 Tuesday
 * Time    : 11:16 PM
 * For GDSE course of IJSE institute.
 */

package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customer")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println("do get method is running perfectly!!!😊😊😊😊😊😊😊😊😊😊");*/
        resp.getWriter().write("Customer Method Invoked");

    }
}
