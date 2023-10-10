package com.baizhukui.sparrowdb.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: Sparrow.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SparrowServiceGrpc {

  private SparrowServiceGrpc() {}

  public static final String SERVICE_NAME = "SparrowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SparrowApi.PutRequest,
      SparrowApi.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = SparrowApi.PutRequest.class,
      responseType = SparrowApi.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SparrowApi.PutRequest,
      SparrowApi.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<SparrowApi.PutRequest, SparrowApi.PutResponse> getPutMethod;
    if ((getPutMethod = SparrowServiceGrpc.getPutMethod) == null) {
      synchronized (SparrowServiceGrpc.class) {
        if ((getPutMethod = SparrowServiceGrpc.getPutMethod) == null) {
          SparrowServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<SparrowApi.PutRequest, SparrowApi.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SparrowApi.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SparrowApi.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparrowServiceMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SparrowApi.GetRequest,
      SparrowApi.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = SparrowApi.GetRequest.class,
      responseType = SparrowApi.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SparrowApi.GetRequest,
      SparrowApi.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<SparrowApi.GetRequest, SparrowApi.GetResponse> getGetMethod;
    if ((getGetMethod = SparrowServiceGrpc.getGetMethod) == null) {
      synchronized (SparrowServiceGrpc.class) {
        if ((getGetMethod = SparrowServiceGrpc.getGetMethod) == null) {
          SparrowServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<SparrowApi.GetRequest, SparrowApi.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SparrowApi.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SparrowApi.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SparrowServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SparrowApi.DeleteRequest,
      SparrowApi.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = SparrowApi.DeleteRequest.class,
      responseType = SparrowApi.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SparrowApi.DeleteRequest,
      SparrowApi.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<SparrowApi.DeleteRequest, SparrowApi.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = SparrowServiceGrpc.getDeleteMethod) == null) {
      synchronized (SparrowServiceGrpc.class) {
        if ((getDeleteMethod = SparrowServiceGrpc.getDeleteMethod) == null) {
          SparrowServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<SparrowApi.DeleteRequest, SparrowApi.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SparrowApi.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SparrowApi.DeleteResponse.getDefaultInstance()))
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
        @Override
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
        @Override
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
        @Override
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
    default void put(SparrowApi.PutRequest request,
                     io.grpc.stub.StreamObserver<SparrowApi.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    default void get(SparrowApi.GetRequest request,
                     io.grpc.stub.StreamObserver<SparrowApi.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void delete(SparrowApi.DeleteRequest request,
                        io.grpc.stub.StreamObserver<SparrowApi.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SparrowService.
   */
  public static abstract class SparrowServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
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

    @Override
    protected SparrowServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparrowServiceStub(channel, callOptions);
    }

    /**
     */
    public void put(SparrowApi.PutRequest request,
                    io.grpc.stub.StreamObserver<SparrowApi.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(SparrowApi.GetRequest request,
                    io.grpc.stub.StreamObserver<SparrowApi.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(SparrowApi.DeleteRequest request,
                       io.grpc.stub.StreamObserver<SparrowApi.DeleteResponse> responseObserver) {
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

    @Override
    protected SparrowServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparrowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public SparrowApi.PutResponse put(SparrowApi.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public SparrowApi.GetResponse get(SparrowApi.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public SparrowApi.DeleteResponse delete(SparrowApi.DeleteRequest request) {
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

    @Override
    protected SparrowServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SparrowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SparrowApi.PutResponse> put(
        SparrowApi.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SparrowApi.GetResponse> get(
        SparrowApi.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SparrowApi.DeleteResponse> delete(
        SparrowApi.DeleteRequest request) {
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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((SparrowApi.PutRequest) request,
              (io.grpc.stub.StreamObserver<SparrowApi.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((SparrowApi.GetRequest) request,
              (io.grpc.stub.StreamObserver<SparrowApi.GetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((SparrowApi.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<SparrowApi.DeleteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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
              SparrowApi.PutRequest,
              SparrowApi.PutResponse>(
                service, METHODID_PUT)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SparrowApi.GetRequest,
              SparrowApi.GetResponse>(
                service, METHODID_GET)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SparrowApi.DeleteRequest,
              SparrowApi.DeleteResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class SparrowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SparrowServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SparrowApi.getDescriptor();
    }

    @Override
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
    private final String methodName;

    SparrowServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
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
