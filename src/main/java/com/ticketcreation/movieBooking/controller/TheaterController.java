package com.ticketcreation.movieBooking.controller;

import com.ticketcreation.movieBooking.dto.TheaterDTO;
import com.ticketcreation.movieBooking.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    @PostMapping("/addmovie")
    public ResponseEntity<String> addTheater(@RequestBody TheaterDTO theaterDto) {
        theaterService.addMovie(theaterDto);
        return ResponseEntity.ok("Movie added successfully!");
    }
}