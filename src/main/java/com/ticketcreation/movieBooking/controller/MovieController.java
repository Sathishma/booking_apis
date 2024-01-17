package com.ticketcreation.movieBooking.controller;


import com.ticketcreation.movieBooking.dto.MovieDTO;
import com.ticketcreation.movieBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
//    @Autowired
//    private MovieDTO movieDTO;

    @PostMapping("/add")
    public ResponseEntity<List<String>>  addMovie(@RequestBody MovieDTO movieDto) {
//        movieService.addMovie(movieDto);
        List<String> movies = movieService.getAllMovies( movieDto);
        return ResponseEntity.ok(movies);
    }
    @GetMapping("/list")
    public ResponseEntity<List<String>> getAllMovies(@RequestBody MovieDTO movieDto) {
        List<String> movies = movieService.addMovie( movieDto);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/details")
    public ResponseEntity<Map<String, Object>> getMovieTheaterDetails(@RequestParam String movieName) {
        Map<String, Object> details = movieService.getMovieTheaterDetails(movieName);
        return ResponseEntity.ok(details);
    }
}

