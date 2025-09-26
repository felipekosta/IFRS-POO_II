package edu.ifsc.nutricao.model;

import edu.ifsc.nutricao.interfaces.Observer;
import edu.ifsc.nutricao.interfaces.Pessoa;
import edu.ifsc.nutricao.interfaces.Subject;

public class Medico implements Pessoa, Observer {

    private String nome;
    private String especialidade;
    private Paciente paciente;

    public Medico(String nome, String especialidade, Paciente p) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.paciente = p;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void alteraNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void solicitaAtendimento() {
        System.out.println("Alerta!!!! Agendamento realizado para o paciente: " + 
                paciente.getNome() + " esta com o peso: " + 
                (Double)paciente.getPesoAtual());
    }

    @Override
    public void setSubject(Subject s) {
        this.paciente = (Paciente) s;
    }

}
