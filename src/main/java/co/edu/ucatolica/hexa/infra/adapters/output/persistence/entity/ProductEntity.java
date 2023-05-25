package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductId")
    private Long id;
    private String productName;
    @JoinColumn(name = "supplierID", referencedColumnName = "supplierID")
    @ManyToOne(optional = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private SupplierEntity supplierEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryID")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private CategoryEntity categoryID;
    private String quantityPerUnit;
    private float unitPrice;
    private int unitsInStock;
    float unitsOnOrder;
    private int reorderLevel=0;
    private boolean discontinued;

}
