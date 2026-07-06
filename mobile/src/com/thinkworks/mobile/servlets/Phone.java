package com.thinkworks.mobile.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
 @WebServlet(urlPatterns = "/createuser")
public class Phone extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = servletRequest.getParameter("name");
        System.out.println(name);
        String phoneNumber = servletRequest.getParameter("PhoneNumber");
        System.out.println(phoneNumber);
        String age = servletRequest.getParameter("age");
        System.out.println(age);
        String location = servletRequest.getParameter("location");
        System.out.println(location);
        String email = servletRequest.getParameter("email");
        System.out.println(email);


        System.out.println("Servlets running");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletResponse.sendRedirect("index.html");
    }
}
