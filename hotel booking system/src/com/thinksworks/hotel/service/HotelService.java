package com.thinksworks.hotel.service;

import com.thinksworks.hotel.dto.BookingDetails;
import com.thinksworks.hotel.dto.Guest;
import com.thinksworks.hotel.dto.Room;

public class HotelService {

    public void printRoomDetails(Room room) {
        System.out.println("Room Number:" + room.getRoomNumber());
        System.out.println("Room price is:" + room.getPrice());
        System.out.println("Room type :" + room.getRoomType());
        System.out.println("Room is avaliable:" + room.isAvailable());
        System.out.println("--------");
    }

    public void printGuestDetails(Guest guest) {
        System.out.println("Guest name :" + guest.getGuestName());
        System.out.println("Guest id:" + guest.getGuestId());
        System.out.println("Guest phone number:" + guest.getPhone());
        System.out.println("--------");
    }

    public void printBookingDetails(BookingDetails bookingDetails) {
        System.out.println("Booking id :" + bookingDetails.getBookingId());
        for (Guest guest:bookingDetails.getGuest())
        System.out.println("Booking guest name:" + guest.getGuestName());
            System.out.println("room :" + bookingDetails.getBookingsStatus());
        System.out.println("--------");
    }

    public void showAvailableRooms(Room[] rooms) {
        System.out.println(" Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room no:" + room.getRoomNumber());
            } 
        }
    }
}
