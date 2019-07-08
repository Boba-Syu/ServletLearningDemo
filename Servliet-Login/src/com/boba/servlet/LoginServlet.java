package com.boba.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MI on 2019/7/8.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       /* String method = request.getMethod(); // 获取请求方式
        System.out.println("method: " + method);
        StringBuffer url = request.getRequestURL(); // 获取url
        System.out.println("url: " + url);
        String uri = request.getRequestURI(); // 获取URI
        System.out.println("uri: " + uri);
        String scheme = request.getScheme(); // 获取传输协议(http)
        System.out.println("scheme: " + scheme);*/
        request.setCharacterEncoding("utf-8"); // 设置接收过来的请求的编码
        response.setContentType("text/html;charset=utf-8"); // 设置发送的http请求编码
        String uid = request.getParameter("uid");
        String pwd = request.getParameter("pwd");
        System.out.println(uid + ": " + pwd);
        if (uid.equals("123") && pwd.equals("123")) {
            // 请求转发, 登陆成功跳转到main界面
            // 请求转发会造成表单重复提交
            // request.getRequestDispatcher("main").forward(request, response);
            // 使用重定向
            // 请求转发只进行了一次请求, 地址栏不变, 而重定向进行了两次请求, 地址栏改变
            response.sendRedirect("main");
        } else {
            request.setAttribute("msg","登录失败");
            // 请求转发, 登陆失败则返回登录界面
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}