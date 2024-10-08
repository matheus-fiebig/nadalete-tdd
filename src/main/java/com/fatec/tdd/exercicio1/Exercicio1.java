package com.fatec.tdd.exercicio1;

public class Exercicio1 {
    public String checkType(float a, float b, float c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception();
        }

        if (a == b && b == c) {
            return "Equilatero";
        } else if (a != b && b != c && a != c) {
            return "Escaleno";
        }

        return "Isoceles";
    }
}
