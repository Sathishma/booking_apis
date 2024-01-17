package com.ticketcreation.movieBooking.service;

import com.ticketcreation.movieBooking.dto.MovieDTO;
import com.ticketcreation.movieBooking.dto.TheaterDTO;
import com.ticketcreation.movieBooking.repository.MovieRepository;
import com.ticketcreation.movieBooking.repository.TheaterRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TheaterService {
    @Autowired
    TheaterRepository theaterRepository;

    public void addMovie(TheaterDTO theaterDTO) {
        TheaterDTO theater = new TheaterDTO();
        BeanUtils.copyProperties(theaterDTO, theater);
        theaterRepository.save(theater);
        System.out.println("Movie added: " + theaterDTO.getTheater());
    }

    // Add more methods as needed
}
