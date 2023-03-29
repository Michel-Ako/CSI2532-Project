package com.example.myhotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    // add a room to the hotel
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // remove a room from the hotel
    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    // make a reservation for a room
    public void makeReservation(Reservation reservation) {
        reservation.getRoom().setBooked(true);
        reservations.add(reservation);
    }

    // cancel a reservation for a room
    public void cancelReservation(Reservation reservation) {
        reservation.getRoom().setBooked(false);
        reservations.remove(reservation);
    }
}