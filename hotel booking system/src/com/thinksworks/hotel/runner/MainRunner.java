package com.thinksworks.hotel.runner;

import com.thinksworks.hotel.dto.Booking;
import com.thinksworks.hotel.dto.Guest;
import com.thinksworks.hotel.dto.Room;
import com.thinksworks.hotel.enums.BookingsStatus;
import com.thinksworks.hotel.enums.RoomType;
import com.thinksworks.hotel.service.HotelService;

public class MainRunner  {

    public static void main(String[] args) {
        Room room = new Room(101,100.0d, RoomType.SINGLE,true);
        Room room1 = new Room(102,500.0d,RoomType.DOUBLE,false);

        Room[] rooms  = {room,room1};
        Guest guest = new Guest("rudresh",12,900909090l);
        Guest guest1 = new Guest("harsha",10,909087878);
        Guest guest2 = new Guest("Sathish",76,7654321);
        Guest[]  guests = {guest,guest1,guest2};

        Booking booking = new Booking(1,guest,rooms,2, BookingsStatus.CONFIRMED);
        Booking booking1 = new Booking(2,guest1,rooms,3,BookingsStatus.CANCELLED);
        HotelService hotelService = new HotelService();
        hotelService.printRoomDetails(room);
        hotelService.printGuestDetails(guest);
        hotelService.printBookingDetails(booking);
        hotelService.showAvailableRooms(rooms);
    }

}
