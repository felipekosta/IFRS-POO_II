package edu.ifsc.gofobserver;

public class GofObserver {

    public static void main(String[] args) {
        ConcreteSubject topic = new ConcreteSubject();
        
        Observer ob = new BinaryObserver("binary");
        Observer oo = new OctalObserver("octal");
        Observer oh = new HexaObserver("hexa");
        
        topic.register(oh);
        topic.register(oo);
        topic.register(ob);
        
        oh.setSubject(topic);
        oo.setSubject(topic);
        ob.setSubject(topic);
        
        topic.postMessage(34);
        
    }
}
