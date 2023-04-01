package com.example.myhotel.repository;
package com.example.myhotel.model.Reservation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    @Override
    @Query(value = Queries.findAllReservationsByID, nativeQuery = true)
    Optional<Reservation> findByID(@Param("ID") Long ID);

    @Override
    @Query(value = Queries.findAllReservationsByDate, nativeQuery = true)
    List<Reservation> findByDate(@Param("Date") LocalDate Date);

    @Override
    @Query(value = Queries.findAllReservationsByStartDate, nativeQuery = true)
    List<Reservation> findByStartDate(@Param("StartDate") LocalDate StartDate);

    @Override
    @Query(value = Queries.findAllReservationsByEndDate, nativeQuery = true)
    List<Reservation> findByEndDate(@Param("EndDate") LocalDate EndDate);

    @Override
    @Query(value = Queries.findAllReservationsByCustomerID, nativeQuery = true)
    List<Reservation> findByCustomerID(@Param("customerID") Long ID);

    @Override
    @Query(value = Queries.findAllReservationsByArchiveNumber, nativeQuery = true)
    List<Reservation> findByArchiveNumber(@Param("Archivenumber") int number);

    @Modifying
    @Query(value = Queries.changeDate, nativeQuery = true)
    void changeDate(@Param("ID") Long ID, @Param("Date") LocalDate Date);

    @Modifying
    @Query(value = Queries.changeStartDate, nativeQuery = true)
    void changeStartDate(@Param("ID") Long ID, @Param("StartDate") LocalDate StartDate);

    @Modifying
    @Query(value = Queries.changePost, nativeQuery = true)
    void changeEndDate(@Param("ID") Long ID, @Param("EndDate") LocalDate EndDate);


    @Override
    Reservation save(Reservation reservation);
}
