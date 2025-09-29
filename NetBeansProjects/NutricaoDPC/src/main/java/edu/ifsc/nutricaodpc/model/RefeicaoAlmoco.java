package edu.ifsc.nutricaodpfm.model;

import edu.ifsc.nutricaodpfm.abstracts.Refeicao;
import edu.ifsc.nutricaodpfm.interfaces.RefeicaoDiaria;

/**
 *
 * @author felipe
 */
public class RefeicaoAlmoco extends Refeicao {

    public RefeicaoAlmoco(ValorNutricional valorNutricional) {
         super(new ValorNutricional(60.0, 10.0, 10.0));
    }

    @Override
    public RefeicaoDiaria prepararRefeicao() {
        System.out.println("Solicitando preparo almoco...");
        return new Almoco();
    }

}
