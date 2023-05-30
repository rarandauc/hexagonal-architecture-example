package co.edu.ucatolica.hexa.infra.adapters.config;

import co.edu.ucatolica.hexa.domain.model.Product;
import co.edu.ucatolica.hexa.domain.service.CategoryService;
import co.edu.ucatolica.hexa.domain.service.ProductService;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.CategoryPersistenceAdapter;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.ProductPersistenceAdapter;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.ProductEntity;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.CategoryPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.ProductPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.CategoryRepository;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.ProductRepository;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ProductPersistenceAdapter productPersistenceAdapter(ProductRepository productRepository, ProductPersistenceMapper productPersistenceMapper){
        return new ProductPersistenceAdapter(productRepository,productPersistenceMapper);
    }
@Bean
    public CategoryPersistenceAdapter categoryPersistenceAdapter(CategoryRepository categoryRepository, CategoryPersistenceMapper categoryPersistenceMapper){
        return new CategoryPersistenceAdapter(categoryRepository, categoryPersistenceMapper);
    }

@Bean
    public ProductService productService(ProductPersistenceAdapter productPersistenceAdapter){
        return new ProductService(productPersistenceAdapter);
}
    @Bean
    public CategoryService categoryService(CategoryPersistenceAdapter categoryPersistenceAdapter){
        return new CategoryService(categoryPersistenceAdapter);
    }


}
