package edu.ifsc.nutricao.model;

import edu.ifsc.nutricao.interfaces.Pessoa;

public class Medico implements Pessoa {

    private String nome;

    public Medico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void alteraNome(String nome) {
    }
    
    public void solicitaAtendimento(Paciente p) {
        System.out.println("Alerta!!!! Agendamento realizado para o paciente: " + p.getNome());
    }

}
