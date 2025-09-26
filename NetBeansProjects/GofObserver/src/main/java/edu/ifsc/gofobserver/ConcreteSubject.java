package edu.ifsc.gofobserver;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private int state = 0;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        if (!observers.contains(o))
            observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();            
        }
    }

    @Override
    public Object getUpdate(Observer o) {
        return state;
    }
    
    public void postMessage(int s) {
        this.state = s;
        notifyObserver();
    }
    
    

}
