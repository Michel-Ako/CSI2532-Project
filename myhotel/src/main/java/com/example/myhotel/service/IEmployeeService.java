import com.example.myhotel.model.Hotel;
import com.example.myhotel.repository.HotelRepository;
import com.example.myhotel.service.HotelService;

package com.example.myhotel.service;
public interface IEmployeeService {

    Employee findById(Long ID);

    List<Employee> findByName(String name);

    List<Employee> findBySSN(int SSN);

    void changePost(Long ID, String post);

    Employee save(Employee employee);

    void delete(Employee employee);

    List<Employee> findAll();

}