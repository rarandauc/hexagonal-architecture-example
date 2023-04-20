package co.edu.ucatolica.hexa.infra.adapters.output.persistence;

import co.edu.ucatolica.hexa.application.ports.output.ProductOutputPort;
import co.edu.ucatolica.hexa.domain.model.Product;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.ProductEntity;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.ProductPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ProductPersistenceAdapter implements ProductOutputPort {


    private final ProductRepository productRepository;

    private final ProductPersistenceMapper productPersistenceMapper;

    @Override
    public Product saveProduct(Product product) {
        ProductEntity pe = productPersistenceMapper.toProductEntity(product);
        pe=productRepository.save(pe);
        return productPersistenceMapper.toProduct(pe);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        Optional<ProductEntity> productEntity=productRepository.findById(id);
        if(productEntity.isEmpty()) {
            return Optional.empty();
        }
        Product p = productPersistenceMapper.toProduct(productEntity.get());
        return Optional.of(p);
    }

    @Override
    public List<Product> getAll() {
       return  productPersistenceMapper.EntitiesToProducts(productRepository.findAll());

    }
}
