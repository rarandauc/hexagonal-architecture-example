package co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper;

import co.edu.ucatolica.hexa.domain.model.Category;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryPersistenceMapper {
    CategoryEntity toEntity(Category category);
    Category toDto(CategoryEntity categoryEntity);
}
