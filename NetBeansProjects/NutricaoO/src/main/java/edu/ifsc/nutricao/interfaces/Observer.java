package edu.ifsc.nutricao.interfaces;

public interface Observer {
    void solicitaAtendimento();
    void setSubject(Subject s);
}
