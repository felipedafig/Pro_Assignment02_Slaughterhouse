package via.pro3.service;

import io.grpc.stub.StreamObserver;
import via.pro3.generated.*;
import via.pro3.repositories.AnimalRepository;
import via.pro3.repositories.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class SlaughterhouseImpl extends SlaughterhouseGrpc.SlaughterhouseImplBase {

    private final AnimalRepository animalRepository = new AnimalRepository();
    private final ProductRepository productRepository = new ProductRepository();

    @Override
    public void getAnimalsByProductId(ProductRequest request, StreamObserver<AnimalsResponse> responseObserver) {

        System.out.println("Received request: " + request.toString());

        List<Integer> animalIds;
        try
        {
            animalIds = animalRepository.getAnimalsByProductId(request.getProductId());
        }
        catch (SQLException e) {throw new RuntimeException(e);}

        AnimalsResponse response = AnimalsResponse.newBuilder()
                .addAllAnimalIds(animalIds)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    @Override
    public void getProductsByAnimalId(AnimalRequest request, StreamObserver<ProductsResponse> responseObserver) {

        System.out.println("Received request: " + request.toString());

        List<Integer> productIds;
        try
        {
            productIds = productRepository.getProductsByAnimalId(request.getAnimalId());
        }
        catch (SQLException e) {throw new RuntimeException(e);}

        ProductsResponse response = ProductsResponse.newBuilder()
                .addAllProductIds(productIds)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }
}
