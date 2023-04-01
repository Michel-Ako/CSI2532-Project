package com.example.myhotel.service;

import com.example.myhotel.model.Hotel;
import com.example.myhotel.model.Room;
import com.example.myhotel.model.RoomType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IRoomService {
    List<Room> findAvailableRooms(int minCapacity, int maxCapacity,
                                  RoomType roomType, boolean extent, String view,
                                  String hotelChain, int hotelCategory,
                                  BigDecimal minPrice, BigDecimal maxPrice,
                                  LocalDate startDate, LocalDate endDate);

    Room findByRoomNumber(int roomNumber);

    List<Room> findByView(String view);

    List<Room> findByExtent(boolean extent);

    List<Room> findByHotelChain(String hotelChain);

    List<Room> findByHotelCategory(int hotelCategory);

    List<Room> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    List<Room> findByCapacityBetween(int minCapacity, int maxCapacity);

    List<Room> findByRoomType(RoomType roomType);

    List<Room> findByAvailability(boolean availability);

    void changeRoomStatus(int roomNumber, String status);

    void changeRoomAvailability(int roomNumber, boolean availability);

    Room save(Room room);

    List<Hotel> findAll();

    void delete(Room room);
}
