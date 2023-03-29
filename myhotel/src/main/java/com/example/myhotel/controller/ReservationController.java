package com.example.myhotel.controller;

import com.example.myhotel.model.Reservation;
import com.example.myhotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/reservation")
    public String reservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("rooms", hotelService.getAvailableRooms());
        return "reservation";
    }

    @PostMapping("/reservation")
    public String reservationSubmit(@ModelAttribute Reservation reservation, Model model) {
        hotelService.makeReservation(reservation);
        model.addAttribute("reservation", reservation);
        return "reservationConfirmation";
    }
}