package paiementmicro.demo;

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
public class Paiement implements Serializable {
    @Id
    private String id;
    private Integer idCommande;

    private Double montant;

    private Long numeroCarte;
}
