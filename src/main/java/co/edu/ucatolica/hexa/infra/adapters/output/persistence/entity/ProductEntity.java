package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

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
    private int supplierID;
    private int categoryID;
    private String quantityPerUnit;
    private float unitPrice;
    private int unitsInStock;
    float unitsOnOrder;
    private int reorderLevel=0;
    private boolean discontinued;

}
