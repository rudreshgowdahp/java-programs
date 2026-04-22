package com.thinksworks.order.runner;

import com.thinksworks.order.Service.OrderService;

public class MainRunner {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder();

    }
}
