package edu.ifsc.gofobserver;

public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
    public Object getUpdate(Observer o);
}
