package com.ticketcreation.movieBooking.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@Table(name = "UserDetails")
public class UserDto {

    @Id
    private Long userId;
    private String userName;
    private String password;
    private String mailId;
    private String gender;
    private Integer age;
    private Long contactDetails;
    private String paymentPreferences;

    // getters and setters
}
