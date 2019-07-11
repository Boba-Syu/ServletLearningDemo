package com.boba.servlet.servletConfig;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigTest extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {
        //ServeltConfig的数据有单个Servlet享用,
        ServletConfig config = this.getServletConfig();
        //添加信息和获取信息和ServletContext是一样的
        config.getInitParameter("name");
    }
}
