package com.example.myhotel.controller;
import com.example.myhotel.model.Hotel;
import com.example.myhotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotel")
    public String hotel(Model model) {
        Hotel hotel = hotelService.getHotel();
        model.addAttribute("hotel", hotel);
        return "hotel";
    }
}