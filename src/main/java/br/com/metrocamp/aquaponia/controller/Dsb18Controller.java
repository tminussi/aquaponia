package br.com.metrocamp.aquaponia.controller;

import br.com.metrocamp.aquaponia.model.Dsb18;
import br.com.metrocamp.aquaponia.response.GenericResponse;
import br.com.metrocamp.aquaponia.service.Dsb18Service;
import br.com.metrocamp.enums.SensorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
