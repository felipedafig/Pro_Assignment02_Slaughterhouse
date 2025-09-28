package via.pro3.service;

import io.grpc.stub.StreamObserver;
import via.pro3.generated.*;
import via.pro3.repositories.AnimalRepository;
import via.pro3.repositories.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class SlaughterhouseImpl extends SlaughterhouseInfoGrpc.SlaughterhouseInfoImplBase {

    private final AnimalRepository animalRepository = new AnimalRepository();
    private final ProductRepository productRepository = new ProductRepository();

    @Override
    public void getAnimalsByProductId(ProductRequest request, StreamObserver<AnimalsResponse> responseObserver) {

        System.out.println("Received request >>> " + request.toString());

        List<Integer> animalRegNumbers;
        try {
            animalRegNumbers = animalRepository.getAnimalsByProductId(request.getProductId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        AnimalsResponse response = AnimalsResponse.newBuilder()
                .addAllAnimalRegNumbers(animalRegNumbers)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    @Override
    public void getProductsByAnimalId(AnimalRequest request, StreamObserver<ProductsResponse> responseObserver) {

    }
}
