package br.com.metrocamp.aquaponia.service;

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
}
