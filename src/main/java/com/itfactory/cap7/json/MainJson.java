package com.itfactory.cap7.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainJson {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\n" +
                "  \"name\": \"Geanina\",\n" +
                "  \"age\" : 25,\n" +
                "  \"masina\" : {\n" +
                "    \"marca\" : \"Audi\"\n" +
                "  }\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);

        System.out.println(person.getName() + " " + person.getAge() + " " + person.getMasina().getMarca());

    }
}
