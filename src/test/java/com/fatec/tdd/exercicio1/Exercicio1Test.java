package com.fatec.tdd.exercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercicio1Test {
    private Exercicio1 cut;

    @Test
    public void runShouldReturnValidEscaleno() throws Exception {
        cut = new Exercicio1();

        var value = cut.checkType(5, 6, 3);

        assertEquals(value, "Escaleno");
    }

    @Test
    public void runShouldReturnValidIsoceles() throws Exception {
        cut = new Exercicio1();

        var value = cut.checkType(2, 2, 3);

        assertEquals(value, "Isoceles");
    }

    @Test
    public void runShouldReturnValidEquilatero() throws Exception {
        cut = new Exercicio1();

        var value = cut.checkType(1, 1, 1);

        assertEquals(value, "Equilatero");
    }

    @Test
    public void runShouldThrowWhenValueIsZero() throws Exception {
        cut = new Exercicio1();

        Exception exception = assertThrows(Exception.class, () -> {
            cut.checkType(0, 1, 2);
        });

        assertNotNull(exception);
    }

    @Test
    public void runShouldThrowWhenValueIsLessThanZero() throws Exception {
        cut = new Exercicio1();

        Exception exception = assertThrows(Exception.class, () -> {
            cut.checkType(-1, 1, 2);
        });

        assertNotNull(exception);
    }

    @Test
    public void runShouldThrowWhenSumOfTwoSideIsEqualThird() throws Exception {
        cut = new Exercicio1();

        Exception exception = assertThrows(Exception.class, () -> {
            cut.checkType(1, 1, 2);
        });

        assertNotNull(exception);
    }

    @Test
    public void runShouldThrowWhenSumOfTwoSideIsLessThanThird() throws Exception {
        cut = new Exercicio1();

        Exception exception = assertThrows(Exception.class, () -> {
            cut.checkType(1, 1, 3);
        });

        assertNotNull(exception);
    }

    @Test
    public void runShouldThrowWhenAllValuesAreZero() throws Exception {
        cut = new Exercicio1();

        Exception exception = assertThrows(Exception.class, () -> {
            cut.checkType(0, 0, 0);
        });

        assertNotNull(exception);
    }

    @ParameterizedTest
    @MethodSource("lessThanThirdPerm")
    public void runShouldThrowWhenSumOfTwoSideIsLessThanThirdPerm(float a, float b, float c) throws Exception {
        cut = new Exercicio1();

        Exception exception = assertThrows(Exception.class, () -> {
            cut.checkType(a, b, c);

        });

        assertNotNull(exception);
    }

    @ParameterizedTest
    @MethodSource("sumPerm")
    public void runShouldThrowWhenSumOfTwoSideIsEqualThirdPerm(float a, float b, float c) throws Exception {
        cut = new Exercicio1();

        Exception exception = assertThrows(Exception.class, () -> {
            cut.checkType(a, b, c);
        });

        assertNotNull(exception);
    }

    @ParameterizedTest
    @MethodSource("isocelesPerm")
    public void runShouldReturnValidIsocelesPerm(float a, float b, float c) throws Exception {
        cut = new Exercicio1();

        var value = cut.checkType(a, b, c);

        assertEquals(value, "Isoceles");
    }

    private static Stream<Arguments> lessThanThirdPerm() {
        return Stream.of(
                Arguments.of(1, 1, 3),
                Arguments.of(3, 1, 1),
                Arguments.of(1, 3, 1));
    }

    private static Stream<Arguments> sumPerm() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 1, 1),
                Arguments.of(1, 2, 1));
    }

    private static Stream<Arguments> isocelesPerm() {
        return Stream.of(
                Arguments.of(4, 4, 3),
                Arguments.of(3, 4, 4),
                Arguments.of(4, 3, 4));
    }
}
