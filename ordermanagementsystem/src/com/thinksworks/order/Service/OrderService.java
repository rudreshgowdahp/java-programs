package com.thinksworks.order.Service;

public class OrderService extends EmailService {
    EmailService emailService = new EmailService();

    public void placeOrder(){
        System.out.println("Order Placed");
        emailService.sendEmail();
    }


}
