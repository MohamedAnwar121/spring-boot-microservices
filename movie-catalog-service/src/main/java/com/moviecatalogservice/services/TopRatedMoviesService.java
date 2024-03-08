package com.moviecatalogservice.services;


import com.google.protobuf.Empty;
import com.moviecatalogservice.models.Movie;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.TrendingMoviesGrpc;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopRatedMoviesService {

    @GrpcClient("trending-movies")
    TrendingMoviesGrpc.TrendingMoviesBlockingStub trendingMoviesService;

    public List<Movie> getTopTenTrendingMovies() {
        return trendingMoviesService
                .getTopTenTrendingMovies(Empty.getDefaultInstance())
                .getMoviesList()
                .stream().map(movie -> Movie
                        .builder()
                        .movieId(movie.getMovieId())
                        .name(movie.getName())
                        .description(movie.getDescription())
                        .build())
                .collect(Collectors.toList());
    }
}
