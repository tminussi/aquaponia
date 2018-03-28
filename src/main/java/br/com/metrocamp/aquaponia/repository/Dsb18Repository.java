package br.com.metrocamp.aquaponia.repository;

import br.com.metrocamp.aquaponia.model.Dsb18;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dsb18Repository extends MongoRepository<Dsb18, String>{
}
