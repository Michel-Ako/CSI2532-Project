package com.example.myhotel.repository;
package com.example.myhotel.model.Chain;

import java.util.Collection;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
@Repository
public interface ChainRepository extends CrudRepository<Chain, String> {
    @Override
    @Query(value = Queries.findAllChainsByName, nativeQuery = true)
    Optional<Chain> findById(@Param("Name") String name);

    @Query(value = Queries.findAllChains, nativeQuery = true)
    Collection<String[]> findAllChains();

    @Override
    Chain save(Chain chain);

    @Modifying
    @Query(value = Queries.changeNumberOfHotels, nativeQuery = true)
    void changeNumberOfHotels(@Param("chain") String chain, @Param("numberHotels") int numberHotels);

}

