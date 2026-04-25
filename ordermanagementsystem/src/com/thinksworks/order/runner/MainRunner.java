package com.thinksworks.order.runner;

import com.thinksworks.order.Service.EmailService;
import com.thinksworks.order.Service.OrderService;
import com.thinksworks.order.Service.PhoneNumberService;
import com.thinksworks.order.Service.WhatsAppService;

public class MainRunner {
    public static void main(String[] args) {
        EmailService emailService = new  EmailService();
        PhoneNumberService phoneNumberService =  new PhoneNumberService();
        WhatsAppService whatsAppService = new  WhatsAppService();
        OrderService orderService = new OrderService(emailService);
        orderService.placeOrder();

    }
}
