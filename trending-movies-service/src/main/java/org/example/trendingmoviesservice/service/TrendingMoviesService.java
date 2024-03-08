package org.example.trendingmoviesservice.service;


import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.Movies;
import org.example.TrendingMoviesGrpc;
import org.example.TrendingMoviesInfoGrpc;
import org.example.TrendingMoviesRatingGrpc;

@GrpcService
public class TrendingMoviesService extends TrendingMoviesGrpc.TrendingMoviesImplBase {

    @GrpcClient("rating-service")
    TrendingMoviesRatingGrpc.TrendingMoviesRatingBlockingStub trendingMoviesRatingService;

    @GrpcClient("movie-info-service")
    TrendingMoviesInfoGrpc.TrendingMoviesInfoBlockingStub trendingMoviesInfoService;

    @Override
    public void getTopTenTrendingMovies(Empty request, StreamObserver<Movies> responseObserver) {
        System.out.println("trending movies");
        var movieIds = trendingMoviesRatingService.getTopTenTrendingMoviesRating(request);
        var movies = trendingMoviesInfoService.getTopTenTrendingMoviesInfo(movieIds);
        responseObserver.onNext(movies);
        responseObserver.onCompleted();
    }
}
