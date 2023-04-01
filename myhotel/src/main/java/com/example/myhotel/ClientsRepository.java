package com.example.myhotel.repository;
package com.example.myhotel.model.Clients;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface ClientsRepository extends CrudRepository<Client, Long> {

    @Override
    @Query(value = Queries.findAllClientsByID, nativeQuery = true)
    Optional<Client> findById(@Param("ID") Long ID);

    @Override
    @Query(value = Queries.findAllClientsByName, nativeQuery = true)
    List<Client> findByName(@Param("name") String name);

    @Override
    @Query(value = Queries.findAllClientsBySSN, nativeQuery = true)
    List<Client> findBySSN(@Param("SSN") int SSN);

    @Modifying
    @Query(value = Queries.changeCheckInDate, nativeQuery = true)
    void changeCheckInDate(@Param("ID") Long ID, @Param("checkin") LocalDate checkin);

    @Modifying
    @Transactional
    @Query(value = Queries.changePaymentStatus, nativeQuery = true)
    void changePaymentStatus(@Param("ID") Long ID, @Param("paymentStatus") String paymentStatus);

    @Override
    Clients save(Clients client);
}
