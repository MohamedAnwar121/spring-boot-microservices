package org.example;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Schema.proto")
public final class TrendingMoviesRatingGrpc {

  private TrendingMoviesRatingGrpc() {}

  public static final String SERVICE_NAME = "org.example.TrendingMoviesRating";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.TopMovieIds> METHOD_GET_TOP_TEN_TRENDING_MOVIES_RATING =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.TopMovieIds>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.TrendingMoviesRating", "getTopTenTrendingMoviesRating"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.TopMovieIds.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesRatingStub newStub(io.grpc.Channel channel) {
    return new TrendingMoviesRatingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesRatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrendingMoviesRatingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesRatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrendingMoviesRatingFutureStub(channel);
  }

  /**
   */
  public static abstract class TrendingMoviesRatingImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTopTenTrendingMoviesRating(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.TopMovieIds> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES_RATING, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_TOP_TEN_TRENDING_MOVIES_RATING,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.TopMovieIds>(
                  this, METHODID_GET_TOP_TEN_TRENDING_MOVIES_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class TrendingMoviesRatingStub extends io.grpc.stub.AbstractStub<TrendingMoviesRatingStub> {
    private TrendingMoviesRatingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesRatingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesRatingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesRatingStub(channel, callOptions);
    }

    /**
     */
    public void getTopTenTrendingMoviesRating(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.TopMovieIds> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES_RATING, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrendingMoviesRatingBlockingStub extends io.grpc.stub.AbstractStub<TrendingMoviesRatingBlockingStub> {
    private TrendingMoviesRatingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesRatingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesRatingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesRatingBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.TopMovieIds getTopTenTrendingMoviesRating(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOP_TEN_TRENDING_MOVIES_RATING, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrendingMoviesRatingFutureStub extends io.grpc.stub.AbstractStub<TrendingMoviesRatingFutureStub> {
    private TrendingMoviesRatingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesRatingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesRatingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesRatingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.TopMovieIds> getTopTenTrendingMoviesRating(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES_RATING, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TEN_TRENDING_MOVIES_RATING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrendingMoviesRatingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrendingMoviesRatingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP_TEN_TRENDING_MOVIES_RATING:
          serviceImpl.getTopTenTrendingMoviesRating((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.TopMovieIds>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class TrendingMoviesRatingDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Schema.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrendingMoviesRatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrendingMoviesRatingDescriptorSupplier())
              .addMethod(METHOD_GET_TOP_TEN_TRENDING_MOVIES_RATING)
              .build();
        }
      }
    }
    return result;
  }
}
