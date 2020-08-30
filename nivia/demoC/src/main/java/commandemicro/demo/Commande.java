package commandemicro.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Commande implements Serializable {
    @Id
    private String id;

    private Integer productId;

    private Date dateCommande;

    private Integer quantite;

    private Boolean commandePayee;
}
