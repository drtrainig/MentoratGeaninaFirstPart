package com.itfactory.cap3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Persoana> map = new HashMap<>();
        map.put("trainer", new Persoana("Dragos", "1"));
        map.put("cursant", new Persoana("Geanina", "1"));
        Persoana persoana = map.get("trainer");
        System.out.println(persoana.getName());
    }
}
