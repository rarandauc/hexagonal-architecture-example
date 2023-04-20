package co.edu.ucatolica.hexa.domain.service;

import co.edu.ucatolica.hexa.application.ports.input.CreateProductUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllProductsUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetProductUseCase;
import co.edu.ucatolica.hexa.application.ports.output.ProductOutputPort;
import co.edu.ucatolica.hexa.domain.exceptions.ProductNotFoundException;
import co.edu.ucatolica.hexa.domain.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService implements CreateProductUseCase, GetProductUseCase, GetAllProductsUseCase
{

    private final ProductOutputPort productOutputPort;


    @Override
    public Product createProduct(Product product) {
        product = productOutputPort.saveProduct(product);
        return product;
    }

    @Override
    public Product getProductById(Long id) {
        return productOutputPort.getProductById(id).orElseThrow(() -> new ProductNotFoundException("Producto no encontrado para el id " + id));
    }

    @Override
    public List<Product> getAll() {
        return productOutputPort.getAll();
    }
}
