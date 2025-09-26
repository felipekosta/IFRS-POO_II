package edu.ifsc.nutricao;

import edu.ifsc.nutricao.model.Alimento;
import edu.ifsc.nutricao.model.ArrozIntegral;
import edu.ifsc.nutricao.model.Medico;
import edu.ifsc.nutricao.model.Paciente;

public class Nutricao {
    
    public void exec() {
        Paciente p1 = new Paciente("Maria", 97);
        Medico m1 = new Medico("Dr. Coracao", "Cardio");
        m1.setPaciente(p1);
        Medico m2 = new Medico("Dr. Estomago", "Nutri");
        m2.setPaciente(p1);
        
        p1.adicionaMedico(m1);
        p1.adicionaMedico(m2);
        
        Alimento pao = new ArrozIntegral(2);
        
        p1.comer(pao); 
        System.out.println(p1.getNome() + " comeu e agora pesa " + p1.getPesoAtual()+ "kg.");
        
        p1.comer(pao); 
        System.out.println(p1.getNome() + " comeu e agora pesa " + p1.getPesoAtual()+ "kg.");
    }
}
