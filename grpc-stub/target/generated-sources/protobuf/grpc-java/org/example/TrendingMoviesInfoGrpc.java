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
public final class TrendingMoviesInfoGrpc {

  private TrendingMoviesInfoGrpc() {}

  public static final String SERVICE_NAME = "org.example.TrendingMoviesInfo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.example.TopMovieIds,
      org.example.Movies> METHOD_GET_TOP_TEN_TRENDING_MOVIES_INFO =
      io.grpc.MethodDescriptor.<org.example.TopMovieIds, org.example.Movies>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.TrendingMoviesInfo", "getTopTenTrendingMoviesInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.TopMovieIds.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Movies.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesInfoStub newStub(io.grpc.Channel channel) {
    return new TrendingMoviesInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrendingMoviesInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrendingMoviesInfoFutureStub(channel);
  }

  /**
   */
  public static abstract class TrendingMoviesInfoImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTopTenTrendingMoviesInfo(org.example.TopMovieIds request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES_INFO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_TOP_TEN_TRENDING_MOVIES_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                org.example.TopMovieIds,
                org.example.Movies>(
                  this, METHODID_GET_TOP_TEN_TRENDING_MOVIES_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class TrendingMoviesInfoStub extends io.grpc.stub.AbstractStub<TrendingMoviesInfoStub> {
    private TrendingMoviesInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesInfoStub(channel, callOptions);
    }

    /**
     */
    public void getTopTenTrendingMoviesInfo(org.example.TopMovieIds request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES_INFO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrendingMoviesInfoBlockingStub extends io.grpc.stub.AbstractStub<TrendingMoviesInfoBlockingStub> {
    private TrendingMoviesInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.Movies getTopTenTrendingMoviesInfo(org.example.TopMovieIds request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOP_TEN_TRENDING_MOVIES_INFO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrendingMoviesInfoFutureStub extends io.grpc.stub.AbstractStub<TrendingMoviesInfoFutureStub> {
    private TrendingMoviesInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrendingMoviesInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrendingMoviesInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Movies> getTopTenTrendingMoviesInfo(
        org.example.TopMovieIds request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_TEN_TRENDING_MOVIES_INFO, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TEN_TRENDING_MOVIES_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrendingMoviesInfoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrendingMoviesInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP_TEN_TRENDING_MOVIES_INFO:
          serviceImpl.getTopTenTrendingMoviesInfo((org.example.TopMovieIds) request,
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

  private static final class TrendingMoviesInfoDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Schema.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrendingMoviesInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrendingMoviesInfoDescriptorSupplier())
              .addMethod(METHOD_GET_TOP_TEN_TRENDING_MOVIES_INFO)
              .build();
        }
      }
    }
    return result;
  }
}
