package co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper;

import co.edu.ucatolica.hexa.domain.model.Product;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.ProductEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = CategoryPersistenceMapper.class)
public interface ProductPersistenceMapper
{
    ProductPersistenceMapper INSTANCE = Mappers.getMapper(ProductPersistenceMapper.class);


    // si los campos no tienen lo mismos nombres se debe realizar explicitamente
    //@Mapping(source = "product.nombre", target = "nombreProducto")
    ProductEntity toProductEntity(Product product);

    Product toProduct(ProductEntity productEntity);

    List<Product> EntitiesToProducts(List<ProductEntity> productEntities);


}
