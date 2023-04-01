package com.example.myhotel.repository;
package com.example.myhotel.model.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    @Query(value = Queries.findAllEmployeesByID, nativeQuery = true)
    Optional<Employee> findById(@Param("ID") Long ID);

    @Override
    @Query(value = Queries.findAllEmployeesByName, nativeQuery = true)
    List<Employee> findByName(@Param("Name") String name);

    @Override
    @Query(value = Queries.findAllEmployeesBySSN, nativeQuery = true)
    List<Employee


    @Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    @Query(value = Queries.findAllEmployeesByID, nativeQuery = true)
    Optional<Employee> findById(@Param("ID") Long ID);

    @Override
    @Query(value = Queries.findAllEmployeesByName, nativeQuery = true)
    List<Employee> findByName(@Param("Name") String name);

    @Override
    @Query(value = Queries.findAllEmployeesBySSN, nativeQuery = true)
    List<Employee> findBySSN(@Param("SSN") int SSN);

    @Modifying
    @Query(value = Queries.changePost, nativeQuery = true)
    void changePost(@Param("ID") Long ID, @Param("Post") String post);

    @Override
    Employee save(Employee employee);

}
