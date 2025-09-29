package edu.ifsc.nutricaodpfm.abstracts;

import edu.ifsc.nutricaodpfm.interfaces.RefeicaoDiaria;
import edu.ifsc.nutricaodpfm.model.ValorNutricional;

public abstract class Refeicao {
    private ValorNutricional valorNutricional;  

    public Refeicao(ValorNutricional valorNutricional) {
        this.valorNutricional = valorNutricional;
    }
    
    public void solicitarPreparo() {
        System.out.println("Solicitando a refeicao...");
        RefeicaoDiaria refeicao = prepararRefeicao();
        refeicao.preparar();
    }
    
    public abstract RefeicaoDiaria prepararRefeicao();

    public ValorNutricional getValorNutricional() {
        return valorNutricional;
    }
    
    
}
