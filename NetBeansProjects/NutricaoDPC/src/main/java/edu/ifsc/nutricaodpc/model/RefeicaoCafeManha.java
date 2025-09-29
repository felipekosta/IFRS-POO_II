package edu.ifsc.nutricaodpfm.model;

import edu.ifsc.nutricaodpfm.abstracts.Refeicao;
import edu.ifsc.nutricaodpfm.interfaces.RefeicaoDiaria;

/**
 *
 * @author felipe
 */
public class RefeicaoCafeManha extends Refeicao {

    public RefeicaoCafeManha() {
        super(new ValorNutricional(50.0, 20.0, 10.0));
    }

    @Override
    public RefeicaoDiaria prepararRefeicao() {
        System.out.println("Solicitando preparo cafe da manha...");
        return new CafeManha();
    }

}
