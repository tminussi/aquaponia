package br.com.metrocamp.aquaponia.controller;

import br.com.metrocamp.aquaponia.model.Dht22;
import br.com.metrocamp.aquaponia.response.GenericResponse;
import br.com.metrocamp.aquaponia.service.Dht22Service;
import br.com.metrocamp.aquaponia.enums.SensorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/dht22")
public class Dht22Controller {

    private Dht22Service service;

    @Autowired
    public Dht22Controller(Dht22Service service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse<Dht22> findAll() {
        return new GenericResponse<>(SensorEnum.DHT22.getDescricao(), service.findAll());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GenericResponse<Dht22> create(@RequestBody Dht22 dht22) {
        return new GenericResponse<>(SensorEnum.DHT22.getDescricao(), Collections.singletonList(service.save(dht22)));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public GenericResponse<Dht22> create(@PathVariable String id, @RequestBody Dht22 dht22) {
        return new GenericResponse<>(SensorEnum.DHT22.getDescricao(), Collections.singletonList(service.update(id, dht22)));
    }
}
