package via.pro3.model;

public class Product {

    private int productId;
    private String type;
    private String[] contents;

    public  Product(int productId, String type, String[] contents) {

        this.productId = productId;
        this.type = type;
        this.contents = contents;
    }
}
