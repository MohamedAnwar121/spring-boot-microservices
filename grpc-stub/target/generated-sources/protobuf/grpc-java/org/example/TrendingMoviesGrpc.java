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
public final class TrendingMoviesGrpc {

  private TrendingMoviesGrpc() {}

  public static final String SERVICE_NAME = "org.example.TrendingMovies";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.Movies> METHOD_GET_TOP_TEN_TRENDING_MOVIES =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.Movies>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.TrendingMovies", "getTopTenTrendingMovies"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Movies.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesStub newStub(io.grpc.Channel channel) {
    return new TrendingMoviesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrendingMoviesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrendingMoviesFutureStub(channel);
  }

  /**
   */
  public static abstract class TrendingMoviesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTopTenTrendingMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_TOP_TEN_TRENDING_MOVIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.Movies>(
                  this, METHODID_GET_TOP_TEN_TRENDING_MOVIES)))
          .build();
    }
  }

  /**
   */
  public static final class TrendingMoviesStub extends io.grpc.stub.AbstractStub<TrendingMoviesStub> {
    private TrendingMoviesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesStub(channel, callOptions);
    }

    /**
     */
    public void getTopTenTrendingMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrendingMoviesBlockingStub extends io.grpc.stub.AbstractStub<TrendingMoviesBlockingStub> {
    private TrendingMoviesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.Movies getTopTenTrendingMovies(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOP_TEN_TRENDING_MOVIES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrendingMoviesFutureStub extends io.grpc.stub.AbstractStub<TrendingMoviesFutureStub> {
    private TrendingMoviesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Movies> getTopTenTrendingMovies(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TEN_TRENDING_MOVIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrendingMoviesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrendingMoviesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP_TEN_TRENDING_MOVIES:
          serviceImpl.getTopTenTrendingMovies((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.Movies>) responseObserver);
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

  private static final class TrendingMoviesDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Schema.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrendingMoviesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrendingMoviesDescriptorSupplier())
              .addMethod(METHOD_GET_TOP_TEN_TRENDING_MOVIES)
              .build();
        }
      }
    }
    return result;
  }
}