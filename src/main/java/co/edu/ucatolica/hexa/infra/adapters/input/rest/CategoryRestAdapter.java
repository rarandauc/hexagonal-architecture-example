package co.edu.ucatolica.hexa.infra.adapters.input.rest;

import co.edu.ucatolica.hexa.application.ports.input.*;
import co.edu.ucatolica.hexa.domain.model.Category;
import co.edu.ucatolica.hexa.domain.model.Product;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Category", description="Esta API gestiona las operaciones sobre las categorias")
@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryRestAdapter {
    private final CreateCategoryUseCase createCategoryUseCase;

    private final GetCategoryUseCase getCategoryUseCase;
    private final GetAllCategoryUseCase getAllCategoryUseCase;

    //private final ProductRestMapper productRestMapper;

    @PostMapping(value = "/save")
    public ResponseEntity<Category> createCategory(@RequestBody @Valid Category categoryRequest){
        // Request to domain
        Category category;
        category = createCategoryUseCase. createCategory(categoryRequest);
        // Domain to response
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> getProduct(@PathVariable Long id){
        Category category = getCategoryUseCase.getCategoryById(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public List<Category> getAll() {
        return getAllCategoryUseCase.getAll();
    }


}
