package br.com.metrocamp.aquaponia.controller;

import br.com.metrocamp.aquaponia.model.NivelAgua;
import br.com.metrocamp.aquaponia.response.GenericResponse;
import br.com.metrocamp.aquaponia.service.NivelAguaSevice;
import br.com.metrocamp.aquaponia.enums.SensorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/nivel-agua")
public class NivelAguaController {

    private NivelAguaSevice service;

    @Autowired
    public NivelAguaController(NivelAguaSevice service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse<NivelAgua> findAll() {
        return new GenericResponse<>(SensorEnum.NIVEL_AGUA.getDescricao(), service.findAll());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GenericResponse<NivelAgua> create(@RequestBody NivelAgua nivelAgua) {
        return new GenericResponse<>(SensorEnum.NIVEL_AGUA.getDescricao(), Collections.singletonList(service.save(nivelAgua)));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public GenericResponse<NivelAgua> update(@PathVariable String id, @RequestBody NivelAgua nivelAgua) {
        return new GenericResponse<>(SensorEnum.NIVEL_AGUA.getDescricao(), Collections.singletonList(service.update(id, nivelAgua)));
    }
}
