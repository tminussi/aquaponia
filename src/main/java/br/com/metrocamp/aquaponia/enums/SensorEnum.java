package br.com.metrocamp.aquaponia.enums;

public enum SensorEnum {

    DHT22("Dht22"),
    DSB18("Dsb18"),
    NIVEL_AGUA("Nivel Agua");

    private String descricao;

    SensorEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
