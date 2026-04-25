package com.thinksworks.order.Service;

public class OrderService {
    NotificationService notificationService;

    public OrderService(NotificationService notificationService ) {
        this.notificationService = notificationService;
    }

    public void placeOrder(){
        System.out.println("Order Placed");
        notificationService.sendNotification();
    }


}
