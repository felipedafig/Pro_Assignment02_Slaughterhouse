package via.pro3.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<String> getProductsByAnimalId(int animalId) throws SQLException {

        DBConnection db = new DBConnection();

        // try-with-resources to ensure connection.close() is called
        try (Connection connection = db.openConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT fk_product_id FROM animal_product_link WHERE fk_animal_id = ?")) {

            statement.setInt(1, animalId);

            try (ResultSet rs = statement.executeQuery()) {
                List<String> products = new ArrayList<>();
                while (rs.next()) {
                    products.add(rs.getString("product_id"));
                }
                return products;
            }
        }
    }

}
