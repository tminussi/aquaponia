package br.com.metrocamp.aquaponia.service;

import br.com.metrocamp.aquaponia.exception.SensorNotFoundException;
import br.com.metrocamp.aquaponia.model.Dsb18;
import br.com.metrocamp.aquaponia.repository.Dsb18Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dsb18Service {

    private Dsb18Repository repository;

    @Autowired
    public Dsb18Service(Dsb18Repository repository) {
        this.repository = repository;
    }

    public List<Dsb18> findAll() {
        return this.repository.findAll();
    }

    public Dsb18 save(Dsb18 dsb18) {
        return this.repository.save(dsb18);
    }

    public Dsb18 update(String id, Dsb18 dsb18) {
        repository.findById(id).orElseThrow(SensorNotFoundException::new);
        dsb18.setId(id);
        return this.repository.save(dsb18);
    }
}
