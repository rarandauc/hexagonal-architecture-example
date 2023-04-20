package co.edu.ucatolica.hexa.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
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
