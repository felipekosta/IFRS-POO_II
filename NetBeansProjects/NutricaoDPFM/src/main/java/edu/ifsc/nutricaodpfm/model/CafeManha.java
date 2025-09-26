package edu.ifsc.nutricaodpfm.model;

import edu.ifsc.nutricaodpfm.interfaces.RefeicaoDiaria;

public class CafeManha implements RefeicaoDiaria {

    @Override
    public void preparar() {
        System.out.println("Preparando cafe da manhã...");
    }

}
