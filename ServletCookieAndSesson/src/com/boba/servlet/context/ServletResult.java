package com.boba.servlet.context;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletResult extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ServletContext sc = this.getServletContext();

        //数据存储
        String name = sc.getInitParameter("name");
        String data = (String) sc.getAttribute("data");
        response.getWriter().write(name + ": " + data);
    }
}
