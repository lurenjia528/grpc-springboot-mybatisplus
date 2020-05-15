// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/user.proto

package com.csse.grpc.generate;

/**
 * <pre>
 * service 方法参数 只接受message返回message
 * </pre>
 *
 * Protobuf service {@code UserService}
 */
public  abstract class UserService
    implements com.google.protobuf.Service {
  protected UserService() {}

  public interface Interface {
    /**
     * <code>rpc GetUser(.UserRequest) returns (.Response);</code>
     */
    public abstract void getUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done);

    /**
     * <code>rpc DeleteUser(.UserRequest) returns (.Response);</code>
     */
    public abstract void deleteUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done);

    /**
     * <code>rpc GetUserAll(.PageParam) returns (.AllUser);</code>
     */
    public abstract void getUserAll(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.PageParam request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.AllUser> done);

    /**
     * <pre>
     * 空
     * </pre>
     *
     * <code>rpc Get(.google.protobuf.Empty) returns (.google.protobuf.Empty);</code>
     */
    public abstract void get(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc TestStream(stream .Message) returns (stream .Message);</code>
     */
    public abstract void testStream(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.Message request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Message> done);

    /**
     * <code>rpc TestAny(.google.protobuf.Empty) returns (.Response);</code>
     */
    public abstract void testAny(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new UserService() {
      @java.lang.Override
      public  void getUser(
          com.google.protobuf.RpcController controller,
          com.csse.grpc.generate.UserRequest request,
          com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done) {
        impl.getUser(controller, request, done);
      }

      @java.lang.Override
      public  void deleteUser(
          com.google.protobuf.RpcController controller,
          com.csse.grpc.generate.UserRequest request,
          com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done) {
        impl.deleteUser(controller, request, done);
      }

      @java.lang.Override
      public  void getUserAll(
          com.google.protobuf.RpcController controller,
          com.csse.grpc.generate.PageParam request,
          com.google.protobuf.RpcCallback<com.csse.grpc.generate.AllUser> done) {
        impl.getUserAll(controller, request, done);
      }

      @java.lang.Override
      public  void get(
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Empty request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.get(controller, request, done);
      }

      @java.lang.Override
      public  void testStream(
          com.google.protobuf.RpcController controller,
          com.csse.grpc.generate.Message request,
          com.google.protobuf.RpcCallback<com.csse.grpc.generate.Message> done) {
        impl.testStream(controller, request, done);
      }

      @java.lang.Override
      public  void testAny(
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Empty request,
          com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done) {
        impl.testAny(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.getUser(controller, (com.csse.grpc.generate.UserRequest)request);
          case 1:
            return impl.deleteUser(controller, (com.csse.grpc.generate.UserRequest)request);
          case 2:
            return impl.getUserAll(controller, (com.csse.grpc.generate.PageParam)request);
          case 3:
            return impl.get(controller, (com.google.protobuf.Empty)request);
          case 4:
            return impl.testStream(controller, (com.csse.grpc.generate.Message)request);
          case 5:
            return impl.testAny(controller, (com.google.protobuf.Empty)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.csse.grpc.generate.UserRequest.getDefaultInstance();
          case 1:
            return com.csse.grpc.generate.UserRequest.getDefaultInstance();
          case 2:
            return com.csse.grpc.generate.PageParam.getDefaultInstance();
          case 3:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 4:
            return com.csse.grpc.generate.Message.getDefaultInstance();
          case 5:
            return com.google.protobuf.Empty.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.csse.grpc.generate.Response.getDefaultInstance();
          case 1:
            return com.csse.grpc.generate.Response.getDefaultInstance();
          case 2:
            return com.csse.grpc.generate.AllUser.getDefaultInstance();
          case 3:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 4:
            return com.csse.grpc.generate.Message.getDefaultInstance();
          case 5:
            return com.csse.grpc.generate.Response.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc GetUser(.UserRequest) returns (.Response);</code>
   */
  public abstract void getUser(
      com.google.protobuf.RpcController controller,
      com.csse.grpc.generate.UserRequest request,
      com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done);

  /**
   * <code>rpc DeleteUser(.UserRequest) returns (.Response);</code>
   */
  public abstract void deleteUser(
      com.google.protobuf.RpcController controller,
      com.csse.grpc.generate.UserRequest request,
      com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done);

  /**
   * <code>rpc GetUserAll(.PageParam) returns (.AllUser);</code>
   */
  public abstract void getUserAll(
      com.google.protobuf.RpcController controller,
      com.csse.grpc.generate.PageParam request,
      com.google.protobuf.RpcCallback<com.csse.grpc.generate.AllUser> done);

  /**
   * <pre>
   * 空
   * </pre>
   *
   * <code>rpc Get(.google.protobuf.Empty) returns (.google.protobuf.Empty);</code>
   */
  public abstract void get(
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Empty request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc TestStream(stream .Message) returns (stream .Message);</code>
   */
  public abstract void testStream(
      com.google.protobuf.RpcController controller,
      com.csse.grpc.generate.Message request,
      com.google.protobuf.RpcCallback<com.csse.grpc.generate.Message> done);

  /**
   * <code>rpc TestAny(.google.protobuf.Empty) returns (.Response);</code>
   */
  public abstract void testAny(
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Empty request,
      com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.csse.grpc.generate.UserProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.getUser(controller, (com.csse.grpc.generate.UserRequest)request,
          com.google.protobuf.RpcUtil.<com.csse.grpc.generate.Response>specializeCallback(
            done));
        return;
      case 1:
        this.deleteUser(controller, (com.csse.grpc.generate.UserRequest)request,
          com.google.protobuf.RpcUtil.<com.csse.grpc.generate.Response>specializeCallback(
            done));
        return;
      case 2:
        this.getUserAll(controller, (com.csse.grpc.generate.PageParam)request,
          com.google.protobuf.RpcUtil.<com.csse.grpc.generate.AllUser>specializeCallback(
            done));
        return;
      case 3:
        this.get(controller, (com.google.protobuf.Empty)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 4:
        this.testStream(controller, (com.csse.grpc.generate.Message)request,
          com.google.protobuf.RpcUtil.<com.csse.grpc.generate.Message>specializeCallback(
            done));
        return;
      case 5:
        this.testAny(controller, (com.google.protobuf.Empty)request,
          com.google.protobuf.RpcUtil.<com.csse.grpc.generate.Response>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.csse.grpc.generate.UserRequest.getDefaultInstance();
      case 1:
        return com.csse.grpc.generate.UserRequest.getDefaultInstance();
      case 2:
        return com.csse.grpc.generate.PageParam.getDefaultInstance();
      case 3:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 4:
        return com.csse.grpc.generate.Message.getDefaultInstance();
      case 5:
        return com.google.protobuf.Empty.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.csse.grpc.generate.Response.getDefaultInstance();
      case 1:
        return com.csse.grpc.generate.Response.getDefaultInstance();
      case 2:
        return com.csse.grpc.generate.AllUser.getDefaultInstance();
      case 3:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 4:
        return com.csse.grpc.generate.Message.getDefaultInstance();
      case 5:
        return com.csse.grpc.generate.Response.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.csse.grpc.generate.UserService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void getUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.csse.grpc.generate.Response.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.csse.grpc.generate.Response.class,
          com.csse.grpc.generate.Response.getDefaultInstance()));
    }

    public  void deleteUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.csse.grpc.generate.Response.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.csse.grpc.generate.Response.class,
          com.csse.grpc.generate.Response.getDefaultInstance()));
    }

    public  void getUserAll(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.PageParam request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.AllUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.csse.grpc.generate.AllUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.csse.grpc.generate.AllUser.class,
          com.csse.grpc.generate.AllUser.getDefaultInstance()));
    }

    public  void get(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }

    public  void testStream(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.Message request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Message> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.csse.grpc.generate.Message.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.csse.grpc.generate.Message.class,
          com.csse.grpc.generate.Message.getDefaultInstance()));
    }

    public  void testAny(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.csse.grpc.generate.Response> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        com.csse.grpc.generate.Response.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.csse.grpc.generate.Response.class,
          com.csse.grpc.generate.Response.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.csse.grpc.generate.Response getUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request)
        throws com.google.protobuf.ServiceException;

    public com.csse.grpc.generate.Response deleteUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request)
        throws com.google.protobuf.ServiceException;

    public com.csse.grpc.generate.AllUser getUserAll(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.PageParam request)
        throws com.google.protobuf.ServiceException;

    public com.google.protobuf.Empty get(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException;

    public com.csse.grpc.generate.Message testStream(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.Message request)
        throws com.google.protobuf.ServiceException;

    public com.csse.grpc.generate.Response testAny(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.csse.grpc.generate.Response getUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.csse.grpc.generate.Response) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.csse.grpc.generate.Response.getDefaultInstance());
    }


    public com.csse.grpc.generate.Response deleteUser(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.UserRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.csse.grpc.generate.Response) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.csse.grpc.generate.Response.getDefaultInstance());
    }


    public com.csse.grpc.generate.AllUser getUserAll(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.PageParam request)
        throws com.google.protobuf.ServiceException {
      return (com.csse.grpc.generate.AllUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.csse.grpc.generate.AllUser.getDefaultInstance());
    }


    public com.google.protobuf.Empty get(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public com.csse.grpc.generate.Message testStream(
        com.google.protobuf.RpcController controller,
        com.csse.grpc.generate.Message request)
        throws com.google.protobuf.ServiceException {
      return (com.csse.grpc.generate.Message) channel.callBlockingMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.csse.grpc.generate.Message.getDefaultInstance());
    }


    public com.csse.grpc.generate.Response testAny(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException {
      return (com.csse.grpc.generate.Response) channel.callBlockingMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        com.csse.grpc.generate.Response.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:UserService)
}

