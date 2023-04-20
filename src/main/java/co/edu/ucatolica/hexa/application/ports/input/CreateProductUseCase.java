package co.edu.ucatolica.hexa.application.ports.input;

import co.edu.ucatolica.hexa.domain.model.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
