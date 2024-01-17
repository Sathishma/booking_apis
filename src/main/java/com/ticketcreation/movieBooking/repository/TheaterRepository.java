package com.ticketcreation.movieBooking.repository;

import com.ticketcreation.movieBooking.dto.TheaterDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface TheaterRepository extends JpaRepository<TheaterDTO, Long> {
    // Add custom queries if neededList<Theater> findByMovieName(String movieName);

     List<TheaterDTO> findByShowTiming1(String showtiming1);


}