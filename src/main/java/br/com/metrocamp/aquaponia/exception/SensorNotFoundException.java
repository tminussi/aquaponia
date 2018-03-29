package br.com.metrocamp.aquaponia.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "O sensor com o ID informado não existe")
public class SensorNotFoundException extends RuntimeException {
}
