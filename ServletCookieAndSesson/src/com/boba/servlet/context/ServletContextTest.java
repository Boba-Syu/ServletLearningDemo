package com.boba.servlet.context;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContextTest extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // ServletContext和session一样有服务创建,
        // 但是session服务单个用户, ServletContext服务所有的用户, 多个用户共享信息
        // ServletContext在服务器启动时被创建, 服务器关闭时被销毁
        // 一下三种方式获得的是同一个对象
        ServletContext sc = this.getServletContext();
        //ServletContext sc2 = this.getServletConfig().getServletContext();
        //ServletContext sc3 = request.getSession().getServletContext();

        String name = sc.getInitParameter("name");
        //数据存储
        sc.setAttribute("data", "This is a ServletContext result.");
        response.getWriter().write(name + ": ");
        response.getWriter().write("This is a ServletContext test.");
    }
}
