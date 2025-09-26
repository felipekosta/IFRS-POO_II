package edu.ifsc.gofobserver;

public class BinaryObserver extends ConcreteObserver {

    public BinaryObserver(String name) {
        super(name);
    }

    @Override
    public void printState(int s) {
        System.out.println(super.getName() + " Binary state: " + Integer.toBinaryString(s));
    }
    
    
    
}
