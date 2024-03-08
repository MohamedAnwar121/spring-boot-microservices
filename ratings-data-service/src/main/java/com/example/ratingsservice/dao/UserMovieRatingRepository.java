package com.example.ratingsservice.dao;


import com.example.ratingsservice.model.UserMovieRating;
import com.example.ratingsservice.model.UserMovieRatingId;
import org.example.TopMovieIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMovieRatingRepository extends JpaRepository<UserMovieRating , UserMovieRatingId> {
    List<UserMovieRating> getUserMovieRatingsByUserId(String userId);

    @Query("select movieId " +
            "from UserMovieRating " +
            "group by movieId " +
            "order by avg(rating) desc " +
            "limit 10 ")
    List<String> getTopTenTrendingMoviesRating();
}
