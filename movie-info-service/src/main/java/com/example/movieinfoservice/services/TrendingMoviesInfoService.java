package com.example.movieinfoservice.services;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.Movie;
import org.example.Movies;
import org.example.TopMovieIds;
import org.example.TrendingMoviesInfoGrpc;


@GrpcService
@AllArgsConstructor
public class TrendingMoviesInfoService extends TrendingMoviesInfoGrpc.TrendingMoviesInfoImplBase {

    private MovieService movieService;

    @Override
    public void getTopTenTrendingMoviesInfo(TopMovieIds request, StreamObserver<Movies> responseObserver) {
        var movies = Movies.newBuilder()
                .addAllMovies(request.getMovieIdList()
                        .stream()
                        .map(movieService::getMovie)
                        .map(movie -> Movie.newBuilder()
                                .setMovieId(movie.getMovieId())
                                .setDescription(movie.getDescription())
                                .setName(movie.getName())
                                .build()
                        ).toList()).build();
        responseObserver.onNext(movies);
        responseObserver.onCompleted();
    }
}
