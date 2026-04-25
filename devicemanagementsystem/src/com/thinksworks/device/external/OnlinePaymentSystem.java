package com.thinksworks.device.external;

import com.thinksworks.device.business.Billing;
import com.thinksworks.device.business.Refund;
import com.thinksworks.device.functional.Payment;

public class OnlinePaymentSystem implements Payment, Billing, Refund {
    @Override
    public void makePayment() {
        System.out.println("Payment Done");
    }

    @Override
    public void generateBill() {
        System.out.println("Bill Generated");
    }

    @Override
    public void processRefund() {
        System.out.println("Refund Processed");
    }
}
