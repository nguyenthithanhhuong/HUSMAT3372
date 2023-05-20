package oop.lab10.adapter.ex2;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new ConcreteteAdaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
