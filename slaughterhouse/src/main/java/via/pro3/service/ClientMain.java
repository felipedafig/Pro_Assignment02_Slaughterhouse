package via.pro3.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.pro3.generated.AnimalsResponse;
import via.pro3.generated.ProductRequest;
import via.pro3.generated.SlaughterhouseInfoGrpc;

public class ClientMain {
    private static final String HOST = "localhost";
    private static final int PORT = 50051;

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(HOST, PORT)
                .usePlaintext()
                .build();

        SlaughterhouseInfoGrpc.SlaughterhouseInfoBlockingStub stub =
                SlaughterhouseInfoGrpc.newBlockingStub(channel);


        int testProductId = 1;

        ProductRequest request = ProductRequest.newBuilder()
                .setProductId(testProductId)
                .build();

        System.out.println("check0");

            AnimalsResponse response = stub.getAnimalsByProductId(request);

            System.out.println("check");

            if (response.getAnimalRegNumbersCount() > 0) {
                System.out.println("Animals in Product ID " + testProductId + ":");

                System.out.println("check2");

                for (Integer animalId : response.getAnimalRegNumbersList()) {
                    System.out.println("- Animal ID: " + animalId);
                }
            } else {
                System.out.println("No animals found in Product ID " + testProductId);
            }

            channel.shutdown();
    }
}