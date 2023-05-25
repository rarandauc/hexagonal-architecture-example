package co.edu.ucatolica.hexa.domain.service;

import co.edu.ucatolica.hexa.domain.model.Category;
import co.edu.ucatolica.hexa.domain.model.Product;
import co.edu.ucatolica.hexa.spring.SpringTestConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {SpringTestConfiguration.class})
@SpringBootTest
class ProductServiceTest {
    @Autowired
    private ProductService ps ;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void createProduct() {
        System.out.println("prueba del metodo crear ");
        Product p1 = new Product(10L, "papitas", 1,new Category(6, "Meat/Poultry", "Prepared meats"), "12 cans", 10, 50,1,0, false);
        Assertions.assertEquals(p1, ps.createProduct(p1));
    }

    /*
    @Test
    void getProductById() {
    }

    @Test
    void getAll() {
    }

    */
}