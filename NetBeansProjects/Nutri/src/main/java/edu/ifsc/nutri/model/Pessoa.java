package edu.ifsc.nutri.model;

public class Pessoa {
    private String nome;
    private double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comer(Alimento a) {
        this.peso += a.getPeso();
    }
}
