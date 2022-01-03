package org.jadevirek.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.jadevirek.grpc.User;
import org.jadevirek.grpc.UserRouteGrpc;

import java.util.logging.Logger;

public class GRPCClient {
    private static final Logger logger = Logger.getLogger(GRPCClient.class.getName());


    public GRPCClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    public GRPCClient(ManagedChannelBuilder<?> channelBuilder) {
        final ManagedChannel channel = channelBuilder.build();
        final UserRouteGrpc.UserRouteBlockingStub routeStub = UserRouteGrpc.newBlockingStub(channel);
        final User.LoginRequest request = User.LoginRequest.newBuilder()
                .setUserName("Hello")
                .setUserPassword("Hello")
                .build();



    }
}
