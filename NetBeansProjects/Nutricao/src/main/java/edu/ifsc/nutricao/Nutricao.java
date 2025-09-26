package edu.ifsc.nutricao;

import edu.ifsc.nutricao.model.Alimento;
import edu.ifsc.nutricao.model.Pessoa;

public class Nutricao {
    
    public void exec() {
        Pessoa maria = new Pessoa("Maria", 60);
        Alimento pao = new Alimento("Arroz", 2);
        
        maria.comer(pao); 
        System.out.println(maria.getNome() + " comeu e agora pesa " + maria.getPeso() + "kg.");
    }
}
