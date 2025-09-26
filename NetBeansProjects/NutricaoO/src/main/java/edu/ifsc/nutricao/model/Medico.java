package edu.ifsc.nutricao.model;

import edu.ifsc.nutricao.interfaces.Observer;
import edu.ifsc.nutricao.interfaces.Pessoa;
import edu.ifsc.nutricao.interfaces.Subject;

public class Medico implements Pessoa, Observer {
    
    private String especialidade;
    private String nome;
    private Paciente paciente;

    public Medico(String nome, String especialidade) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public void alteraNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void solicitaAtendimento() {
        double peso = (double) this.paciente.getPesoAtual();
        System.out.println("Alerta!!!! Agendamento realizado com o medico " + this.nome + ". Paciente com peso: " + peso);
    }

    @Override
    public void setSubject(Subject s) {
        this.paciente = (Paciente) s;
    }

}
