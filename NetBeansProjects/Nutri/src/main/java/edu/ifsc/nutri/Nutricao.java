package edu.ifsc.nutri;

import edu.ifsc.nutri.model.Alimento;
import edu.ifsc.nutri.model.Pessoa;

public class Nutricao {
    public void exec() {
        Pessoa p = new Pessoa("carlos", 97);
        Alimento a = new Alimento("arroz", 2);
        
        System.out.println("Peso atual: "+p.getPeso());
        p.comer(a);
        System.out.println("Peso apos comer: "+p.getPeso());
    }
}
