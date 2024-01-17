 package com.ticketcreation.movieBooking.controller;


import com.ticketcreation.movieBooking.dto.TheaterDTO;
import com.ticketcreation.movieBooking.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ticketcreation.movieBooking.service.UserService;

import java.util.List;

 @RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> registerUser(@RequestBody UserDto userDto) {
        userService.registerUser(userDto);
        return ResponseEntity.ok("User Logged in successfully!");
    }

}
//    List<MovieDto> movies = movieService.getAllMovies();