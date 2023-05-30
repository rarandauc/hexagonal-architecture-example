package co.edu.ucatolica.hexa.infra.adapters.output.persistence;

import co.edu.ucatolica.hexa.application.ports.output.CategoryOutputPort;
import co.edu.ucatolica.hexa.domain.model.Category;
import co.edu.ucatolica.hexa.domain.model.Product;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.CategoryEntity;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.ProductEntity;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.CategoryPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.ProductPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
public class CategoryPersistenceAdapter implements CategoryOutputPort {

    private final CategoryRepository categoryRepository;

    private final CategoryPersistenceMapper categoryPersistenceMapper;
    @Override
    public Category createCategory(Category category) {
        CategoryEntity ce = categoryPersistenceMapper.toEntity(category);
        ce=categoryRepository.save(ce);
        return categoryPersistenceMapper.toDto(ce);
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        Optional<CategoryEntity> categoryEntity=categoryRepository.findById(id);
        if(categoryEntity.isEmpty()) {
            return Optional.empty();
        }
        Category c = categoryPersistenceMapper.toDto(categoryEntity.get());
        return Optional.of(c);


    }

    @Override
    public List<Category> getAll() {
        return  categoryPersistenceMapper.EntitiesToCategories(categoryRepository.findAll());
    }
}
