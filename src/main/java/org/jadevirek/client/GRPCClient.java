package org.jadevirek.client;



import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.jadevirek.grpc.User;
import org.jadevirek.grpc.UserRouteGrpc;

import java.util.logging.Logger;

public class GRPCClient extends Thread  {
    private static final Logger logger = Logger.getLogger(GRPCClient.class.getName());
    private String host;
    private int port;


//    public GRPCClient(String host, int port) {
//        this(ManagedChannelBuilder.forAddress(host, port)
//                .usePlaintext());
//    }

    public GRPCClient(String host, int port) {
        super();
        this.host = host;
        this.port = port;
    }
//
//    public  GRPCClient(ManagedChannelBuilder<?> channelBuilder) {
//        final ManagedChannel channel = channelBuilder.build();
//        final UserRouteGrpc.UserRouteFutureStub routeStub = UserRouteGrpc.newFutureStub(channel);
//        final User.LoginRequest request = User.LoginRequest.newBuilder()
//                .setUserName("Hello")
//                .setUserPassword("Hello")
//                .build();
//        System.out.println("Response via client: " + routeStub.login(request)
//        );
//    }
    @Override
    public void run() {
         ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        final UserRouteGrpc.UserRouteBlockingStub routeStub = UserRouteGrpc.newBlockingStub(channel);
        final User.LoginRequest request = User.LoginRequest.newBuilder()
                .setUserName("Hello")
                .setUserPassword("Hello")
                .build();
        System.out.println("Response via client: " + routeStub.login(request)
        );
        channel.shutdown();
    }
}
