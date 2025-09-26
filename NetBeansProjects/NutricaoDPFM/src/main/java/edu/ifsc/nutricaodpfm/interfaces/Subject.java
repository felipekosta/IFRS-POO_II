package edu.ifsc.nutricaodpfm.interfaces;

public interface Subject {
    public void adicionaMedico(Observer o);
    public void removeMedico(Observer o);
    public void verificaSaude();
    public Object getPesoAtual();    
}
