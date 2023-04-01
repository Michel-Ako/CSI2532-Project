package com.example.myhotel.service.impl;

import com.example.myhotel.model.Hotel;
import com.example.myhotel.model.Room;
import com.example.myhotel.model.RoomType;
import com.example.myhotel.repository.RoomRepository;
import com.example.myhotel.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> findAvailableRooms(int minCapacity, int maxCapacity, RoomType roomType, boolean extent,
                                         String view, String hotelChain, int hotelCategory, BigDecimal minPrice,
                                         BigDecimal maxPrice, LocalDate startDate, LocalDate endDate) {
        return roomRepository.findAvailableRooms(minCapacity, maxCapacity, roomType, extent, view, hotelChain,
                hotelCategory, minPrice, maxPrice, startDate, endDate);
    }

    @Override
    public Room findByRoomNumber(int roomNumber) {
        return roomRepository.findByRoomNumber(roomNumber);
    }

    @Override
    public List<Room> findByView(String view) {
        return roomRepository.findByView(view);
    }

    @Override
    public List<Room> findByExtent(boolean extent) {
        return roomRepository.findByExtent(extent);
    }

    @Override
    public List<Room> findByHotelChain(String hotelChain) {
        return roomRepository.findByHotelChain(hotelChain);
    }

    @Override
    public List<Room> findByHotelCategory(int hotelCategory) {
        return roomRepository.findByHotelCategory(hotelCategory);
    }

    @Override
    public List<Room> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice) {
        return roomRepository.findByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Room> findByCapacityBetween(int minCapacity, int maxCapacity) {
        return roomRepository.findByCapacityBetween(minCapacity, maxCapacity);
    }

    @Override
    public List<Room> findByRoomType(RoomType roomType) {
        return roomRepository.findByRoomType(roomType);
    }

    @Override
    public List<Room> findByAvailability(boolean availability) {
        return roomRepository.findByAvailability(availability);
    }

    @Override
    public void changeRoomStatus(int roomNumber, String status) {
        Room room = roomRepository.findByRoomNumber(roomNumber);
        room.setStatus(status);
        roomRepository.save(room);
    }

    @Override
    public void changeRoomAvailability(int roomNumber, boolean availability) {
        Room room = roomRepository.findByRoomNumber(roomNumber);
        room.setAvailability(availability);
        roomRepository.save(room);
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public void delete(Room room) {
        roomRepository.delete(room);
    }
}
