package edu.ifsc.nutricao.interfaces;

public interface Observer {
    public void solicitaAtendimento();
    public void setSubject(Subject s);
}
