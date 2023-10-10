package com.baizhukui.sparrow.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: Sparrow.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SparrowServiceGrpc {

  private SparrowServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SparrowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.PutRequest,
      com.baizhukui.sparrow.api.SparrowApi.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = com.baizhukui.sparrow.api.SparrowApi.PutRequest.class,
      responseType = com.baizhukui.sparrow.api.SparrowApi.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.PutRequest,
      com.baizhukui.sparrow.api.SparrowApi.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.PutRequest, com.baizhukui.sparrow.api.SparrowApi.PutResponse> getPutMethod;
    if ((getPutMethod = SparrowServiceGrpc.getPutMethod) == null) {
      synchronized (SparrowServiceGrpc.class) {
        if ((getPutMethod = SparrowServiceGrpc.getPutMethod) == null) {
          SparrowServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<com.baizhukui.sparrow.api.SparrowApi.PutRequest, com.baizhukui.sparrow.api.SparrowApi.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.baizhukui.sparrow.api.SparrowApi.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.baizhukui.sparrow.api.SparrowApi.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparrowServiceMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.GetRequest,
      com.baizhukui.sparrow.api.SparrowApi.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.baizhukui.sparrow.api.SparrowApi.GetRequest.class,
      responseType = com.baizhukui.sparrow.api.SparrowApi.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.GetRequest,
      com.baizhukui.sparrow.api.SparrowApi.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.GetRequest, com.baizhukui.sparrow.api.SparrowApi.GetResponse> getGetMethod;
    if ((getGetMethod = SparrowServiceGrpc.getGetMethod) == null) {
      synchronized (SparrowServiceGrpc.class) {
        if ((getGetMethod = SparrowServiceGrpc.getGetMethod) == null) {
          SparrowServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.baizhukui.sparrow.api.SparrowApi.GetRequest, com.baizhukui.sparrow.api.SparrowApi.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.baizhukui.sparrow.api.SparrowApi.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.baizhukui.sparrow.api.SparrowApi.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparrowServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.DeleteRequest,
      com.baizhukui.sparrow.api.SparrowApi.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.baizhukui.sparrow.api.SparrowApi.DeleteRequest.class,
      responseType = com.baizhukui.sparrow.api.SparrowApi.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.DeleteRequest,
      com.baizhukui.sparrow.api.SparrowApi.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.baizhukui.sparrow.api.SparrowApi.DeleteRequest, com.baizhukui.sparrow.api.SparrowApi.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = SparrowServiceGrpc.getDeleteMethod) == null) {
      synchronized (SparrowServiceGrpc.class) {
        if ((getDeleteMethod = SparrowServiceGrpc.getDeleteMethod) == null) {
          SparrowServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.baizhukui.sparrow.api.SparrowApi.DeleteRequest, com.baizhukui.sparrow.api.SparrowApi.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.baizhukui.sparrow.api.SparrowApi.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.baizhukui.sparrow.api.SparrowApi.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparrowServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SparrowServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SparrowServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SparrowServiceStub>() {
        @java.lang.Override
        public SparrowServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SparrowServiceStub(channel, callOptions);
        }
      };
    return SparrowServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SparrowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SparrowServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SparrowServiceBlockingStub>() {
        @java.lang.Override
        public SparrowServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SparrowServiceBlockingStub(channel, callOptions);
        }
      };
    return SparrowServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SparrowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SparrowServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SparrowServiceFutureStub>() {
        @java.lang.Override
        public SparrowServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SparrowServiceFutureStub(channel, callOptions);
        }
      };
    return SparrowServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void put(com.baizhukui.sparrow.api.SparrowApi.PutRequest request,
        io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    default void get(com.baizhukui.sparrow.api.SparrowApi.GetRequest request,
        io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void delete(com.baizhukui.sparrow.api.SparrowApi.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SparrowService.
   */
  public static abstract class SparrowServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SparrowServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SparrowService.
   */
  public static final class SparrowServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SparrowServiceStub> {
    private SparrowServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparrowServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparrowServiceStub(channel, callOptions);
    }

    /**
     */
    public void put(com.baizhukui.sparrow.api.SparrowApi.PutRequest request,
        io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.baizhukui.sparrow.api.SparrowApi.GetRequest request,
        io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.baizhukui.sparrow.api.SparrowApi.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SparrowService.
   */
  public static final class SparrowServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SparrowServiceBlockingStub> {
    private SparrowServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparrowServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparrowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.baizhukui.sparrow.api.SparrowApi.PutResponse put(com.baizhukui.sparrow.api.SparrowApi.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.baizhukui.sparrow.api.SparrowApi.GetResponse get(com.baizhukui.sparrow.api.SparrowApi.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.baizhukui.sparrow.api.SparrowApi.DeleteResponse delete(com.baizhukui.sparrow.api.SparrowApi.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SparrowService.
   */
  public static final class SparrowServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SparrowServiceFutureStub> {
    private SparrowServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparrowServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparrowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.baizhukui.sparrow.api.SparrowApi.PutResponse> put(
        com.baizhukui.sparrow.api.SparrowApi.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.baizhukui.sparrow.api.SparrowApi.GetResponse> get(
        com.baizhukui.sparrow.api.SparrowApi.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.baizhukui.sparrow.api.SparrowApi.DeleteResponse> delete(
        com.baizhukui.sparrow.api.SparrowApi.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;

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
        case METHODID_PUT:
          serviceImpl.put((com.baizhukui.sparrow.api.SparrowApi.PutRequest) request,
              (io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.baizhukui.sparrow.api.SparrowApi.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.GetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.baizhukui.sparrow.api.SparrowApi.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.baizhukui.sparrow.api.SparrowApi.DeleteResponse>) responseObserver);
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
          getPutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.baizhukui.sparrow.api.SparrowApi.PutRequest,
              com.baizhukui.sparrow.api.SparrowApi.PutResponse>(
                service, METHODID_PUT)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.baizhukui.sparrow.api.SparrowApi.GetRequest,
              com.baizhukui.sparrow.api.SparrowApi.GetResponse>(
                service, METHODID_GET)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.baizhukui.sparrow.api.SparrowApi.DeleteRequest,
              com.baizhukui.sparrow.api.SparrowApi.DeleteResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class SparrowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SparrowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.baizhukui.sparrow.api.SparrowApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SparrowService");
    }
  }

  private static final class SparrowServiceFileDescriptorSupplier
      extends SparrowServiceBaseDescriptorSupplier {
    SparrowServiceFileDescriptorSupplier() {}
  }

  private static final class SparrowServiceMethodDescriptorSupplier
      extends SparrowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SparrowServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SparrowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SparrowServiceFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
