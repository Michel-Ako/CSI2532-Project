package com.example.myhotel.repository;
package com.example.myhotel.model.Hotel;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

    @Override
    @Query(value = Queries.findAllHotelsByID, nativeQuery = true)
    Optional<Hotel> findById(@Param("ID") Long ID);

    @Override
    @Query(value = Queries.findAllHotelsByName, nativeQuery = true)
    List<Hotel> findByName(@Param("Name") String name);

    @Override
    @Query(value = Queries.findAllHotelsByRatings, nativeQuery = true)
    List<Hotel> findByRatings(@Param("Ratings") int Rating);

    @Override
    Hotel save(Hotel hotel);

    @Modifying
    @Query(value = Queries.changeManager, nativeQuery = true)
    void changeManager(@Param("ID") Long ID, @Param("Manager") String manager);
}
