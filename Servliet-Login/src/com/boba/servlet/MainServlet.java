package com.boba.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MI on 2019/7/8.
 */
public class MainServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8"); // 设置接收过来的请求的编码
        response.setContentType("text/html;charset=utf-8"); // 设置发送的http请求编码
        String uid = request.getParameter("uid");
        String pwd = request.getParameter("pwd");
        System.out.println(uid + ": " + pwd);
        response.getWriter().write("<html>");
        response.getWriter().write("<head>");
        response.getWriter().write("<title>登陆</title>");
        response.getWriter().write("</head>");
        response.getWriter().write("</body>");
        response.getWriter().write("<h1>登陆成功!</h1>" +
                "<p>用户id:" + uid + "</p>" +
                "<p>用户密码:" + pwd + "</p>");
        response.getWriter().write("</body>");
        response.getWriter().write("</html>");
    }
}
