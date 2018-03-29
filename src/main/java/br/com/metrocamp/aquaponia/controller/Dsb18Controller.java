package br.com.metrocamp.aquaponia.controller;

import br.com.metrocamp.aquaponia.model.Dsb18;
import br.com.metrocamp.aquaponia.response.GenericResponse;
import br.com.metrocamp.aquaponia.service.Dsb18Service;
import br.com.metrocamp.aquaponia.enums.SensorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/dsb18")
public class Dsb18Controller {

    private Dsb18Service service;

    @Autowired
    public Dsb18Controller(Dsb18Service service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse<Dsb18> findAll() {
        return new GenericResponse<>(SensorEnum.DSB18.getDescricao(), service.findAll());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GenericResponse<Dsb18> create(@RequestBody Dsb18 dsb18) {
        return new GenericResponse<>(SensorEnum.DSB18.getDescricao(), Collections.singletonList(service.save(dsb18)));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public GenericResponse<Dsb18> update(@PathVariable String id, @RequestBody Dsb18 dsb18) {
        return new GenericResponse<>(SensorEnum.DSB18.getDescricao(), Collections.singletonList(service.update(id, dsb18)));
    }
}
