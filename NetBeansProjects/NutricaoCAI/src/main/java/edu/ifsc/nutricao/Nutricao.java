package edu.ifsc.nutricao;

import edu.ifsc.nutricao.model.Alimento;
import edu.ifsc.nutricao.model.ArrozIntegral;
import edu.ifsc.nutricao.model.Medico;
import edu.ifsc.nutricao.model.Paciente;

public class Nutricao {
    
    public void exec() {
        Paciente p1 = new Paciente("Maria", 97);
        Medico m1 = new Medico("Dr. Medico");
        p1.setMedico(m1);
        Alimento pao = new ArrozIntegral(2);
        
        p1.comer(pao); 
        System.out.println(p1.getNome() + " comeu e agora pesa " + p1.getPeso() + "kg.");
        
        p1.comer(pao); 
        System.out.println(p1.getNome() + " comeu e agora pesa " + p1.getPeso() + "kg.");
    }
}
