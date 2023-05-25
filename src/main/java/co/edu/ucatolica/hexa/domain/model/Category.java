package co.edu.ucatolica.hexa.domain.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Category {
    @NonNull
    private Integer categoryID;
    @NonNull
    private String categoryName;
    @NonNull
    private String description;

    private byte[] picture;
}
