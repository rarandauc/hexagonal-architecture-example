package co.edu.ucatolica.hexa.application.ports.input;

import co.edu.ucatolica.hexa.domain.model.Category;
import co.edu.ucatolica.hexa.domain.model.Product;

public interface CreateCategoryUseCase {
    Category createCategory(Category category);
}
