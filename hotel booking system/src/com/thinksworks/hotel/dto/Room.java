package com.thinksworks.hotel.dto;

import com.thinksworks.hotel.enums.RoomType;

public class Room {
    private int roomNumber;
    private double price;
    private RoomType roomType;
    private boolean available;

    public Room(int roomNumber, double price, RoomType roomType, boolean available) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
