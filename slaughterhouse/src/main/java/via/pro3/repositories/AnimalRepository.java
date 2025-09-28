package via.pro3.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    public List<Integer> getAnimalsByProductId(int productId) throws SQLException {

        DBConnection db = new DBConnection();

        // try-with-resources to ensure connection.close() is called
        try (Connection connection = db.openConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT fk_animal_id FROM product_animal_link WHERE fk_product_id = ?")) {

            statement.setInt(1, productId);

            try (ResultSet rs = statement.executeQuery()) {
                List<Integer> animals = new ArrayList<>();
                while (rs.next()) {
                    animals.add(rs.getInt("fk_animal_id"));
                }
                return animals;
            }
        }
    }

}
