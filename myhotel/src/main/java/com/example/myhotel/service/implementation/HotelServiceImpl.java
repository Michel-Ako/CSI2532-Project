package com.example.myhotel.service.implementation;

import java.util.ArrayList;
import java.util.List;

import com.example.myhotel.model.Hotel;
import com.example.myhotel.model.Reservation;
import com.example.myhotel.model.Room;
import com.example.myhotel.model.RoomType;
import com.example.myhotel.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
    private Hotel hotel;
    private List<Room> rooms;
    private List<Reservation> reservations;

    // constructor to initialize the hotel, rooms, and reservations
    public HotelServiceImpl() {
    }

    @Override
    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }

    @Override
    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (isRoomAvailable(room)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    private boolean isRoomAvailable(Room room) {
        for (Reservation reservation : reservations) {
            if (reservation.getRoom().equals(room) && !reservation.isCancelled()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void makeReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}