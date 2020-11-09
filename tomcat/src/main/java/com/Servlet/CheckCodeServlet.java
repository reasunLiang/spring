package com.Servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author : lyx
 * @Date : 2020/10/22 19:36
 * @Version : 1.0
 */

@WebServlet("/checkCode")
public class CheckCodeServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、创建一个图片对象,在内存中图片（验证码对象）
        BufferedImage bufferedImage = new BufferedImage(100, 50, BufferedImage.TYPE_INT_RGB);

        //2、梅花图片
        //2.1 填充颜色
        //画笔对象
        Graphics g = bufferedImage.getGraphics();
        //设置粉色
        g.setColor(Color.pink);
        //填充完成
        g.fillRect(0, 0, 100, 50);

        //2.2 画边框
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, 99, 49);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        Random random = new Random();
        for (int i = 1; i <= 4; i++) {
            int index = random.nextInt(str.length());
            char ch = str.charAt(index);
            g.drawString(ch + "", 20 * i, 25);
        }

        //3、将图片输出到页面展示
        ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
