package org.jadevirek.grpc;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class UserRouteGrpc {

  private UserRouteGrpc() {}

  public static final String SERVICE_NAME = "UserRoute";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.jadevirek.grpc.User.LoginRequest,
      org.jadevirek.grpc.User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = org.jadevirek.grpc.User.LoginRequest.class,
      responseType = org.jadevirek.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jadevirek.grpc.User.LoginRequest,
      org.jadevirek.grpc.User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<org.jadevirek.grpc.User.LoginRequest, org.jadevirek.grpc.User.APIResponse> getLoginMethod;
    if ((getLoginMethod = UserRouteGrpc.getLoginMethod) == null) {
      synchronized (UserRouteGrpc.class) {
        if ((getLoginMethod = UserRouteGrpc.getLoginMethod) == null) {
          UserRouteGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<org.jadevirek.grpc.User.LoginRequest, org.jadevirek.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserRoute", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jadevirek.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jadevirek.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserRouteMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jadevirek.grpc.User.Empty,
      org.jadevirek.grpc.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = org.jadevirek.grpc.User.Empty.class,
      responseType = org.jadevirek.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jadevirek.grpc.User.Empty,
      org.jadevirek.grpc.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<org.jadevirek.grpc.User.Empty, org.jadevirek.grpc.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = UserRouteGrpc.getLogoutMethod) == null) {
      synchronized (UserRouteGrpc.class) {
        if ((getLogoutMethod = UserRouteGrpc.getLogoutMethod) == null) {
          UserRouteGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<org.jadevirek.grpc.User.Empty, org.jadevirek.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserRoute", "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jadevirek.grpc.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jadevirek.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserRouteMethodDescriptorSupplier("Logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserRouteStub newStub(io.grpc.Channel channel) {
    return new UserRouteStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserRouteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserRouteBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserRouteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserRouteFutureStub(channel);
  }

  /**
   */
  public static abstract class UserRouteImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(org.jadevirek.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.jadevirek.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(org.jadevirek.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<org.jadevirek.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.jadevirek.grpc.User.LoginRequest,
                org.jadevirek.grpc.User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.jadevirek.grpc.User.Empty,
                org.jadevirek.grpc.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class UserRouteStub extends io.grpc.stub.AbstractStub<UserRouteStub> {
    private UserRouteStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRouteStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRouteStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRouteStub(channel, callOptions);
    }

    /**
     */
    public void login(org.jadevirek.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.jadevirek.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(org.jadevirek.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<org.jadevirek.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserRouteBlockingStub extends io.grpc.stub.AbstractStub<UserRouteBlockingStub> {
    private UserRouteBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRouteBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRouteBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRouteBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.jadevirek.grpc.User.APIResponse login(org.jadevirek.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jadevirek.grpc.User.APIResponse logout(org.jadevirek.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserRouteFutureStub extends io.grpc.stub.AbstractStub<UserRouteFutureStub> {
    private UserRouteFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRouteFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRouteFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRouteFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jadevirek.grpc.User.APIResponse> login(
        org.jadevirek.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jadevirek.grpc.User.APIResponse> logout(
        org.jadevirek.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserRouteImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserRouteImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((org.jadevirek.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.jadevirek.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((org.jadevirek.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<org.jadevirek.grpc.User.APIResponse>) responseObserver);
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

  private static abstract class UserRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserRouteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.jadevirek.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserRoute");
    }
  }

  private static final class UserRouteFileDescriptorSupplier
      extends UserRouteBaseDescriptorSupplier {
    UserRouteFileDescriptorSupplier() {}
  }

  private static final class UserRouteMethodDescriptorSupplier
      extends UserRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserRouteMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserRouteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserRouteFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
