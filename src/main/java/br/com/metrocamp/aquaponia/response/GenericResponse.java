package br.com.metrocamp.aquaponia.response;

import java.util.List;

public class GenericResponse<T> {

    private String sensor;

    private List<T> info;

    public GenericResponse(String sensor, List<T> info) {
        this.sensor = sensor;
        this.info = info;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public List<T> getInfo() {
        return info;
    }

    public void setInfo(List<T> info) {
        this.info = info;
    }
}
