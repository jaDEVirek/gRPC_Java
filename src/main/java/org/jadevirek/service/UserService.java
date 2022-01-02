package org.jadevirek.service;

import io.grpc.stub.StreamObserver;
import org.jadevirek.grpc.User;
import org.jadevirek.grpc.UserRouteGrpc;

public class UserService extends UserRouteGrpc.UserRouteImplBase {

    @Override public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {

        final User.APIResponse.Builder apiRespBuilder = User.APIResponse.newBuilder();

        if (request.getUserName()
                .equals(request.getUserPassword())) {
            apiRespBuilder.setResponseMessage("Login Success")
                    .setResponseStatusCode("200");
        } else {
            apiRespBuilder.setResponseMessage("Login Failed")
                    .setResponseStatusCode("401");
        }
        responseObserver.onNext(apiRespBuilder.build());
        responseObserver.onCompleted();
    }

    @Override public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {

    }
}
