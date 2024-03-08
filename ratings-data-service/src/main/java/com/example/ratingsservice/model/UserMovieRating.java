package com.example.ratingsservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "user_movie_rating")
@IdClass(UserMovieRatingId.class)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserMovieRating {
    @Id
    private String movieId;

    @Id
    private String userId;
    private int rating;
}
