package edu.ifsc.nutricao.model;

import edu.ifsc.nutricao.interfaces.Pessoa;
import edu.ifsc.nutricao.interfaces.Subject;
import java.util.ArrayList;

public class Paciente implements Pessoa, Subject {
    private String nome;
    private double peso;
    private ArrayList<Medico> medicos;

    public Paciente(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
        this.medicos = new ArrayList<>();
    }

    public void comer(Alimento alimento) {
        this.peso += alimento.getPeso();
        this.notificar();
    }
    
    @Override
    public void alteraNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void adicionaMedico(Medico m) {
        if (!this.medicos.contains(m))
            this.medicos.add(m);
    }

    @Override
    public void removeMedico(Medico m) {
        this.medicos.remove(m);
    }

    @Override
    public void notificar() {
        if (this.peso > 100.0)
            for (Medico medico : medicos) {
                medico.solicitaAtendimento();
            }
    }

    @Override
    public Object getPesoAtual() {
        return this.peso;
    }
}
