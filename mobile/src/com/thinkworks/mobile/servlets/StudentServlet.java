package com.thinkworks.mobile.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/createstudent")
public class StudentServlet extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String studentId = servletRequest.getParameter("studentId");
        System.out.println(studentId);
        String firstName = servletRequest.getParameter("firstName");
        System.out.println(firstName);
        String lastName = servletRequest.getParameter("lastName");
        System.out.println(lastName);
        String email = servletRequest.getParameter("email");
        System.out.println(email);
        String password = servletRequest.getParameter("password");
        System.out.println(password);
        String age = servletRequest.getParameter("age");
        System.out.println(age);
        String gender = servletRequest.getParameter("gender");
        System.out.println(gender);
        String course = servletRequest.getParameter("course");
        System.out.println(course);
        String phone = servletRequest.getParameter("phone");
        System.out.println(phone);
        String address = servletRequest.getParameter("address");
        System.out.println(address);


        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletResponse.sendRedirect("index.html");

    }
}
