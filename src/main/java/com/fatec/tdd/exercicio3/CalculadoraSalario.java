package com.fatec.tdd.exercicio3;

public class CalculadoraSalario {

    public float calcular(Funcionario f){
        if(f.getCargo() == "DESENVOLVEDOR"){
            return f.getSalario() >= 3000 ? f.getSalario() * 0.8f : f.getSalario() * 0.9f;
        }

        if(f.getCargo() == "DBA" || f.getCargo() == "TESTADOR"){
            return f.getSalario() >= 2000 ? f.getSalario() * 0.75f : f.getSalario() * 0.85f;
        }


        return f.getSalario() >= 5000 ? f.getSalario() * 0.7f : f.getSalario() * 0.8f;
    }
    
}
