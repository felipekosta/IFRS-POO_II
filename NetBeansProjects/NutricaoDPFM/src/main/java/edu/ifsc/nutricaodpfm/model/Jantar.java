package edu.ifsc.nutricaodpfm.model;

import edu.ifsc.nutricaodpfm.interfaces.RefeicaoDiaria;

public class Jantar implements RefeicaoDiaria {

    @Override
    public void preparar() {
        System.out.println("Preparando Jantar...");
    }

}
