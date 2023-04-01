package com.example.myhotel.repository;
package com.example.myhotel.model.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface RoomRepository extends CrudRepository<roomNumber, Long> {

    @Query("SELECT r FROM Room r WHERE r.capacity >= :minCapacity AND r.capacity <= :maxCapacity " +
            "AND r.RoomType = :roomType " +
            "AND r.extent = :extent " +
            "AND r.hotel.chain = :hotelChain AND r.hotel.category = :hotelCategory " +
            "AND r.price >= :minPrice AND r.price <= :maxPrice " +
            "AND NOT EXISTS (SELECT 1 FROM Reservation res WHERE res.room = r AND " +
            "((res.startDate BETWEEN :startDate AND :endDate) OR (res.endDate BETWEEN :startDate AND :endDate)))")
    List<Room> findAvailableRooms(@Param("minCapacity") int minCapacity, @Param("maxCapacity") int maxCapacity,
                                  @Param("roomType") String roomType, @Param("extent") String extent, @Param("view") String view,
                                  @Param("hotelChain") String hotelChain, @Param("hotelCategory") int hotelCategory,
                                  @Param("minPrice") BigDecimal minPrice, @Param("maxPrice") BigDecimal maxPrice,
                                  @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);


    @Override
    @Query(value = Queries.findAllRoomsByRoomNumber, nativeQuery = true)
    Optional<Room> findByRoomNumber(@Param("roomNumber") int roomNumber);

    @Override
    @Query(value = Queries.findAllRoomsByRoomType, nativeQuery = true)
    List<Room> findByRoomType(@Param("roomType") String roomType);

    @Override
    @Query(value = Queries.findAllRoomsByView, nativeQuery = true)
    List<Room> findByView(@Param("view") String view);

    @Override
    @Query(value = Queries.findAllRoomsByExtent, nativeQuery = true)
    List<Room> findByExtent(@Param("Extent") boolean extent);

    @Override
    @Query(value = Queries.findAllRoomsByHotelChain, nativeQuery = true)
    List<Room> findByHotelChain(@Param("hotelChain") String hotelChain);

    @Override
    @Query(value = Queries.findAllRoomsByHotelCategory, nativeQuery = true)
    List<Room> findByHotelCategory(@Param("hotelCategory") int hotelCategory);

    @Override
    List<Room> findByPriceBetween(@Param("minPrice") BigDecimal minPrice,@Param("maxPrice")  BigDecimal maxPrice);

    @Override
    List<Room> findByCapacityBetween(@Param("minCapacity") int minCapacity,@Param("maxCapacity")  int maxCapacity);

    @Override
    @Query(value = Queries.findAllRoomsByRoomType, nativeQuery = true)
    List<Room> findByRoomType(@Param("RoomType") String roomType);

    @Override
    @Query(value = Queries.findAllRoomsByAvailability , nativeQuery = true)
    List<Room> findByAvailability(@Param("Availability") boolean availability);

    @Modifying
    @Transactional
    @Query(value = Queries.changeRoomStatus, nativeQuery = true)
    void changeRoomStatus(@Param("roomNumber") int roomNumber, @Param("status") String status);

    @Modifying
    @Transactional
    @Query(value = Queries.changeRoomAvailability, nativeQuery = true)
    void changeRoomAvailability(@Param("roomNumber") int roomNumber, @Param("availability") boolean availability);

    @Override
    Room save(Room room);

   /* @Modifying
    @Transactional
    @Query(value = "DELETE FROM Room WHERE room_number = :roomNumber", nativeQuery = true)
    void deleteByRoomNumber(@Param("roomNumber") int roomNumber);*/

}


