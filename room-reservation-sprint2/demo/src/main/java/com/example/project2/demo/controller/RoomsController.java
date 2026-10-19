package com.example.project2.demo.controller;

import com.example.project2.demo.model.Rooms;
import com.example.project2.demo.service.RoomsService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RoomsController {

    private final RoomsService roomsService;

    public RoomsController(RoomsService roomsService) {
        this.roomsService = roomsService;
    }

    // Home page
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("rooms", roomsService.getAllRooms());
        return "index";
    }

    // Admin page
    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("rooms", roomsService.getAllRooms());
        model.addAttribute("room", new Rooms());
        return "admin";
    }

    // Add room
    @PostMapping("/admin/add")
    public String addRoom(@ModelAttribute Rooms room) {
        room.setBooked(false);
        roomsService.saveRoom(room);
        return "redirect:/admin";
    }

    // Delete room
    @PostMapping("/admin/delete/{id}")
    public String deleteRoom(@PathVariable Long id) {
        roomsService.deleteRoom(id);
        return "redirect:/admin";
    }
}