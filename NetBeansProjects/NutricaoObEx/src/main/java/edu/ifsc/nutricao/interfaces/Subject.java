package edu.ifsc.nutricao.interfaces;

import edu.ifsc.nutricao.model.Medico;

public interface Subject {
    public void adicionaMedico(Medico m);
    public void removeMedico(Medico m);
    public void notificar();
    public Object getPesoAtual();    
}
