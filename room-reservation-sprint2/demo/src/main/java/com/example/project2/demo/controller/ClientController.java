package com.example.project2.demo.controller;

import com.example.project2.demo.model.User;
import com.example.project2.demo.service.RoomsService;
import com.example.project2.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    private final UserService userService;
    private final RoomsService roomsService;

    public ClientController(UserService userService, RoomsService roomsService) {
        this.userService = userService;
        this.roomsService = roomsService;
    }

    @GetMapping("/signup")
    public String showSignupPage(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute User user, HttpSession session) {
        User savedUser = userService.saveUser(user);
        session.setAttribute("currentUser", savedUser);
        return "redirect:/rooms";
    }

    @GetMapping("/rooms")
    public String showRooms(Model model) {
        model.addAttribute("rooms", roomsService.getAllRooms());
        return "rooms";
    }

    @PostMapping("/book/{id}")
    public String bookRoom(@PathVariable Long id, HttpSession session) {
        User currentUser = (User) session.getAttribute("currentUser");

        if (currentUser == null) {
            return "redirect:/signup";
        }

        roomsService.bookRoom(id, currentUser);
        return "redirect:/rooms";
    }
}