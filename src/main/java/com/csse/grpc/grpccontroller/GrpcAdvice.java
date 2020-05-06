package com.csse.grpc.grpccontroller;


import io.grpc.*;
import io.grpc.ServerCall.Listener;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;


@GrpcGlobalServerInterceptor
public class GrpcAdvice implements ServerInterceptor {
    @Override
    public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call,
                                                      Metadata headers,
                                                      ServerCallHandler<ReqT, RespT> next) {
        Listener<ReqT> delegate = next.startCall(call, headers);
        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(delegate) {
            @Override
            public void onHalfClose() {
                try {
                    super.onHalfClose();
                } catch (StatusRuntimeException e) {
                    System.out.println("StatusRuntimeException---------------");
                    call.close(e.getStatus(), e.getTrailers());
                } catch (Exception e) {
                    System.out.println("Exception----------------");
                    call.close(Status.INTERNAL
                            .withCause(e.getCause())
                            .withDescription("error message"), new Metadata());
                }
            }
        };
    }
}
