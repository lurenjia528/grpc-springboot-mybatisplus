package com.csse.grpc.generate;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * service 方法参数 只接受message返回message
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: src/main/proto/user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.csse.grpc.generate.UserRequest,
      com.csse.grpc.generate.Response> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.csse.grpc.generate.UserRequest.class,
      responseType = com.csse.grpc.generate.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csse.grpc.generate.UserRequest,
      com.csse.grpc.generate.Response> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.csse.grpc.generate.UserRequest, com.csse.grpc.generate.Response> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.csse.grpc.generate.UserRequest, com.csse.grpc.generate.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csse.grpc.generate.UserRequest,
      com.csse.grpc.generate.Response> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.csse.grpc.generate.UserRequest.class,
      responseType = com.csse.grpc.generate.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csse.grpc.generate.UserRequest,
      com.csse.grpc.generate.Response> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.csse.grpc.generate.UserRequest, com.csse.grpc.generate.Response> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.csse.grpc.generate.UserRequest, com.csse.grpc.generate.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csse.grpc.generate.PageParam,
      com.csse.grpc.generate.AllUser> getGetUserAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserAll",
      requestType = com.csse.grpc.generate.PageParam.class,
      responseType = com.csse.grpc.generate.AllUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csse.grpc.generate.PageParam,
      com.csse.grpc.generate.AllUser> getGetUserAllMethod() {
    io.grpc.MethodDescriptor<com.csse.grpc.generate.PageParam, com.csse.grpc.generate.AllUser> getGetUserAllMethod;
    if ((getGetUserAllMethod = UserServiceGrpc.getGetUserAllMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserAllMethod = UserServiceGrpc.getGetUserAllMethod) == null) {
          UserServiceGrpc.getGetUserAllMethod = getGetUserAllMethod =
              io.grpc.MethodDescriptor.<com.csse.grpc.generate.PageParam, com.csse.grpc.generate.AllUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.PageParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.AllUser.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserAll"))
              .build();
        }
      }
    }
    return getGetUserAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getGetMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getGetMethod;
    if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
          UserServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csse.grpc.generate.Message,
      com.csse.grpc.generate.Message> getTestStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestStream",
      requestType = com.csse.grpc.generate.Message.class,
      responseType = com.csse.grpc.generate.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.csse.grpc.generate.Message,
      com.csse.grpc.generate.Message> getTestStreamMethod() {
    io.grpc.MethodDescriptor<com.csse.grpc.generate.Message, com.csse.grpc.generate.Message> getTestStreamMethod;
    if ((getTestStreamMethod = UserServiceGrpc.getTestStreamMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getTestStreamMethod = UserServiceGrpc.getTestStreamMethod) == null) {
          UserServiceGrpc.getTestStreamMethod = getTestStreamMethod =
              io.grpc.MethodDescriptor.<com.csse.grpc.generate.Message, com.csse.grpc.generate.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csse.grpc.generate.Message.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("TestStream"))
              .build();
        }
      }
    }
    return getTestStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * service 方法参数 只接受message返回message
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUser(com.csse.grpc.generate.UserRequest request,
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.csse.grpc.generate.UserRequest request,
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserAll(com.csse.grpc.generate.PageParam request,
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.AllUser> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * 空
     * </pre>
     */
    public void get(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.csse.grpc.generate.Message> testStream(
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.Message> responseObserver) {
      return asyncUnimplementedStreamingCall(getTestStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csse.grpc.generate.UserRequest,
                com.csse.grpc.generate.Response>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csse.grpc.generate.UserRequest,
                com.csse.grpc.generate.Response>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetUserAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csse.grpc.generate.PageParam,
                com.csse.grpc.generate.AllUser>(
                  this, METHODID_GET_USER_ALL)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_GET)))
          .addMethod(
            getTestStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.csse.grpc.generate.Message,
                com.csse.grpc.generate.Message>(
                  this, METHODID_TEST_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * service 方法参数 只接受message返回message
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(com.csse.grpc.generate.UserRequest request,
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.csse.grpc.generate.UserRequest request,
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserAll(com.csse.grpc.generate.PageParam request,
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.AllUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 空
     * </pre>
     */
    public void get(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.csse.grpc.generate.Message> testStream(
        io.grpc.stub.StreamObserver<com.csse.grpc.generate.Message> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getTestStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * service 方法参数 只接受message返回message
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.csse.grpc.generate.Response getUser(com.csse.grpc.generate.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.csse.grpc.generate.Response deleteUser(com.csse.grpc.generate.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.csse.grpc.generate.AllUser getUserAll(com.csse.grpc.generate.PageParam request) {
      return blockingUnaryCall(
          getChannel(), getGetUserAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 空
     * </pre>
     */
    public com.google.protobuf.Empty get(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * service 方法参数 只接受message返回message
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csse.grpc.generate.Response> getUser(
        com.csse.grpc.generate.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csse.grpc.generate.Response> deleteUser(
        com.csse.grpc.generate.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csse.grpc.generate.AllUser> getUserAll(
        com.csse.grpc.generate.PageParam request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 空
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> get(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_DELETE_USER = 1;
  private static final int METHODID_GET_USER_ALL = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_TEST_STREAM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((com.csse.grpc.generate.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.csse.grpc.generate.Response>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.csse.grpc.generate.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.csse.grpc.generate.Response>) responseObserver);
          break;
        case METHODID_GET_USER_ALL:
          serviceImpl.getUserAll((com.csse.grpc.generate.PageParam) request,
              (io.grpc.stub.StreamObserver<com.csse.grpc.generate.AllUser>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
        case METHODID_TEST_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.testStream(
              (io.grpc.stub.StreamObserver<com.csse.grpc.generate.Message>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.csse.grpc.generate.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetUserAllMethod())
              .addMethod(getGetMethod())
              .addMethod(getTestStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
