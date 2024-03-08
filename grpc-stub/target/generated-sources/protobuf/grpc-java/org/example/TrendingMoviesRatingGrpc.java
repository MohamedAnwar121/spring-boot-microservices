package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: Schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrendingMoviesRatingGrpc {

  private TrendingMoviesRatingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.TrendingMoviesRating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.TopMovieIds> getGetTopTenTrendingMoviesRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTopTenTrendingMoviesRating",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.TopMovieIds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.TopMovieIds> getGetTopTenTrendingMoviesRatingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.TopMovieIds> getGetTopTenTrendingMoviesRatingMethod;
    if ((getGetTopTenTrendingMoviesRatingMethod = TrendingMoviesRatingGrpc.getGetTopTenTrendingMoviesRatingMethod) == null) {
      synchronized (TrendingMoviesRatingGrpc.class) {
        if ((getGetTopTenTrendingMoviesRatingMethod = TrendingMoviesRatingGrpc.getGetTopTenTrendingMoviesRatingMethod) == null) {
          TrendingMoviesRatingGrpc.getGetTopTenTrendingMoviesRatingMethod = getGetTopTenTrendingMoviesRatingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.TopMovieIds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTopTenTrendingMoviesRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.TopMovieIds.getDefaultInstance()))
              .setSchemaDescriptor(new TrendingMoviesRatingMethodDescriptorSupplier("getTopTenTrendingMoviesRating"))
              .build();
        }
      }
    }
    return getGetTopTenTrendingMoviesRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesRatingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesRatingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesRatingStub>() {
        @java.lang.Override
        public TrendingMoviesRatingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesRatingStub(channel, callOptions);
        }
      };
    return TrendingMoviesRatingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesRatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesRatingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesRatingBlockingStub>() {
        @java.lang.Override
        public TrendingMoviesRatingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesRatingBlockingStub(channel, callOptions);
        }
      };
    return TrendingMoviesRatingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesRatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesRatingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesRatingFutureStub>() {
        @java.lang.Override
        public TrendingMoviesRatingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesRatingFutureStub(channel, callOptions);
        }
      };
    return TrendingMoviesRatingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTopTenTrendingMoviesRating(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.TopMovieIds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopTenTrendingMoviesRatingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrendingMoviesRating.
   */
  public static abstract class TrendingMoviesRatingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrendingMoviesRatingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrendingMoviesRating.
   */
  public static final class TrendingMoviesRatingStub
      extends io.grpc.stub.AbstractAsyncStub<TrendingMoviesRatingStub> {
    private TrendingMoviesRatingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesRatingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesRatingStub(channel, callOptions);
    }

    /**
     */
    public void getTopTenTrendingMoviesRating(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.TopMovieIds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrendingMoviesRating.
   */
  public static final class TrendingMoviesRatingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrendingMoviesRatingBlockingStub> {
    private TrendingMoviesRatingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesRatingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesRatingBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.TopMovieIds getTopTenTrendingMoviesRating(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTopTenTrendingMoviesRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrendingMoviesRating.
   */
  public static final class TrendingMoviesRatingFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrendingMoviesRatingFutureStub> {
    private TrendingMoviesRatingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesRatingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesRatingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.TopMovieIds> getTopTenTrendingMoviesRating(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TEN_TRENDING_MOVIES_RATING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTopTenTrendingMoviesRatingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.example.TopMovieIds>(
                service, METHODID_GET_TOP_TEN_TRENDING_MOVIES_RATING)))
        .build();
  }

  private static abstract class TrendingMoviesRatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrendingMoviesRatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrendingMoviesRating");
    }
  }

  private static final class TrendingMoviesRatingFileDescriptorSupplier
      extends TrendingMoviesRatingBaseDescriptorSupplier {
    TrendingMoviesRatingFileDescriptorSupplier() {}
  }

  private static final class TrendingMoviesRatingMethodDescriptorSupplier
      extends TrendingMoviesRatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrendingMoviesRatingMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
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
              .setSchemaDescriptor(new TrendingMoviesRatingFileDescriptorSupplier())
              .addMethod(getGetTopTenTrendingMoviesRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
