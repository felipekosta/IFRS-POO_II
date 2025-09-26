package edu.ifsc.gofobserver;

public class HexaObserver extends ConcreteObserver {

    
    public HexaObserver(String name) {
        super(name);
    }

    @Override
    public void printState(int s) {
        System.out.println(super.getName() + " Hexa state: " + Integer.toHexString(s));
    }

}
