package br.com.metrocamp.aquaponia.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "nivel_agua")
public class NivelAgua {

    @Id
    private String id;

    private Boolean nivelCheio;

    private Boolean nivelVazio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getNivelCheio() {
        return nivelCheio;
    }

    public void setNivelCheio(Boolean nivelCheio) {
        this.nivelCheio = nivelCheio;
    }

    public Boolean getNivelVazio() {
        return nivelVazio;
    }

    public void setNivelVazio(Boolean nivelVazio) {
        this.nivelVazio = nivelVazio;
    }
}
