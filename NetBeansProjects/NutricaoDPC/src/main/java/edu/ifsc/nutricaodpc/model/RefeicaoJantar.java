package edu.ifsc.nutricaodpfm.model;

import edu.ifsc.nutricaodpfm.abstracts.Refeicao;
import edu.ifsc.nutricaodpfm.interfaces.RefeicaoDiaria;

/**
 *
 * @author felipe
 */
public class RefeicaoJantar extends Refeicao {

    public RefeicaoJantar(ValorNutricional valorNutricional) {
         super(new ValorNutricional(30.0, 7.0, 5.0));
    }

    @Override
    public RefeicaoDiaria prepararRefeicao() {
        System.out.println("Solicitando preparo jantar...");
        return new Jantar();
    }

}
