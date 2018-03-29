package br.com.metrocamp.aquaponia.service;

import br.com.metrocamp.aquaponia.exception.SensorNotFoundException;
import br.com.metrocamp.aquaponia.model.NivelAgua;
import br.com.metrocamp.aquaponia.repository.NivelAguaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAguaSevice {

    private NivelAguaRepository repository;

    public NivelAguaSevice(NivelAguaRepository repository) {
        this.repository = repository;
    }

    public List<NivelAgua> findAll() {
        return this.repository.findAll();
    }

    public NivelAgua save(NivelAgua nivelAgua) {
        return this.repository.save(nivelAgua);
    }

    public NivelAgua update(String id, NivelAgua nivelAgua) {
        repository.findById(id).orElseThrow(SensorNotFoundException::new);
        nivelAgua.setId(id);
        return this.repository.save(nivelAgua);
    }
}
