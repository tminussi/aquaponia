package br.com.metrocamp.aquaponia.service;

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
}
