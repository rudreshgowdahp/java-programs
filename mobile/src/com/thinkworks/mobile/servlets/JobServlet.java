package com.thinkworks.mobile.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/v")

public class JobServlet  extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String applicantId = servletRequest.getParameter("applicantId");
        System.out.println(applicantId);
        String applicantName = servletRequest.getParameter("applicantName");
        System.out.println(applicantName);
        String email = servletRequest.getParameter("email");
        System.out.println(email);
        String phone = servletRequest.getParameter("phone");
        System.out.println(phone);
        String password = servletRequest.getParameter("password");
        System.out.println(password);
        String dob = servletRequest.getParameter("dob");
        System.out.println(dob);
        String gender = servletRequest.getParameter("gender");
        System.out.println(gender);
        String qualification = servletRequest.getParameter("qualification");
        System.out.println(qualification);
        String experience = servletRequest.getParameter("experience");
        System.out.println(experience);
        String resume = servletRequest.getParameter("resume");
        System.out.println(resume);



        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletResponse.sendRedirect("index.html");

    }
}
