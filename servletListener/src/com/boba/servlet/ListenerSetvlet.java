package com.boba.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

public class ListenerSetvlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setAttribute("name","Boba");
        request.setAttribute("name","AAA");
        HttpSession sesseion =  request.getSession();
        sesseion.setAttribute("value", "zxc");
        sesseion.setAttribute("value", "asd");
        sesseion.removeAttribute("value");
        request.removeAttribute("name");
    }
}
