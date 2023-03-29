package com.example.myhotel.service;

import com.example.myhotel.model.Reservation;
import com.example.myhotel.model.Room;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations();
    List<Reservation> getReservationsByGuest(String guestName);
    List<Reservation> getReservationsByRoom(Room room);
    void makeReservation(Reservation reservation);
    void cancelReservation(Reservation reservation);
    boolean isRoomAvailable(Room room, Reservation reservation);
}
