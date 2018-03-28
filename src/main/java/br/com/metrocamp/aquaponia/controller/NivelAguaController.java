package br.com.metrocamp.aquaponia.controller;

import br.com.metrocamp.aquaponia.model.NivelAgua;
import br.com.metrocamp.aquaponia.response.GenericResponse;
import br.com.metrocamp.aquaponia.service.NivelAguaSevice;
import br.com.metrocamp.enums.SensorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
