package com.fatec.tdd.exercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraSalarioTest {
    private CalculadoraSalario cut;

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalAbove3000AndDeveloper() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(5000, "jose", "jose@jose.com", "DESENVOLVEDOR");

        var sal = cut.calcular(func);

        assertEquals(sal, 4000f, 0.1f);
    }

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalBelow3000AndDeveloper() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(2000, "jose", "jose@jose.com", "DESENVOLVEDOR");

        var sal = cut.calcular(func);

        assertEquals(sal, 1800, 0.1f);
    }

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalAbove2000AndDBA() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(5000, "jose", "jose@jose.com", "DBA");

        var sal = cut.calcular(func);

        assertEquals(sal, 3750, 0.1f);
    }

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalBellow2000AndDBA() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(1000, "jose", "jose@jose.com", "DBA");

        var sal = cut.calcular(func);

        assertEquals(sal, 850, 0.1f);
    }

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalAbove2000AndTester() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(5000, "jose", "jose@jose.com", "TESTADOR");

        var sal = cut.calcular(func);

        assertEquals(sal, 3750, 0.1f);
    }

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalBellow2000AndTester() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(1000, "jose", "jose@jose.com", "TESTADOR");

        var sal = cut.calcular(func);

        assertEquals(sal, 850, 0.1f);
    }

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalAbove5000AndManager() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(10000, "jose", "jose@jose.com", "GERENTE");

        var sal = cut.calcular(func);

        assertEquals(sal, 7000, 0.1f);
    }

    @Test
    public void testCalcularShouldReturnCorrectValueWhenSalBellow5000AndManager() {
        cut = new CalculadoraSalario();
        var func = new Funcionario(1000, "jose", "jose@jose.com", "GERENTE");

        var sal = cut.calcular(func);

        assertEquals(sal, 800, 0.1f);
    }
}
