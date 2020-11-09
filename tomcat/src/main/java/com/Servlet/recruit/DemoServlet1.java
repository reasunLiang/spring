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
@WebServlet("/servlet1")
public class DemoServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("response1");

        req.setAttribute("key","就这？？？？");

//        //设置状态码为302，有义务告诉别人该地址已经改了
//        resp.setStatus(302);
//        //这是请求头的地址
//        resp.setHeader("Location","http://localhost:8080/servlet2");

        //直接设置固定的状态码
        resp.sendRedirect("http://localhost:8080/servlet2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
