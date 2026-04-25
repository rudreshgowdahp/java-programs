package com.thinksworks.device.external;

import com.thinksworks.device.business.Delivery;
import com.thinksworks.device.business.Order;
import com.thinksworks.device.business.Tracking;

public class ECommerceApp implements Order, Delivery, Tracking {
    @Override
    public void placeOrder() {
        System.out.println("Order Placed");
    }

    @Override
    public void deliver() {
        System.out.println("Delivered");
    }

    @Override
    public void track() {
        System.out.println("Tracking Order");
    }
}
