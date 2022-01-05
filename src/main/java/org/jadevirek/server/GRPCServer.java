package org.jadevirek.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.jadevirek.client.GRPCClient;
import org.jadevirek.service.UserService;

import java.io.IOException;

public class GRPCServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = buildServerService().start();

        System.out.println("Server started at port: " + server.getPort());
        Thread.sleep(3000);

        System.out.println("Calling client..");
        Thread.sleep(3000);
        new GRPCClient("localhost",server.getPort()).start();
        server.awaitTermination();
    }

    static private Server buildServerService() {
        return ServerBuilder.forPort(9091)
                .addService(new UserService())
                .build();
    }
}
