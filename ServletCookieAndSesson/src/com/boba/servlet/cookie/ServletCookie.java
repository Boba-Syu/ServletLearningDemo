package com.boba.servlet.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletCookie extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 新建cookie，为键值对的形式
        Cookie cookie = new Cookie("uname","boba");
        Cookie cookie2 = new Cookie("password","123456");
        // 设置cookie的有效时长， 否则cookie会在关闭浏览器是被销毁
        cookie.setMaxAge(60 * 60 * 24); // 一秒为单位
        // 设置有效路径，只有在设置的路径下才会在请求中加入cookie，默认是所有的都会加入
        cookie.setPath("web/result");
        response.addCookie(cookie);
        response.addCookie(cookie2);
        response.getWriter().write("this is a Cookie test.\n");
        //response.sendRedirect("result");
    }
}
