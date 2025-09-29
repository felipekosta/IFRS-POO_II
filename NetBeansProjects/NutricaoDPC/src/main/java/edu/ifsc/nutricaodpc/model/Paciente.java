package edu.ifsc.nutricaodpfm.model;

import edu.ifsc.nutricaodpfm.abstracts.Refeicao;
import edu.ifsc.nutricaodpfm.interfaces.Observer;
import edu.ifsc.nutricaodpfm.interfaces.Pessoa;
import edu.ifsc.nutricaodpfm.interfaces.Subject;
import java.util.ArrayList;

public class Paciente implements Pessoa, Subject{
    private String nome;
    private double peso;
    private ArrayList<Medico> medicos;

    public Paciente(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        this.medicos = new ArrayList<>();
    }

    public void comer(Refeicao r) {
        this.peso += r.getValorNutricional().getValorEnergetico() / 100;
        if (this.peso > 100)
            verificaSaude();
    }
    
    @Override
    public void alteraNome(String n) {
        this.nome = n;
    }

    @Override
    public void adicionaMedico(Observer m) {
        if (!this.medicos.contains(m))
            this.medicos.add((Medico) m);
    }

    @Override
    public void removeMedico(Observer m) {
        this.medicos.remove(m);
    }

    @Override
    public void verificaSaude() {
        for (Observer medico : medicos) {
            medico.solicitaAtendimento();
        }
    }

    @Override
    public Object getPesoAtual() {
        return this.peso;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
        
}
