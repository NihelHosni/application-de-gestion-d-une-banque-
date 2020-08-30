package paiementmicro.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PaiementRepositoy extends MongoRepository<Paiement,String> {
}
