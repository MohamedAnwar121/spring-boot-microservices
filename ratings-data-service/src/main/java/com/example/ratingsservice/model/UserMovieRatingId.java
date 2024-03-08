package com.example.ratingsservice.model;


import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserMovieRatingId implements Serializable {

    private String movieId;
    private String userId;
}
