package com.itfactory.cap4;

public enum Departament {
    JAVA(123, "Acest departament este de java"),
    TESTING(124, "Acest departament este de testare"),
    PYTHON(125, "Acest departament este de python"),
    HR(126, "Acest departament este de HR");

    private final int id;
    private final String description;

    Departament(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
