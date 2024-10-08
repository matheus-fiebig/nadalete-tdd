package com.fatec.tdd.exercicio2;

import java.util.LinkedList;
import java.util.List;

public class PersonaDAO {
    public List<String> isValidToInclude(Persona p) {
        var l = new LinkedList<String>();

        String regex = "^[A-Za-z]+(?:\\s+[A-Za-z]+)+$";
        if (p.getName() != null && !p.getName().matches(regex)) {
            l.add("Nome invalido");
        }

        if (p.getAge() <= 0 || p.getAge() > 200) {
            l.add("Idade invalido");
        }

        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            l.add("Email invalido");
        }

        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
        for (int i = 0; i < p.getEmails().size(); i++) {
            if (p.getEmails().get(i) == null || !p.getEmails().get(i).getName().matches(regexEmail)) {
                l.add("Email invalido");
            }
        }

        return l;
    }
}
