package edu.ifsc.gofobserver;

public class OctalObserver extends ConcreteObserver {

    public OctalObserver(String name) {
        super(name);
    }

    @Override
    public void printState(int s) {
        System.out.println(super.getName() + " Octal state: " + Integer.toOctalString(s));
    }

}
