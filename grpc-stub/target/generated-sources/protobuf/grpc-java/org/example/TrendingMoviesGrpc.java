package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: Schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrendingMoviesGrpc {

  private TrendingMoviesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.TrendingMovies";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.Movies> getGetTopTenTrendingMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTopTenTrendingMovies",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.Movies.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.Movies> getGetTopTenTrendingMoviesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.Movies> getGetTopTenTrendingMoviesMethod;
    if ((getGetTopTenTrendingMoviesMethod = TrendingMoviesGrpc.getGetTopTenTrendingMoviesMethod) == null) {
      synchronized (TrendingMoviesGrpc.class) {
        if ((getGetTopTenTrendingMoviesMethod = TrendingMoviesGrpc.getGetTopTenTrendingMoviesMethod) == null) {
          TrendingMoviesGrpc.getGetTopTenTrendingMoviesMethod = getGetTopTenTrendingMoviesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.Movies>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTopTenTrendingMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Movies.getDefaultInstance()))
              .setSchemaDescriptor(new TrendingMoviesMethodDescriptorSupplier("getTopTenTrendingMovies"))
              .build();
        }
      }
    }
    return getGetTopTenTrendingMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesStub>() {
        @java.lang.Override
        public TrendingMoviesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesStub(channel, callOptions);
        }
      };
    return TrendingMoviesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesBlockingStub>() {
        @java.lang.Override
        public TrendingMoviesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesBlockingStub(channel, callOptions);
        }
      };
    return TrendingMoviesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesFutureStub>() {
        @java.lang.Override
        public TrendingMoviesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesFutureStub(channel, callOptions);
        }
      };
    return TrendingMoviesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTopTenTrendingMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopTenTrendingMoviesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrendingMovies.
   */
  public static abstract class TrendingMoviesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrendingMoviesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrendingMovies.
   */
  public static final class TrendingMoviesStub
      extends io.grpc.stub.AbstractAsyncStub<TrendingMoviesStub> {
    private TrendingMoviesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesStub(channel, callOptions);
    }

    /**
     */
    public void getTopTenTrendingMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrendingMovies.
   */
  public static final class TrendingMoviesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrendingMoviesBlockingStub> {
    private TrendingMoviesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.Movies getTopTenTrendingMovies(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTopTenTrendingMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrendingMovies.
   */
  public static final class TrendingMoviesFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrendingMoviesFutureStub> {
    private TrendingMoviesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Movies> getTopTenTrendingMovies(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TEN_TRENDING_MOVIES = 0;

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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTopTenTrendingMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.example.Movies>(
                service, METHODID_GET_TOP_TEN_TRENDING_MOVIES)))
        .build();
  }

  private static abstract class TrendingMoviesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrendingMoviesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrendingMovies");
    }
  }

  private static final class TrendingMoviesFileDescriptorSupplier
      extends TrendingMoviesBaseDescriptorSupplier {
    TrendingMoviesFileDescriptorSupplier() {}
  }

  private static final class TrendingMoviesMethodDescriptorSupplier
      extends TrendingMoviesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrendingMoviesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TrendingMoviesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrendingMoviesFileDescriptorSupplier())
              .addMethod(getGetTopTenTrendingMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
