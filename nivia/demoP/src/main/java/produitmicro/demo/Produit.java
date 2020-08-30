package produitmicro.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
@AllArgsConstructor
@RequiredArgsConstructor
public class Produit implements Serializable {
    @Id
    private String id;
    private String titre;
    private String description;
    private String image;
    private Double prix;

}
