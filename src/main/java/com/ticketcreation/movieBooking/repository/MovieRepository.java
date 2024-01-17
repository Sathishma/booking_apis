package com.ticketcreation.movieBooking.repository;

import com.ticketcreation.movieBooking.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface MovieRepository extends JpaRepository<MovieDTO, Long> {

    Optional<MovieDTO> findByTitle( String title);


}