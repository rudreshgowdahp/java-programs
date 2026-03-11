package com.thinksworks.Ticket.internal;

public class Shooting {

    private void shootingTime(){
        System.out.println("Shooting time is  morning 9:30");
    }
    void shootingLocation(){
        System.out.println("Shooting location is Dubai");
    }
    public void shootingDisplay(){
        System.out.println("Displaying the shooting details");
        shootingTime();
        shootingLocation();
    }
}
