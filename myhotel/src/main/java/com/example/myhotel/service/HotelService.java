package com.example.myhotel.service;

import com.example.myhotel.model.Hotel;
import com.example.myhotel.model.Reservation;
import com.example.myhotel.model.Room;

import java.util.List;

public interface HotelService {
    Hotel getHotel();
    List<Room> getAllRooms();
    Room getRoom(String roomNumber);
    List<Room> getAvailableRooms();
    void makeReservation(Reservation reservation);
}
