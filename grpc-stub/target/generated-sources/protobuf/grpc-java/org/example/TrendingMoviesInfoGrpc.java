package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: Schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrendingMoviesInfoGrpc {

  private TrendingMoviesInfoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.TrendingMoviesInfo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.TopMovieIds,
      org.example.Movies> getGetTopTenTrendingMoviesInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTopTenTrendingMoviesInfo",
      requestType = org.example.TopMovieIds.class,
      responseType = org.example.Movies.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.TopMovieIds,
      org.example.Movies> getGetTopTenTrendingMoviesInfoMethod() {
    io.grpc.MethodDescriptor<org.example.TopMovieIds, org.example.Movies> getGetTopTenTrendingMoviesInfoMethod;
    if ((getGetTopTenTrendingMoviesInfoMethod = TrendingMoviesInfoGrpc.getGetTopTenTrendingMoviesInfoMethod) == null) {
      synchronized (TrendingMoviesInfoGrpc.class) {
        if ((getGetTopTenTrendingMoviesInfoMethod = TrendingMoviesInfoGrpc.getGetTopTenTrendingMoviesInfoMethod) == null) {
          TrendingMoviesInfoGrpc.getGetTopTenTrendingMoviesInfoMethod = getGetTopTenTrendingMoviesInfoMethod =
              io.grpc.MethodDescriptor.<org.example.TopMovieIds, org.example.Movies>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTopTenTrendingMoviesInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.TopMovieIds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Movies.getDefaultInstance()))
              .setSchemaDescriptor(new TrendingMoviesInfoMethodDescriptorSupplier("getTopTenTrendingMoviesInfo"))
              .build();
        }
      }
    }
    return getGetTopTenTrendingMoviesInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesInfoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesInfoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesInfoStub>() {
        @java.lang.Override
        public TrendingMoviesInfoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesInfoStub(channel, callOptions);
        }
      };
    return TrendingMoviesInfoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesInfoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesInfoBlockingStub>() {
        @java.lang.Override
        public TrendingMoviesInfoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesInfoBlockingStub(channel, callOptions);
        }
      };
    return TrendingMoviesInfoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesInfoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesInfoFutureStub>() {
        @java.lang.Override
        public TrendingMoviesInfoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesInfoFutureStub(channel, callOptions);
        }
      };
    return TrendingMoviesInfoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTopTenTrendingMoviesInfo(org.example.TopMovieIds request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopTenTrendingMoviesInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrendingMoviesInfo.
   */
  public static abstract class TrendingMoviesInfoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrendingMoviesInfoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrendingMoviesInfo.
   */
  public static final class TrendingMoviesInfoStub
      extends io.grpc.stub.AbstractAsyncStub<TrendingMoviesInfoStub> {
    private TrendingMoviesInfoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesInfoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesInfoStub(channel, callOptions);
    }

    /**
     */
    public void getTopTenTrendingMoviesInfo(org.example.TopMovieIds request,
        io.grpc.stub.StreamObserver<org.example.Movies> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrendingMoviesInfo.
   */
  public static final class TrendingMoviesInfoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrendingMoviesInfoBlockingStub> {
    private TrendingMoviesInfoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesInfoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.Movies getTopTenTrendingMoviesInfo(org.example.TopMovieIds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTopTenTrendingMoviesInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrendingMoviesInfo.
   */
  public static final class TrendingMoviesInfoFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrendingMoviesInfoFutureStub> {
    private TrendingMoviesInfoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesInfoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Movies> getTopTenTrendingMoviesInfo(
        org.example.TopMovieIds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TEN_TRENDING_MOVIES_INFO = 0;

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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTopTenTrendingMoviesInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.TopMovieIds,
              org.example.Movies>(
                service, METHODID_GET_TOP_TEN_TRENDING_MOVIES_INFO)))
        .build();
  }

  private static abstract class TrendingMoviesInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrendingMoviesInfoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrendingMoviesInfo");
    }
  }

  private static final class TrendingMoviesInfoFileDescriptorSupplier
      extends TrendingMoviesInfoBaseDescriptorSupplier {
    TrendingMoviesInfoFileDescriptorSupplier() {}
  }

  private static final class TrendingMoviesInfoMethodDescriptorSupplier
      extends TrendingMoviesInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrendingMoviesInfoMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TrendingMoviesInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrendingMoviesInfoFileDescriptorSupplier())
              .addMethod(getGetTopTenTrendingMoviesInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
