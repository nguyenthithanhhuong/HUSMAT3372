package oop.lab10.observer.ex1;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber = new ConcreteSubscriber();

        publisher.subscriber(subscriber);
        publisher.mainBusinessLogic("This is notify...");
    }
}
