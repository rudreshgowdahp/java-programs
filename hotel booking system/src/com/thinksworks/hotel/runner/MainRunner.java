package com.thinksworks.hotel.runner;

import com.thinksworks.hotel.dto.BookingDetails;
import com.thinksworks.hotel.dto.Guest;
import com.thinksworks.hotel.dto.Room;
import com.thinksworks.hotel.enums.BookingsStatus;
import com.thinksworks.hotel.enums.RoomType;
import com.thinksworks.hotel.service.HotelService;

public class MainRunner  {

    public static void main(String[] args) {
        Room room = new Room(101,100.0d, RoomType.SINGLE,false);
        Room room1 = new Room(102,500.0d,RoomType.DOUBLE,true);
        Room room2 = new Room(103,500.6d,RoomType.DOUBLE,true);

        Room[] rooms  = {room,room1,room2};
        Guest guest = new Guest("rudresh",12,900909090l);
        Guest guest1 = new Guest("harsha",10,909087878);
        Guest guest2 = new Guest("Sathish",76,7654321);
        Room[]  bookedRooms = {room,room2};
        Guest[] guests = {guest,guest1,guest2};

        BookingDetails bookingDetails = new BookingDetails(1,guests,bookedRooms,2, BookingsStatus.CONFIRMED);
        BookingDetails bookingDetails1 = new BookingDetails(2,guests,rooms,3,BookingsStatus.CANCELLED);
        HotelService hotelService = new HotelService();
        hotelService.printRoomDetails(room);
        hotelService.printGuestDetails(guest);
        hotelService.printBookingDetails(bookingDetails);
        hotelService.showAvailableRooms(rooms);
    }

}
