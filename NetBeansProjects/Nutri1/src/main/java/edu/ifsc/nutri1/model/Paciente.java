package edu.ifsc.nutri1.model;

import edu.ifsc.nutri1.abstracts.Alimento;
import edu.ifsc.nutri1.interfaces.Pessoa;

public class Paciente implements Pessoa {
    private String nome;
    private double peso;
    private Medico medico;

    public Paciente(String nome, double peso, Medico medico) {
        this.nome = nome;
        this.peso = peso;
        this.medico = medico;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public void comer(Alimento a) {
        this.peso += a.getPeso();
        verificaSaude();
    }
    public void verificaSaude() {
        if (this.peso > 100) {
            medico.solicitarAtendimento(this);
        }
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
