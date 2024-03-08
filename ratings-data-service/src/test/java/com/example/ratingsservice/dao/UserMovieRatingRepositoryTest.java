package com.example.ratingsservice.dao;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMovieRatingRepositoryTest {

    @Autowired
    private UserMovieRatingRepository userMovieRatingRepository;

    @Test
    void getTopTenTrendingMoviesRating() {
        var movies = userMovieRatingRepository.getTopTenTrendingMoviesRating();
        System.out.println(movies);
    }
}