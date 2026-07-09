package com.thinkworks.mobile.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/createemployee")
public class EmployeeServlet  extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String employeeId = servletRequest.getParameter("employeeId");
        System.out.println(employeeId);
        String employeeName = servletRequest.getParameter("employeeName");
        System.out.println(employeeName);
        String email = servletRequest.getParameter("email");
        System.out.println(email);
        String phone = servletRequest.getParameter("phone");
        System.out.println(phone);
        String password = servletRequest.getParameter("password");
        System.out.println(password);
        String department = servletRequest.getParameter("department");
        System.out.println(department);
        String designation = servletRequest.getParameter("designation");
        System.out.println(designation);
        String salary = servletRequest.getParameter("salary");
        System.out.println(salary);
        String joiningDate = servletRequest.getParameter("joiningDate");
        System.out.println(joiningDate);
        String address = servletRequest.getParameter("address");
        System.out.println(address);
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

       httpServletResponse.sendRedirect("index.html");

    }
}
