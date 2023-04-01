package com.example.myhotel.repository;
package com.example.myhotel.model.Archives;

import java.util.Optional;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface ArchivesRepository extends CrudRepository<NumeroArchives, Integer> {

    @Override
    @Query(value = Queries.findAllArchivesByNumber, nativeQuery = true)
    Optional<Archives> findByNumber(@Param("NumeroArchives") int numberOfArchives);

    @Override
    @Query(value = Queries.findAllArchivesByID, nativeQuery = true)
    List<Archives> findByID(@Param("ID") int ID);

    @Modifying
    @Query(value = Queries.changeArchivesType, nativeQuery = true)
    void changeArchivesType(@Param("NumeroArchives") int numberOfArchives, @Param("type") String type);

    @Modifying
    @Query(value = Queries.changeArchivesID, nativeQuery = true)
    void changeArchivesID(@Param("NumeroArchives") int numberOfArchives, @Param("ArchivesID") int archiveID);

    @Override
    Archives save(Archives archive);
}
