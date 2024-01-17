package com.ticketcreation.movieBooking.service;


import com.ticketcreation.movieBooking.dto.MovieDTO;
import com.ticketcreation.movieBooking.dto.TheaterDTO;
import com.ticketcreation.movieBooking.repository.MovieRepository;
import com.ticketcreation.movieBooking.repository.TheaterRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MovieService {
//
//    private MovieRepository movieRepository;
//    private TheaterRepository theaterRepository;

    //    @Autowired
//    public void MovieTheaterService(MovieRepository movieRepository, TheaterRepository theaterRepository) {
//        this.movieRepository = movieRepository;
//        this.theaterRepository = theaterRepository;
//    }
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    TheaterRepository theaterRepository;


    public List<String> addMovie(MovieDTO movieDto) {
        MovieDTO movie = new MovieDTO();
        BeanUtils.copyProperties(movieDto, movie);
        movieRepository.save(movie);
        List<String> movieList = new ArrayList<>();
        movieList.add(String.valueOf(movieRepository.save(movie)));
        System.out.println("Movie added: " + movieDto.getTitle());
        return movieList;
    }

    public List<String> getAllMovies(MovieDTO movieDTO) {
        List<String> movieList = new ArrayList<>();

        movieList.add(movieDTO.getGenre());
        movieList.add(movieDTO.getTitle());
        movieList.add(movieDTO.getActor());


        return movieList;
    }

    public Map<String, Object> getMovieTheaterDetails(String movieName) {
        Optional<MovieDTO> movieOptional = movieRepository.findByTitle(movieName);
        if (movieOptional.isPresent()) {
            MovieDTO movie = movieOptional.get();
            List<TheaterDTO> theaters = theaterRepository.findByShowTiming1(movie.getTitle());
            List<String> theaterNames = theaters.stream()
                    .map(TheaterDTO::getTheater)
                    .collect(Collectors.toList());

            Map<String, Object> response = new HashMap<>();
            response.put("title", movie.getTitle());
            response.put("showTimings", theaterNames);
            System.out.println(" movieresponse=====>>   " + response);
            return response;
        } else {
            System.out.println("Movie not found with name: " + movieName);
        }


        // Add more methods as needed
        return null;
    }
}
