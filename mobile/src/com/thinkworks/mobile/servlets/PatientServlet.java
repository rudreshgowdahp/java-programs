package com.thinkworks.mobile.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/createpatient")

public class PatientServlet extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        String patientId = servletRequest.getParameter("patientId");
        System.out.println(patientId);
        String patientName = servletRequest.getParameter("patientName");
        System.out.println(patientName);
        String age = servletRequest.getParameter("age");
        System.out.println(age);
        String gender = servletRequest.getParameter("gender");
        System.out.println(gender);
        String bloodGroup = servletRequest.getParameter("bloodGroup");
        System.out.println(bloodGroup);
        String phone = servletRequest.getParameter("phone");
        System.out.println(phone);
        String email = servletRequest.getParameter("email");
        System.out.println(email);
        String doctorName = servletRequest.getParameter("doctorName");
        System.out.println(doctorName);
        String appointmentDate = servletRequest.getParameter("appointmentDate");
        System.out.println(appointmentDate);
        String medicalProblem = servletRequest.getParameter("medicalProblem");
        System.out.println(medicalProblem);
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletResponse.sendRedirect("index.html");

    }
}
