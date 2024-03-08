package com.example.ratingsservice.resources;

import com.example.ratingsservice.dtos.UserRating;
import com.example.ratingsservice.service.RatingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/ratings")
public class RatingsResource {

    private RatingService ratingService;

    @RequestMapping("/{userId}")
    public UserRating getRatingsOfUser(@PathVariable String userId) {
        return ratingService.getUserRatings(userId);
    }
}
