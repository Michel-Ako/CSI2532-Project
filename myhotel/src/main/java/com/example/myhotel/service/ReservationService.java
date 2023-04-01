package com.example.myhotel.service;

import com.example.myhotel.model.Reservation;
import com.example.myhotel.repository.ReservationRepository;

import java.time.LocalDate;
import java.util.List;

public class ReservationService implements IReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation findByID(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public List<Reservation> findByDate(LocalDate Date) {
        return reservationRepository.findByDate(Date);
    }

    @Override
    public List<Reservation> findByStartDate(LocalDate StartDate) {
        return reservationRepository.findByStartDate(StartDate);
    }

    @Override
    public List<Reservation> findByEndDate(LocalDate EndDate) {
        return reservationRepository.findByEndDate(EndDate);
    }

    @Override
    public void changeDate(Long ID, LocalDate Date) {
        Reservation reservation = reservationRepository.findById(ID);
        reservation.setDate(Date);
        reservationRepository.save(reservation);
    }

    @Override
    public void changeStartDate(Long ID, LocalDate StartDate) {
        Reservation reservation = reservationRepository.findById(ID);
        reservation.setStartDate(StartDate);
        reservationRepository.save(reservation);
    }

    @Override
    public void changeEndDate(Long ID, LocalDate EndDate) {
        Reservation reservation = reservationRepository.findById(ID);
        reservation.setEndDate(EndDate);
        reservationRepository.save(reservation);
    }

    @Override
    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void delete(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    @Override
    public List<Reservation> findByCustomerID(Long ID) {
        return reservationRepository.findByCustomerID(ID);
    }

    @Override
    public List<Reservation> findByArchiveNumber(int number) {
        return reservationRepository.findByArchiveNumber(number);
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
}


