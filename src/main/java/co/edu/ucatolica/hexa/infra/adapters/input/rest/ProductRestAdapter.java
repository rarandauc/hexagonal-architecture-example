package co.edu.ucatolica.hexa.infra.adapters.input.rest;

import co.edu.ucatolica.hexa.application.ports.input.CreateProductUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllProductsUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetProductUseCase;
import co.edu.ucatolica.hexa.domain.model.Product;
//import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="product", description="Esta API gestiona las operaciones sobre la entidad Productos")
@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductRestAdapter {

    private final CreateProductUseCase createProductUseCase;

    private final GetProductUseCase getProductUseCase;
    private final GetAllProductsUseCase getAllProductsUseCase;

    //private final ProductRestMapper productRestMapper;


    //Se adicionan estas etiquetas para complementar la doc de swagger
    @Operation(
            summary="Se adiciona un nuevo registro",
            description=" Esta etiqueda es para swagger con el ánimo de documentar una funcionalidad",
            tags={"swagger", "example doc", "save product"})

    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema=@Schema(implementation = Product.class), mediaType = "application/json")})
    })
    @Parameters({
            @Parameter(name="Id", description="identificador del productto"),
            @Parameter(name="CategoryId", description="Categoria a la que pertenece"),
            @Parameter(name="discontinued", description="Valor 0 si no se esta trbajando, 1 si esta activo")
    })

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
