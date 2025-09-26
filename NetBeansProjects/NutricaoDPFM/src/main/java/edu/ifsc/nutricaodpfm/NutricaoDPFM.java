package edu.ifsc.nutricaodpfm;

import edu.ifsc.nutricaodpfm.abstracts.Refeicao;
import edu.ifsc.nutricaodpfm.model.Medico;
import edu.ifsc.nutricaodpfm.model.Paciente;
import edu.ifsc.nutricaodpfm.model.RefeicaoCafeManha;

public class NutricaoDPFM {
    public void exec() {
        Paciente p = new Paciente("marcio", 99.5);
        Medico m = new Medico("Dr. Estranho", "Gastro", p);
        p.adicionaMedico(m);
        
        Refeicao cm = new RefeicaoCafeManha();
        cm.solicitarPreparo();
        
        p.comer(cm);
        
    }
}
