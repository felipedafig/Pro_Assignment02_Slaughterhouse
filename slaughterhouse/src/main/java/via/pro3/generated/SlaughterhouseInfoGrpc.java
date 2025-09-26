package via.pro3.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SlaughterhouseInfoGrpc {

  private SlaughterhouseInfoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SlaughterhouseInfo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.pro3.generated.ProductRequest,
      via.pro3.generated.AnimalsResponse> getGetAnimalsByProductIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsByProductId",
      requestType = via.pro3.generated.ProductRequest.class,
      responseType = via.pro3.generated.AnimalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.pro3.generated.ProductRequest,
      via.pro3.generated.AnimalsResponse> getGetAnimalsByProductIdMethod() {
    io.grpc.MethodDescriptor<via.pro3.generated.ProductRequest, via.pro3.generated.AnimalsResponse> getGetAnimalsByProductIdMethod;
    if ((getGetAnimalsByProductIdMethod = SlaughterhouseInfoGrpc.getGetAnimalsByProductIdMethod) == null) {
      synchronized (SlaughterhouseInfoGrpc.class) {
        if ((getGetAnimalsByProductIdMethod = SlaughterhouseInfoGrpc.getGetAnimalsByProductIdMethod) == null) {
          SlaughterhouseInfoGrpc.getGetAnimalsByProductIdMethod = getGetAnimalsByProductIdMethod =
              io.grpc.MethodDescriptor.<via.pro3.generated.ProductRequest, via.pro3.generated.AnimalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimalsByProductId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.pro3.generated.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.pro3.generated.AnimalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseInfoMethodDescriptorSupplier("GetAnimalsByProductId"))
              .build();
        }
      }
    }
    return getGetAnimalsByProductIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.pro3.generated.AnimalRequest,
      via.pro3.generated.ProductsResponse> getGetProductsByAnimalIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByAnimalId",
      requestType = via.pro3.generated.AnimalRequest.class,
      responseType = via.pro3.generated.ProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.pro3.generated.AnimalRequest,
      via.pro3.generated.ProductsResponse> getGetProductsByAnimalIdMethod() {
    io.grpc.MethodDescriptor<via.pro3.generated.AnimalRequest, via.pro3.generated.ProductsResponse> getGetProductsByAnimalIdMethod;
    if ((getGetProductsByAnimalIdMethod = SlaughterhouseInfoGrpc.getGetProductsByAnimalIdMethod) == null) {
      synchronized (SlaughterhouseInfoGrpc.class) {
        if ((getGetProductsByAnimalIdMethod = SlaughterhouseInfoGrpc.getGetProductsByAnimalIdMethod) == null) {
          SlaughterhouseInfoGrpc.getGetProductsByAnimalIdMethod = getGetProductsByAnimalIdMethod =
              io.grpc.MethodDescriptor.<via.pro3.generated.AnimalRequest, via.pro3.generated.ProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByAnimalId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.pro3.generated.AnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.pro3.generated.ProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseInfoMethodDescriptorSupplier("GetProductsByAnimalId"))
              .build();
        }
      }
    }
    return getGetProductsByAnimalIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterhouseInfoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoStub>() {
        @java.lang.Override
        public SlaughterhouseInfoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseInfoStub(channel, callOptions);
        }
      };
    return SlaughterhouseInfoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SlaughterhouseInfoBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoBlockingV2Stub>() {
        @java.lang.Override
        public SlaughterhouseInfoBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseInfoBlockingV2Stub(channel, callOptions);
        }
      };
    return SlaughterhouseInfoBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterhouseInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoBlockingStub>() {
        @java.lang.Override
        public SlaughterhouseInfoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseInfoBlockingStub(channel, callOptions);
        }
      };
    return SlaughterhouseInfoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterhouseInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseInfoFutureStub>() {
        @java.lang.Override
        public SlaughterhouseInfoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseInfoFutureStub(channel, callOptions);
        }
      };
    return SlaughterhouseInfoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAnimalsByProductId(via.pro3.generated.ProductRequest request,
        io.grpc.stub.StreamObserver<via.pro3.generated.AnimalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsByProductIdMethod(), responseObserver);
    }

    /**
     */
    default void getProductsByAnimalId(via.pro3.generated.AnimalRequest request,
        io.grpc.stub.StreamObserver<via.pro3.generated.ProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByAnimalIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SlaughterhouseInfo.
   */
  public static abstract class SlaughterhouseInfoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SlaughterhouseInfoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SlaughterhouseInfo.
   */
  public static final class SlaughterhouseInfoStub
      extends io.grpc.stub.AbstractAsyncStub<SlaughterhouseInfoStub> {
    private SlaughterhouseInfoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseInfoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseInfoStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalsByProductId(via.pro3.generated.ProductRequest request,
        io.grpc.stub.StreamObserver<via.pro3.generated.AnimalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsByProductIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsByAnimalId(via.pro3.generated.AnimalRequest request,
        io.grpc.stub.StreamObserver<via.pro3.generated.ProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsByAnimalIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SlaughterhouseInfo.
   */
  public static final class SlaughterhouseInfoBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SlaughterhouseInfoBlockingV2Stub> {
    private SlaughterhouseInfoBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseInfoBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseInfoBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public via.pro3.generated.AnimalsResponse getAnimalsByProductId(via.pro3.generated.ProductRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAnimalsByProductIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.pro3.generated.ProductsResponse getProductsByAnimalId(via.pro3.generated.AnimalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProductsByAnimalIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SlaughterhouseInfo.
   */
  public static final class SlaughterhouseInfoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SlaughterhouseInfoBlockingStub> {
    private SlaughterhouseInfoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseInfoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.pro3.generated.AnimalsResponse getAnimalsByProductId(via.pro3.generated.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsByProductIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.pro3.generated.ProductsResponse getProductsByAnimalId(via.pro3.generated.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByAnimalIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SlaughterhouseInfo.
   */
  public static final class SlaughterhouseInfoFutureStub
      extends io.grpc.stub.AbstractFutureStub<SlaughterhouseInfoFutureStub> {
    private SlaughterhouseInfoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseInfoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.generated.AnimalsResponse> getAnimalsByProductId(
        via.pro3.generated.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsByProductIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.generated.ProductsResponse> getProductsByAnimalId(
        via.pro3.generated.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsByAnimalIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMALS_BY_PRODUCT_ID = 0;
  private static final int METHODID_GET_PRODUCTS_BY_ANIMAL_ID = 1;

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
        case METHODID_GET_ANIMALS_BY_PRODUCT_ID:
          serviceImpl.getAnimalsByProductId((via.pro3.generated.ProductRequest) request,
              (io.grpc.stub.StreamObserver<via.pro3.generated.AnimalsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_ANIMAL_ID:
          serviceImpl.getProductsByAnimalId((via.pro3.generated.AnimalRequest) request,
              (io.grpc.stub.StreamObserver<via.pro3.generated.ProductsResponse>) responseObserver);
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
          getGetAnimalsByProductIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.pro3.generated.ProductRequest,
              via.pro3.generated.AnimalsResponse>(
                service, METHODID_GET_ANIMALS_BY_PRODUCT_ID)))
        .addMethod(
          getGetProductsByAnimalIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.pro3.generated.AnimalRequest,
              via.pro3.generated.ProductsResponse>(
                service, METHODID_GET_PRODUCTS_BY_ANIMAL_ID)))
        .build();
  }

  private static abstract class SlaughterhouseInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterhouseInfoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.pro3.generated.Slaughterhouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterhouseInfo");
    }
  }

  private static final class SlaughterhouseInfoFileDescriptorSupplier
      extends SlaughterhouseInfoBaseDescriptorSupplier {
    SlaughterhouseInfoFileDescriptorSupplier() {}
  }

  private static final class SlaughterhouseInfoMethodDescriptorSupplier
      extends SlaughterhouseInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SlaughterhouseInfoMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SlaughterhouseInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterhouseInfoFileDescriptorSupplier())
              .addMethod(getGetAnimalsByProductIdMethod())
              .addMethod(getGetProductsByAnimalIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
