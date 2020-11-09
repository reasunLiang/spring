package com.Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : lyx
 * @Date : 2020/10/22 16:16
 * @Version : 1.0
 */
@WebServlet({"/demo3","/demo4"})
public class HttpServletTest extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("key","就这？");
        /**
         * 请求转发必须要以斜杠开头。表示地址“http://ip:port/工程名/，映射到IDEA代码的web目录”
         */
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/checkCode");

        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost......");
    }
}
