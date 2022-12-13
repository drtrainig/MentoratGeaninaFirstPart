package com.itfactory.cap3;

import java.util.Objects;

public class Persoana {
   private String name;
   private String phoneNumber;

    public Persoana(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(name, persoana.name) &&
                Objects.equals(phoneNumber, persoana.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
