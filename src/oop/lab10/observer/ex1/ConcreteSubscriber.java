package oop.lab10.observer.ex1;

public class ConcreteSubscriber implements Subscriber {
    @Override
    public void update(String state) {
        System.out.println(state);
    }
}
