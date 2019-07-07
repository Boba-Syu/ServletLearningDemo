package com.boba.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MI on 2019/7/7.
 */
public class ServletGetAndPost extends HttpServlet {
    /* 浏览器访问时优先使用service方法, get方法和post方法均适用,
       若未重写service方法, 同时也未重写对应的doGet或doPost方法, 则会报错 */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String data = "This is service method.\n";
        response.getWriter().write(data);
        System.out.println(data);
        /* 调用父类service方法, 这样执行完该方法后就会调用对应的doGet或者doPost方法 */
        super.service(request, response);
    }

    /* 浏览器使用get方法时使用, 但优先使用service方法,
       若重写的service方法调用了父类的service的方法的话, 则父类会调用重写的get或者post方法,否则不会调用 */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String data = "This is doGet method.\n";
        response.getWriter().write(data);
        System.out.println(data);
    }

    /* 浏览器使用post方法时使用, 但优先使用service方法,
       若重写的service方法调用了父类的service的方法的话, 则父类会调用重写的get或者post方法,否则不会调用 */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String data = "This is doPost method";
        response.getWriter().write(data);
        System.out.println(data);
    }
}
