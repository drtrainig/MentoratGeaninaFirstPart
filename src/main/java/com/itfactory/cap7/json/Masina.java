package com.itfactory.cap7.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Masina {

    @JsonProperty("marca")
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
