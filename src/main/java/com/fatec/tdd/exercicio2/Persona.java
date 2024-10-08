package com.fatec.tdd.exercicio2;

import java.util.List;

public class Persona {
    private int id;
    private String name;
    private int age;
    private List<Email> emails;

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Persona(int id, String name, int age, List<Email> e) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emails = e;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
