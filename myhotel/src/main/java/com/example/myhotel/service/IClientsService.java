package com.example.myhotel.service;

import com.example.myhotel.model.Client;

import java.time.LocalDate;
import java.util.List;

public interface IClientsService {

    Client findById(Long ID);

    List<Client> findByName(String name);

    List<Client> findBySSN(int SSN);

    void changeCheckInDate(Long ID, LocalDate checkin);

    void changePaymentStatus(Long ID, String paymentStatus);

    Client save(Client client);

    void delete(Client client);

    List<Clients> findAll();

}
