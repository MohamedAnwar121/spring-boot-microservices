package com.example.ratingsservice.dao;


import com.example.ratingsservice.model.UserMovieRating;
import com.example.ratingsservice.model.UserMovieRatingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMovieRatingRepository extends JpaRepository<UserMovieRating , UserMovieRatingId> {
    List<UserMovieRating> getUserMovieRatingsByUserId(String userId);
}
