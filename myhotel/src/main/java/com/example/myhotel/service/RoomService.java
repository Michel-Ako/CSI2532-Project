package com.example.myhotel.service;

import com.example.myhotel.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();
    Room getRoomByNumber(int roomNumber);
    List<Room> getAvailableRooms();
    List<Room> getRoomsByType(RoomType type);
}