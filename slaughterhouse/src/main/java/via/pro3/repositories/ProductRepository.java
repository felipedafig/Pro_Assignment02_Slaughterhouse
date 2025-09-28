package via.pro3.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<Integer> getProductsByAnimalId(int animalId) throws SQLException {

        DBConnection db = new DBConnection();

        try (Connection connection = db.openConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT fk_product_id FROM product_animal_link WHERE fk_animal_id = ?")) {

            statement.setInt(1, animalId);

            try (ResultSet rs = statement.executeQuery()) {

                List<Integer> products = new ArrayList<>();

                while (rs.next()) {
                    products.add(rs.getInt("fk_product_id"));
                }
                return products;
            }
        }
    }

}
