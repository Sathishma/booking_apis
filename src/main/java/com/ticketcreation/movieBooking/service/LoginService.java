package com.ticketcreation.movieBooking.service;

import com.ticketcreation.movieBooking.dto.LoginDto;
import com.ticketcreation.movieBooking.dto.UserDto;
import com.ticketcreation.movieBooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    UserRepository userRepository;


    public String getLoginCredential(LoginDto loginDto) {
        Optional<UserDto> optionalUser = userRepository.findByUserName(loginDto.getUserName());
        if (optionalUser.isEmpty()) {
            return "wrong userName";
        }
        UserDto userInfoFromDB = optionalUser.get();


        if (userInfoFromDB.getPassword().equals(loginDto.getPassword())) {
            return "User registered successfully!";
        } else {
            return "wrong password";
        }

    }
}