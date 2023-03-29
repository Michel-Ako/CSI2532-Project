package com.example.myhotel.model;

import java.time.LocalDate;

public class Reservation {
    private int reservationId;
    private Room room;

    private LocalDate Date_reservation;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    private int ArchiveNumber;
    private double totalPrice;

    public Reservation(int reservationId, Room room, LocalDate date_reservation, LocalDate checkInDate, LocalDate checkOutDate, int archiveNumber, double totalPrice) {
        this.reservationId = reservationId;
        this.room = room;
        Date_reservation = date_reservation;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        ArchiveNumber = archiveNumber;
        this.totalPrice = totalPrice;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDate_reservation() {
        return Date_reservation;
    }

    public void setDate_reservation(LocalDate date_reservation) {
        Date_reservation = date_reservation;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getArchiveNumber() {
        return ArchiveNumber;
    }

    public void setArchiveNumber(int archiveNumber) {
        ArchiveNumber = archiveNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}