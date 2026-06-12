package com.thinksworks.device.hybridinheritance;

import com.thinksworks.device.devicefeature.Speaker;
import com.thinksworks.device.functional.*;
import com.thinksworks.device.multipleinheritance.OnlinePaymentSystem;

import javax.sound.midi.Receiver;

public class AtmSystem extends Device implements Gps, Notification, Speaker {
    @Override
    public void navigate() {
        System.out.println("ATM gps");
    }

    @Override
    public void sendNotification() {
        System.out.println("ATM Notification");
    }

    @Override
    public void playSound() {
        System.out.println("ATM speaker");
    }

    public static void main(String[] args) {
        Payment payment = new OnlinePaymentSystem();
        payment.makePayment();
        }
    }

