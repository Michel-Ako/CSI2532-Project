package com.example.myhotel.service;

import com.example.myhotel.model.Room;
import com.example.myhotel.model.RoomType;

import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();
    Room getRoomByNumber(int roomNumber);
    List<Room> getAvailableRooms();
    List<Room> getRoomsByType(RoomType type);
}