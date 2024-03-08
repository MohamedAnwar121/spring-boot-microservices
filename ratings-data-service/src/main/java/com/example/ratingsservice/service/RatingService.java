package com.example.ratingsservice.service;

import com.example.ratingsservice.dao.UserMovieRatingRepository;
import com.example.ratingsservice.dtos.Rating;
import com.example.ratingsservice.dtos.UserRating;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RatingService {

    private UserMovieRatingRepository userMovieRatingRepository;

    public UserRating getUserRatings(String userId) {
        return new UserRating(
                userMovieRatingRepository
                        .getUserMovieRatingsByUserId(userId)
                        .stream()
                        .map(userMovieRating -> new Rating(
                                userMovieRating.getMovieId(),
                                userMovieRating.getRating()
                        ))
                        .toList()
        );
    }

}
