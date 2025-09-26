package edu.ifsc.gofobserver;

public interface Observer {
    public void update();
    public void setSubject(Subject s);
}
