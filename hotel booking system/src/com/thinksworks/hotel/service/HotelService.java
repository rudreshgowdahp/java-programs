package com.thinksworks.hotel.service;

import com.thinksworks.hotel.dto.Booking;
import com.thinksworks.hotel.dto.Guest;
import com.thinksworks.hotel.dto.Room;
import com.thinksworks.hotel.enums.RoomType;

public class HotelService {

    public void printRoomDetails(Room room){
        System.out.println("Room Number:"+room.getRoomNumber());
        System.out.println("Room price is:"+room.getPrice());
        System.out.println("Room type :"+ room.getRoomType());
        System.out.println("Room is avaliable:"+room.isAvailable());
    }
    public void printGuestDetails(Guest guest){
        System.out.println("Guest name :"+guest.getGuestName());
        System.out.println("Guest id:"+guest.getGuestId());
        System.out.println("Guest phone number:"+guest.getPhone());
    }
    public void printBookingDetails(Booking booking){
        System.out.println("--------");
        System.out.println("Booking id :"+booking.getBookingId());
        System.out.println("Booking guest name:"+booking.getGuest().getGuestName());
        for (Room room: booking.getRooms()) {
            System.out.println("room :"+booking.getBookingsStatus());
        }
    }
    public void showAvailableRooms(Room[] rooms){
        System.out.println(" Available Rooms");
        for (Room room1 :rooms){
            System.out.println(room1.isAvailable());
        }
    }
}
