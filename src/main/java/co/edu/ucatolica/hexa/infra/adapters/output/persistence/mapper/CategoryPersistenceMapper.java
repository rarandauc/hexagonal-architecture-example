package co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper;

import co.edu.ucatolica.hexa.domain.model.Category;
import co.edu.ucatolica.hexa.domain.model.Product;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.CategoryEntity;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryPersistenceMapper {
    CategoryEntity toEntity(Category category);
    Category toDto(CategoryEntity categoryEntity);

    List<Category> EntitiesToCategories(List<CategoryEntity> categoryEntities);
}
