package com.ticketcreation.movieBooking.service;


import com.ticketcreation.movieBooking.dto.UserDto;
import com.ticketcreation.movieBooking.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void registerUser(UserDto userDto) {
        UserDto user = new UserDto();
        BeanUtils.copyProperties(userDto, user);
        userRepository.save(user);
        // Perform user registration logic here
        // You can interact with the database or Keycloak to save user details
        // For simplicity, let's just print the user information for now
        System.out.println("User registered: " + userDto.toString());
    }
}
