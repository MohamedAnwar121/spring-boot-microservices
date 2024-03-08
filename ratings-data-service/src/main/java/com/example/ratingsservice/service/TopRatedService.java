package com.example.ratingsservice.service;


import com.example.ratingsservice.dao.UserMovieRatingRepository;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.TopMovieIds;
import org.example.TrendingMoviesRatingGrpc;

@GrpcService
@AllArgsConstructor
public class TopRatedService extends TrendingMoviesRatingGrpc.TrendingMoviesRatingImplBase {

    private UserMovieRatingRepository userMovieRatingRepository;

    @Override
    public void getTopTenTrendingMoviesRating(Empty request, StreamObserver<TopMovieIds> responseObserver) {
        var movies = userMovieRatingRepository.getTopTenTrendingMoviesRating();
        responseObserver.onNext(
                TopMovieIds
                        .newBuilder()
                        .addAllMovieId(movies)
                        .build()
        );
        responseObserver.onCompleted();
    }
}
