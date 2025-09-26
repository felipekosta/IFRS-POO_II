package edu.ifsc.nutri1;

import edu.ifsc.nutri1.abstracts.Alimento;
import edu.ifsc.nutri1.model.ArrozIntegral;
import edu.ifsc.nutri1.model.Medico;
import edu.ifsc.nutri1.model.Paciente;

/**
 *
 * @author felipe
 */
public class Nutricao {

       public void exec() {
           Medico m = new Medico("Dr. Cardio");
           Paciente p = new Paciente("Carlos", 99, m);
           Alimento a = new ArrozIntegral(1);
           System.out.println("Paciente " + p.getNome() + " Peso: " + p.getPeso());
           p.comer(a);
           System.out.println("Paciente " + p.getNome() + " Peso: " + p.getPeso());
           p.comer(a);           
       }
}
