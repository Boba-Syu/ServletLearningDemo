package com.boba.servlet.session;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ServletSession extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // session能够处理一个用户的不同请求的数据共享
        // session有服务端创建，服务器会通过cookie将其对应的session的ID（JSESSIONID）传给浏览器
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 有session则获取，没有或已失效则创建
        HttpSession session = request.getSession();
        // session默认时效为三十分钟，意思是在指定的时间内没使用则销毁，使用了则重新计时
        session.setMaxInactiveInterval(1 * 60 * 60);
        // 强制销毁
        //session.invalidate();
        session.setAttribute("uname","boba");
        response.getWriter().write("This is a session test.<br>");
        response.getWriter().write("session ID：" + session.getId() + "<br>");
    }
}
