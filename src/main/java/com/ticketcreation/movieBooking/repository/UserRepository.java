package com.ticketcreation.movieBooking.repository;

import com.ticketcreation.movieBooking.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface UserRepository extends JpaRepository<UserDto, Long> {
    // Add custom queries if needed
    Optional<UserDto> findByUserName(String userName);
}
