package com.ticketcreation.movieBooking.controller;

import com.ticketcreation.movieBooking.dto.LoginDto;
import com.ticketcreation.movieBooking.dto.UserDto;
import com.ticketcreation.movieBooking.service.LoginService;
import com.ticketcreation.movieBooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;

    @PostMapping("/add")
    public ResponseEntity<String> registerUser(@RequestBody LoginDto loginDto) {
       String inputlogins = loginService.getLoginCredential( loginDto);
        System.out.println(loginDto);


        return ResponseEntity.ok(inputlogins);
    }

}