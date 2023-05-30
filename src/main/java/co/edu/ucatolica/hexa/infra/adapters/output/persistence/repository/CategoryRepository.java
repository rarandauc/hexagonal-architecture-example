package co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository;

import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {


}
