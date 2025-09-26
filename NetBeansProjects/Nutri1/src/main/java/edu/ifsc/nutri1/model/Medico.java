package edu.ifsc.nutri1.model;

import edu.ifsc.nutri1.interfaces.Pessoa;

public class Medico implements Pessoa {
    private String nome;

    public Medico(String nome) {
        this.nome = nome;
    }

    @Override
    public void alteraNome(String nome) {
        this.nome = nome;
    }
    
    public void solicitarAtendimento(Paciente p) {
        System.out.println("Atendimento solicitado");
    }

}
