package edu.ifsc.nutricaodpfm.model;

import edu.ifsc.nutricaodpfm.interfaces.Observer;
import edu.ifsc.nutricaodpfm.interfaces.Pessoa;
import edu.ifsc.nutricaodpfm.interfaces.Subject;

public class Medico implements Pessoa, Observer {
    private String nome;
    private String especialidade;
    private Paciente paciente;

    public Medico(String nome, String especialidade, Paciente paciente) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.paciente = paciente;
    }

    public String getNome() {
        return nome;
    }
        
    @Override
    public void alteraNome(String m) {
        this.nome = m;
    }

    @Override
    public void solicitaAtendimento() {
        System.out.println("Solicitado atendimento para o paciente " +
                this.paciente.getNome() + " que esta com o peso: " + 
                (double)this.paciente.getPesoAtual());
    }

    @Override
    public void setSubject(Subject s) {
        this.paciente = (Paciente) s;
    }

}
