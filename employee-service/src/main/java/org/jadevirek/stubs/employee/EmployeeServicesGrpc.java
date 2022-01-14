package org.jadevirek.stubs.employee;

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
    comments = "Source: employee.proto")
public final class EmployeeServicesGrpc {

  private EmployeeServicesGrpc() {}

  public static final String SERVICE_NAME = "org.jadevirek.EmployeeServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.jadevirek.stubs.employee.Employee.EmployeeRequest,
      org.jadevirek.stubs.employee.Employee.EmployeeResponse> getGetEmployeeDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployeeDetails",
      requestType = org.jadevirek.stubs.employee.Employee.EmployeeRequest.class,
      responseType = org.jadevirek.stubs.employee.Employee.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jadevirek.stubs.employee.Employee.EmployeeRequest,
      org.jadevirek.stubs.employee.Employee.EmployeeResponse> getGetEmployeeDetailsMethod() {
    io.grpc.MethodDescriptor<org.jadevirek.stubs.employee.Employee.EmployeeRequest, org.jadevirek.stubs.employee.Employee.EmployeeResponse> getGetEmployeeDetailsMethod;
    if ((getGetEmployeeDetailsMethod = EmployeeServicesGrpc.getGetEmployeeDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetEmployeeDetailsMethod = EmployeeServicesGrpc.getGetEmployeeDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetEmployeeDetailsMethod = getGetEmployeeDetailsMethod = 
              io.grpc.MethodDescriptor.<org.jadevirek.stubs.employee.Employee.EmployeeRequest, org.jadevirek.stubs.employee.Employee.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.jadevirek.EmployeeServices", "GetEmployeeDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jadevirek.stubs.employee.Employee.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jadevirek.stubs.employee.Employee.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetEmployeeDetails"))
                  .build();
          }
        }
     }
     return getGetEmployeeDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServicesStub newStub(io.grpc.Channel channel) {
    return new EmployeeServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployeeDetails(org.jadevirek.stubs.employee.Employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<org.jadevirek.stubs.employee.Employee.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmployeeDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.jadevirek.stubs.employee.Employee.EmployeeRequest,
                org.jadevirek.stubs.employee.Employee.EmployeeResponse>(
                  this, METHODID_GET_EMPLOYEE_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServicesStub extends io.grpc.stub.AbstractStub<EmployeeServicesStub> {
    private EmployeeServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServicesStub(channel, callOptions);
    }

    /**
     */
    public void getEmployeeDetails(org.jadevirek.stubs.employee.Employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<org.jadevirek.stubs.employee.Employee.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmployeeDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServicesBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServicesBlockingStub> {
    private EmployeeServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.jadevirek.stubs.employee.Employee.EmployeeResponse getEmployeeDetails(org.jadevirek.stubs.employee.Employee.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEmployeeDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServicesFutureStub extends io.grpc.stub.AbstractStub<EmployeeServicesFutureStub> {
    private EmployeeServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jadevirek.stubs.employee.Employee.EmployeeResponse> getEmployeeDetails(
        org.jadevirek.stubs.employee.Employee.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmployeeDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_DETAILS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_DETAILS:
          serviceImpl.getEmployeeDetails((org.jadevirek.stubs.employee.Employee.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<org.jadevirek.stubs.employee.Employee.EmployeeResponse>) responseObserver);
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

  private static abstract class EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.jadevirek.stubs.employee.Employee.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeServices");
    }
  }

  private static final class EmployeeServicesFileDescriptorSupplier
      extends EmployeeServicesBaseDescriptorSupplier {
    EmployeeServicesFileDescriptorSupplier() {}
  }

  private static final class EmployeeServicesMethodDescriptorSupplier
      extends EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServicesFileDescriptorSupplier())
              .addMethod(getGetEmployeeDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
