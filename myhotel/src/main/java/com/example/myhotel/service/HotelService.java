package com.example.myhotel.service;

import com.example.myhotel.model.Hotel;
import com.example.myhotel.repository.IHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IHotelService {

    @Autowired
    private IHotelRepository hotelRepository;

    @Override
    public void save(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> findByRatings(int rating) {
        return hotelRepository.findByRatings(rating);
    }

    @Override
    public Hotel findById(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public Hotel findByName(String name) {
        return hotelRepository.findByName(name);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public void changeManager(Long id, String manager) {
        Hotel hotel = hotelRepository.findById(id).orElse(null);
        if (hotel != null) {
            hotel.setManager(manager);
            hotelRepository.save(hotel);
        }
    }
}
