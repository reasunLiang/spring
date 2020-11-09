package com.Servlet.recruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : lyx
 * @Date : 2020/10/23 11:45
 * @Version : 1.0
 */
@WebServlet("/servlet2")
public class DemoServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("response2");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write(req.getAttribute("key").toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
