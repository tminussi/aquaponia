package br.com.metrocamp.aquaponia.service;

import br.com.metrocamp.aquaponia.exception.SensorNotFoundException;
import br.com.metrocamp.aquaponia.model.Dht22;
import br.com.metrocamp.aquaponia.repository.Dht22Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dht22Service {

    private Dht22Repository repository;

    @Autowired
    public Dht22Service(Dht22Repository repository) {
        this.repository = repository;
    }

    public List<Dht22> findAll() {
        return this.repository.findAll();
    }

    public Dht22 save(Dht22 dht22) {
        return this.repository.save(dht22);
    }

    public Dht22 update(String id, Dht22 dht22) {
        repository.findById(id).orElseThrow(SensorNotFoundException::new);
        dht22.setId(id);
        return this.repository.save(dht22);
    }
}
