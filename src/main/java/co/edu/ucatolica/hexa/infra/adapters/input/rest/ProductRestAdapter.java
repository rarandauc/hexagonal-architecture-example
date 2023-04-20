package co.edu.ucatolica.hexa.infra.adapters.input.rest;

import co.edu.ucatolica.hexa.application.ports.input.CreateProductUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllProductsUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetProductUseCase;
import co.edu.ucatolica.hexa.domain.model.Product;
//import jakarta.validation.Valid;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductRestAdapter {

    private final CreateProductUseCase createProductUseCase;

    private final GetProductUseCase getProductUseCase;
    private final GetAllProductsUseCase getAllProductsUseCase;

    //private final ProductRestMapper productRestMapper;

    @PostMapping(value = "/save")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid Product productRequest){
        // Request to domain
        Product product;
        product = createProductUseCase. createProduct(productRequest);
        // Domain to response
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id){
        Product product = getProductUseCase.getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public List<Product> getAll() {
        return getAllProductsUseCase.getAll();
    }

}
