package com.example.myhotel.service;

import com.example.myhotel.model.Employee;
import com.example.myhotel.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findById(Long ID) {
        return employeeRepository.findById(ID);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> findBySSN(int SSN) {
        return employeeRepository.findBySSN(SSN);
    }

    @Override
    public void changePost(Long ID, String post) {
        Employee employee = employeeRepository.findById(ID);
        if (employee != null) {
            employee.setPost(post);
            employeeRepository.save(employee);
        }
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
