package com.ticketcreation.movieBooking.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "MovieDetails")
@Getter
@Setter

public class MovieDTO {
    @Id
    private Long movieId;
    private String title;
    private String genre;
    private String director;
    private String actor;
    private Double duration;
    private Double rating;

    // getters and setters
}
