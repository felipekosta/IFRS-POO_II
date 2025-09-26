package edu.ifsc.nutricao.model;

public class Pessoa {
    private String nome;
    private double peso;

    public Pessoa(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Alimento alimento) {
        this.peso += alimento.getPeso();
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
}
