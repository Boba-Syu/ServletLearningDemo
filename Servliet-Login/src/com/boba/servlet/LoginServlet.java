package com.boba.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MI on 2019/7/8.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String method = request.getMethod(); // 获取请求方式
        System.out.println("method: " + method);
        StringBuffer url = request.getRequestURL(); // 获取url
        System.out.println("url: " + url);
        String uri = request.getRequestURI(); // 获取URI
        System.out.println("uri: " + uri);
        String scheme = request.getScheme(); // 获取传输协议(http)
        System.out.println("scheme: " + scheme);
        request.setCharacterEncoding("utf-8"); // 设置接收过来的请求的编码
        response.setContentType("text/html;charset=utf-8"); // 设置发送的http请求编码
        String uid = request.getParameter("uid");
        String pwd = request.getParameter("pwd");
        response.getWriter().write("<html>");
        response.getWriter().write("<head>");
        response.getWriter().write("<title>登陆</title>");
        response.getWriter().write("</head>");
        response.getWriter().write("</body>");
        response.getWriter().write("<h1>登陆成功!</h1>" +
                                      "<p>用户id:"+uid+"</p>" +
                                      "<p>用户密码:"+pwd+"</p>");
        response.getWriter().write("</body>");
        response.getWriter().write("</html>");
    }
}
