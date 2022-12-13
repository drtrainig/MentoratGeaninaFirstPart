package com.itfactory.cap4;

public class Employee {
    private String name;
    private String email;
    private Departament departament;

    public Employee(String name, String email, Departament departament) {
        this.name = name;
        this.email = email;
        this.departament = departament;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public static void main(String[] args) {
        Departament d = Departament.HR;
        d.getId();


    }
}
