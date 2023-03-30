package com.example.myhotel.service.implementation;

import com.example.myhotel.model.Room;
import com.example.myhotel.service.RoomService;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements RoomService {

    private List<Room> rooms = new ArrayList<>();

    public RoomServiceImpl() {
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }

    @Override
    public List<Room> getAvailableRooms() {
        return null;
    }

    @Override
    public Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber()==roomNumber) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getRoomsByType(RoomType roomType) {
        List<Room> roomsByType = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getRoomType().equals(roomType)) {
                roomsByType.add(room);
            }
        }
        return roomsByType;
    }
}