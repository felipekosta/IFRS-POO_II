package edu.ifsc.nutricao.model;

import edu.ifsc.nutricao.interfaces.Pessoa;

public class Paciente implements Pessoa {
    private String nome;
    private double peso;
    private Medico medico;

    public Paciente(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Alimento alimento) {
        this.peso += alimento.getPeso();
        this.verificaSaude();
    }

    private void verificaSaude() {
        if (this.peso > 100.0)
            medico.solicitaAtendimento(this);
    }
    
    @Override
    public void alteraNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }
    
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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
