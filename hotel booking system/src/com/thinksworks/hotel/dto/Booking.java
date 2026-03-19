package com.thinksworks.hotel.dto;

import com.thinksworks.hotel.enums.BookingsStatus;

public class Booking {
    private int bookingId;
    private Guest guest;
    private Room[] rooms;
    private int nights;
    private BookingsStatus bookingsStatus;

    public Booking(int bookingId, Guest guest, Room[] rooms, int nights, BookingsStatus bookingsStatus) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.rooms = rooms;
        this.nights = nights;
        this.bookingsStatus = bookingsStatus;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public BookingsStatus getBookingsStatus() {
        return bookingsStatus;
    }

    public void setBookingsStatus(BookingsStatus bookingsStatus) {
        this.bookingsStatus = bookingsStatus;
    }
    public double calculateTotal(){
        double total =0;
        for (Room room:rooms){
            total = room.getPrice();
        }
        return total * nights;
    }
}

