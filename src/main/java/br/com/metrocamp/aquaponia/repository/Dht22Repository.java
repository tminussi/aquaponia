package br.com.metrocamp.aquaponia.repository;

import br.com.metrocamp.aquaponia.model.Dht22;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dht22Repository extends MongoRepository<Dht22, String> {
}
