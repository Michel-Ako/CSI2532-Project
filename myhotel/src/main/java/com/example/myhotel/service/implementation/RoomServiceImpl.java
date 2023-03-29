package com.example.myhotel.service.implementation;

import com.example.myhotel.model.Room;
import com.example.myhotel.model.RoomType;
import com.example.myhotel.service.RoomService;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements RoomService {

    private List<Room> rooms = new ArrayList<>();

    public RoomServiceImpl() {
        // Initialize some sample rooms
        rooms.add(new Room("101", RoomType.SINGLE, 50.0));
        rooms.add(new Room("102", RoomType.DOUBLE, 70.0));
        rooms.add(new Room("103", RoomType.SUITE, 100.0));
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }

    @Override
    public Room getRoomById(String roomId) {
        for (Room room : rooms) {
            if (room.getId().equals(roomId)) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getRoomsByType(RoomType roomType) {
        List<Room> roomsByType = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getRoomType() == roomType) {
                roomsByType.add(room);
            }
        }
