package com.example.myhotel.service;

import com.example.myhotel.model.Client;
import com.example.myhotel.repository.IClientsRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientsService implements IClientsService {

    @Autowired
    private IClientsRepository clientsRepository;

    @Override
    public Client findById(Long ID) {
        return clientsRepository.findById(ID).orElse(null);
    }

    @Override
    public List<Client> findByName(String name) {
        return clientsRepository.findByName(name);
    }

    @Override
    public List<Client> findBySSN(int SSN) {
        return clientsRepository.findBySSN(SSN);
    }

    @Override
    public void changeCheckInDate(Long ID, LocalDate checkin) {
        Client client = findById(ID);
        client.setCheckInDate(checkin);
        clientsRepository.save(client);
    }

    @Override
    public void changePaymentStatus(Long ID, String paymentStatus) {
        Client client = findById(ID);
        client.setPaymentStatus(paymentStatus);
        clientsRepository.save(client);
    }

    @Override
    public Client save(Client client) {
        return clientsRepository.save(client);
    }

    @Override
    public void delete(Client client) {
        clientsRepository.delete(client);
    }

    @Override
    public List<Client> findAll() {
        return clientsRepository.findAll();
    }
}
