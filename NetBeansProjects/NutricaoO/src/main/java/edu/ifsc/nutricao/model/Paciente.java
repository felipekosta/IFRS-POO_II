package edu.ifsc.nutricao.model;

import edu.ifsc.nutricao.interfaces.Observer;
import edu.ifsc.nutricao.interfaces.Pessoa;
import edu.ifsc.nutricao.interfaces.Subject;
import java.util.ArrayList;

public class Paciente implements Pessoa, Subject {
    private String nome;
    private double peso;
    private ArrayList<Observer> medicos;

    public Paciente(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
        this.medicos = new ArrayList<>();
    }

    public void comer(Alimento alimento) {
        this.peso += alimento.getPeso();
        this.verificaSaude();
    }

    @Override
    public void verificaSaude() {
        if (this.peso > 100.0)
            for (Observer medico : medicos) {
                medico.solicitaAtendimento();            
            }
    }
    
    @Override
    public void alteraNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Object getPesoAtual() {
        return peso;
    }

    @Override
    public void adicionaMedico(Observer o) {
       if (!medicos.contains(o))
            medicos.add(o);
    }

    @Override
    public void removeMedico(Observer o) {
        this.medicos.remove(o);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
