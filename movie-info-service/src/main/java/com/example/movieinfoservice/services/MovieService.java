package com.example.movieinfoservice.services;

import com.example.movieinfoservice.daos.MovieRepository;
import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Value("${api.key}")
    private String apiKey;

    private final MovieRepository movieRepository;
    private final RestTemplate restTemplate;

    public MovieService(MovieRepository movieRepository, RestTemplate restTemplate) {
        this.movieRepository = movieRepository;
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(String movieId) {
        return movieRepository.findById(movieId).orElseGet(
                () -> movieRepository.save(fetchMovie(movieId))
        );
    }

    private Movie fetchMovie(String movieId) {
        System.out.println("fetched from api");
        final String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);
        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
    }
}
