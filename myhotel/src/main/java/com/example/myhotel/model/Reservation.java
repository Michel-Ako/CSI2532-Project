package com.example.myhotel.model;

import java.time.LocalDate;

import java.sql.Timestamp;

public class Reservation {
    private int reservationID;
    private Timestamp reservationDate;
    private Timestamp startDate;
    private Timestamp endDate;
    private int roomNumber;
    private int archiveNumber;

    public Reservation(int reservationID, Timestamp reservationDate, Timestamp startDate, Timestamp endDate, int roomNumber, int archiveNumber) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomNumber = roomNumber;
        this.archiveNumber = archiveNumber;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public Timestamp getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Timestamp reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getArchiveNumber() {
        return archiveNumber;
    }

    public void setArchiveNumber(int archiveNumber) {
        this.archiveNumber = archiveNumber;
    }

}
