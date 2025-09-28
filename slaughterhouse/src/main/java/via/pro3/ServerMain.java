package via.pro3;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import via.pro3.service.SlaughterhouseImpl;

import java.io.IOException;

public class ServerMain {

    private static final int PORT = 50051;

    public static void main(String[] args) throws IOException, InterruptedException {

        // 1. Build the gRPC Server and attach the service implementation
        Server server = ServerBuilder
                .forPort(PORT)
                .addService(new SlaughterhouseImpl()) // Your service implementation
                .build();

        // 2. Start the Server
        server.start();
        System.out.println("gRPC Server started, listening on port " + PORT);

        server.awaitTermination();
    }
}