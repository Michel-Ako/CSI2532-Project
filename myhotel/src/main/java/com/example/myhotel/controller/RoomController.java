package com.example.myhotel.controller;

import com.example.myhotel.model.Room;
import com.example.myhotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RoomController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/room/{roomNumber}")
    public String room(@PathVariable String roomNumber, Model model) {
        Room room = hotelService.getRoom(roomNumber);
        model.addAttribute("room", room);
        return "room";
    }
}