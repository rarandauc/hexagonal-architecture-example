package co.edu.ucatolica.hexa.spring;

import co.edu.ucatolica.hexa.domain.service.ProductService;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.ProductPersistenceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringTestConfiguration {
    @Bean
    public ProductService productService(ProductPersistenceAdapter productPersistenceAdapter){
        return new ProductService(productPersistenceAdapter);
    }


}
