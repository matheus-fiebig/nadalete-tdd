package com.fatec.tdd.exercicio3;

public class Funcionario {
    private float salario;
    private String nome;
    private String email;
    private String cargo;

    public Funcionario(float salario, String nome, String email, String cargo) {
        this.salario = salario;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }
    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
