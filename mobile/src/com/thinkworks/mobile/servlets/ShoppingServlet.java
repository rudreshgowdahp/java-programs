package com.thinkworks.mobile.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/createshoppig")

public class ShoppingServlet extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String customerName = servletRequest.getParameter("customerName");
        System.out.println(customerName);
        System.out.println("RUdra");
        System.out.println("Ruiftra");
        System.out.println("trewq");
        String email = servletRequest.getParameter("email");
        System.out.println(email);
        String phone = servletRequest.getParameter("phone");
        System.out.println(phone);
        String productName = servletRequest.getParameter("productName");
        System.out.println(productName);
        String productId = servletRequest.getParameter("productId");
        System.out.println(productId);
        String quantity = servletRequest.getParameter("quantity");
        System.out.println(quantity);
        String color = servletRequest.getParameter("color");
        System.out.println(color);
        String size = servletRequest.getParameter("size");
        System.out.println(size);
        String address = servletRequest.getParameter("address");
        System.out.println(address);
        String paymentMethod = servletRequest.getParameter("paymentMethod");
        System.out.println(paymentMethod);
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletResponse.sendRedirect("index.html");

    }
}
