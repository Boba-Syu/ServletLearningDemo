package com.boba.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class FilterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Writer out = response.getWriter();
        out.write("<p>servlet调用。 </p>");
        System.out.println("servlet调用。 ");
    }
}
