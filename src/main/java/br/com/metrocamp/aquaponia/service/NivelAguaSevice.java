package br.com.metrocamp.aquaponia.service;

import br.com.metrocamp.aquaponia.model.NivelAgua;
import br.com.metrocamp.aquaponia.repository.NivelAguaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelAguaSevice {

    private NivelAguaRepository repository;

    public NivelAguaSevice(NivelAguaRepository repository) {
        this.repository = repository;
    }

    public List<NivelAgua> findAll() {
        return this.repository.findAll();
    }
}
