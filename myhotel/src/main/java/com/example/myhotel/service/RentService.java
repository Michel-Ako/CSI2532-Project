package com.example.myhotel.service;

import com.example.myhotel.model.Rent;
import com.example.myhotel.repository.RentRepository;

import java.time.LocalDate;
import java.util.List;

public class RentService implements IRentService {

    private final RentRepository rentRepository;

    public RentService(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public Rent findByNumber(Long ID) {
        return rentRepository.findByNumber(ID);
    }

    @Override
    public List<Rent> findByDate(LocalDate Date) {
        return rentRepository.findByDate(Date);
    }

    @Override
    public List<Rent> findByStartDate(LocalDate StartDate) {
        return rentRepository.findByStartDate(StartDate);
    }

    @Override
    public List<Rent> findByEndDate(LocalDate EndDate) {
        return rentRepository.findByEndDate(EndDate);
    }

    @Override
    public void changeDate(Long ID, LocalDate Date) {
        Rent rent = rentRepository.findByNumber(ID);
        rent.setDate(Date);
        rentRepository.save(rent);
    }

    @Override
    public void changeStartDate(Long ID, LocalDate StartDate) {
        Rent rent = rentRepository.findByNumber(ID);
        rent.setStartDate(StartDate);
        rentRepository.save(rent);
    }

    @Override
    public void changeEndDate(Long ID, LocalDate EndDate) {
        Rent rent = rentRepository.findByNumber(ID);
        rent.setEndDate(EndDate);
        rentRepository.save(rent);
    }

    @Override
    public Rent save(Rent rent) {
        return rentRepository.save(rent);
    }

    @Override
    public void delete(Rent rent) {
        rentRepository.delete(rent);
    }
}

