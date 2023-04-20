package co.edu.ucatolica.hexa.application.ports.input;

import co.edu.ucatolica.hexa.domain.model.Product;

import java.util.List;

public interface GetAllProductsUseCase {

    List<Product> getAll();
}
