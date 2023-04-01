package com.example.myhotel.repository;
package com.example.myhotel.model.Rent;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {

    @Override
    @Query(value = Queries.findAllRentByID, nativeQuery = true)
    Optional<Rent> findByNumber(@Param("ID") Long ID);

    @Override
    @Query(value = Queries.findAllRentByDate, nativeQuery = true)
    List<Rent> findByDate(@Param("Date") LocalDate Date);

    @Override
    @Query(value = Queries.findAllRentByStartDate, nativeQuery = true)
    List<Rent> findByStartDate(@Param("StartDate") LocalDate StartDate);

    @Override
    @Query(value = Queries.findAllRentByEndDate, nativeQuery = true)
    List<Rent> findByEndDate(@Param("EndDate") LocalDate EndDate);

    @Modifying
    @Query(value = Queries.changeDate, nativeQuery = true)
    void changeDate(@Param("ID") Long ID, @Param("Date") LocalDate Date);

    @Modifying
    @Query(value = Queries.changeStartDate, nativeQuery = true)
    void changeStartDate(@Param("ID") Long ID, @Param("StartDate") LocalDate StartDate);

    @Modifying
    @Query(value = Queries.changeEndDate, nativeQuery = true)
    void changeEndDate(@Param("ID") Long ID, @Param("EndDate") LocalDate EndDate);

    @Override
    Rent save(Rent rent);
}
