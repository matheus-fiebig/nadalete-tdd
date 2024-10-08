package com.fatec.tdd.exercicio2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class PersonaDAOTest {
    private PersonaDAO cut;

    @Test
    public void testCreatePersonaShouldReturnOkWhenAllValuesAreValid() {
        cut = new PersonaDAO();
        var arr = new ArrayList<Email>();
        arr.add(new Email(1, "jose@jose.com"));
        var person = new Persona(1, "Jose amado", 18, arr);

        var response = cut.isValidToInclude(person);

        assertNotNull(response);
        assertEquals(response.stream().count(), 0);
    }

    @Test
    public void testCreatePersonaShouldReturnErrorWhenNameInvalid() {
        cut = new PersonaDAO();
        var arr = new ArrayList<Email>();
        arr.add(new Email(1, "jose@jose.com"));
        var person = new Persona(1, "Joseamado", 18, arr);

        var response = cut.isValidToInclude(person);

        assertNotNull(response);
        assertEquals(response.stream().findFirst().get(), "Nome invalido");
    }

    @Test
    public void testCreatePersonaShouldReturnErrorWhenAgeInvalid201() {
        cut = new PersonaDAO();
        var arr = new ArrayList<Email>();
        arr.add(new Email(1, "jose@jose.com"));
        var person = new Persona(1, "Jose amado", 201, arr);

        var response = cut.isValidToInclude(person);

        assertNotNull(response);
        assertEquals(response.stream().findFirst().get(), "Idade invalido");
    }

    @Test
    public void testCreatePersonaShouldReturnErrorWhenAgeInvalid0() {
        cut = new PersonaDAO();
        var arr = new ArrayList<Email>();
        arr.add(new Email(1, "jose@jose.com"));
        var person = new Persona(1, "Jose amado", 0, arr);

        var response = cut.isValidToInclude(person);

        assertNotNull(response);
        assertEquals(response.stream().findFirst().get(), "Idade invalido");
    }

    @Test
    public void testCreatePersonaShouldReturnErrorWhenNoEmails() {
        cut = new PersonaDAO();
        var arr = new ArrayList<Email>();
        var person = new Persona(1, "Jose amado", 10, arr);

        var response = cut.isValidToInclude(person);

        assertNotNull(response);
        assertEquals(response.stream().findFirst().get(), "Email invalido");
    }

    @Test
    public void testCreatePersonaShouldReturnErrorWhenEmailsNull() {
        cut = new PersonaDAO();
        var person = new Persona(1, "Jose amado", 10, null);

        var response = cut.isValidToInclude(person);

        assertNotNull(response);
        assertEquals(response.stream().findFirst().get(), "Email invalido");
    }

    @Test
    public void testCreatePersonaShouldReturnErrorWhenEmailIsWrongFormat() {
        cut = new PersonaDAO();
        var arr = new LinkedList<Email>();
        arr.add(new Email(1, "jose@amadocom"));
        var person = new Persona(1, "Jose amado", 10, arr);

        var response = cut.isValidToInclude(person);

        assertNotNull(response);
        assertEquals(response.stream().findFirst().get(), "Email invalido");
    }
}
