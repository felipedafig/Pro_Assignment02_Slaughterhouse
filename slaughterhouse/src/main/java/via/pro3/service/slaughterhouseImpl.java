package via.pro3.service;

import io.grpc.stub.StreamObserver;
import via.pro3.generated.*;

public class slaughterhouseImpl extends SlaughterhouseInfoGrpc.SlaughterhouseInfoImplBase {

    @Override
    public void getAnimalsByProductId(ProductRequest request, StreamObserver<AnimalsResponse> responseObserver) {
        super.getAnimalsByProductId(request, responseObserver);
    }

    @Override
    public void getProductsByAnimalId(AnimalRequest request, StreamObserver<ProductsResponse> responseObserver) {
        super.getProductsByAnimalId(request, responseObserver);
    }
}
