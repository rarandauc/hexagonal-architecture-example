package co.edu.ucatolica.hexa.application.ports.output;

import co.edu.ucatolica.hexa.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductOutputPort {
    Product saveProduct(Product product);

    Optional<Product> getProductById(Long id);

    List<Product> getAll();
}
