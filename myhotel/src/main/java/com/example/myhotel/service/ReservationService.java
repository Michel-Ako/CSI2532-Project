package com.example.myhotel.service;

import com.example.myhotel.model.Reservation;

import java.sql.SQLException;
import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations() throws SQLException;

    Reservation getReservationById(int reservationID) throws SQLException;

    void addReservation(Reservation reservation) throws SQLException;

    void updateReservation(Reservation reservation) throws SQLException;

    void deleteReservation(int reservationID) throws SQLException;
}
