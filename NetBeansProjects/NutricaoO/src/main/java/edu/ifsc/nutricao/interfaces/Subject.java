package edu.ifsc.nutricao.interfaces;

public interface Subject {
    void adicionaMedico(Observer o);
    void removeMedico(Observer o);
    void verificaSaude();
    Object getPesoAtual();    
}
