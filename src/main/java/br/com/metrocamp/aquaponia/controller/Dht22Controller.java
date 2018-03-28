package br.com.metrocamp.aquaponia.controller;

import br.com.metrocamp.aquaponia.model.Dht22;
import br.com.metrocamp.aquaponia.response.GenericResponse;
import br.com.metrocamp.aquaponia.service.Dht22Service;
import br.com.metrocamp.enums.SensorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
