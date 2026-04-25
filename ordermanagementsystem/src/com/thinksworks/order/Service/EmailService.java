package com.thinksworks.order.Service;

public class EmailService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Send to email");
    }
}
