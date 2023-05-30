package co.edu.ucatolica.hexa.domain.service;

import co.edu.ucatolica.hexa.application.ports.input.CreateCategoryUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllCategoryUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetCategoryUseCase;
import co.edu.ucatolica.hexa.application.ports.output.CategoryOutputPort;
import co.edu.ucatolica.hexa.application.ports.output.ProductOutputPort;
import co.edu.ucatolica.hexa.domain.exceptions.CategoryException;
import co.edu.ucatolica.hexa.domain.exceptions.ProductNotFoundException;
import co.edu.ucatolica.hexa.domain.model.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryService implements CreateCategoryUseCase, GetAllCategoryUseCase, GetCategoryUseCase {

    private CategoryOutputPort categoryOutputPort;
    @Override
    public Category createCategory(Category category) {
        Category cat;
        cat = categoryOutputPort.createCategory(category);
        return cat;

    }

    @Override
    public List<Category> getAll() {
        return categoryOutputPort.getAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryOutputPort.getCategoryById(id).orElseThrow(() -> new CategoryException("Producto no encontrado para el id " + id));


    }
}
