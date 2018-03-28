package br.com.metrocamp.aquaponia.repository;

import br.com.metrocamp.aquaponia.model.NivelAgua;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAguaRepository extends MongoRepository<NivelAgua, String> {
}
