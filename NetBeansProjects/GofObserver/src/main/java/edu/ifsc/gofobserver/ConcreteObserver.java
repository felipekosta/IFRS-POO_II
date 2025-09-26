package edu.ifsc.gofobserver;

public class ConcreteObserver implements Observer {
    private String name;
    private Subject topic;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public void update() {
        int s = (Integer) topic.getUpdate(this);
        printState(s);
    }

    public void printState(int s) {
        System.out.println("Novo estado: " + s);
    }
    @Override
    public void setSubject(Subject s) {
        this.topic = s;
    }
    
    
}
