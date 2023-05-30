package co.edu.ucatolica.hexa.application.ports.output;

import co.edu.ucatolica.hexa.domain.model.Category;
import co.edu.ucatolica.hexa.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryOutputPort {
    Category createCategory(Category category);

    Optional<Category> getCategoryById(Long id);

    List<Category> getAll();
}


