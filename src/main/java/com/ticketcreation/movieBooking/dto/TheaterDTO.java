package com.ticketcreation.movieBooking.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
public class TheaterDTO {
    @Id
    private Long   theaterId;
    private String showTiming1;
    private String showTiming2;
    private String showTiming3;
    private String showTiming4;
    private String theater;
}
