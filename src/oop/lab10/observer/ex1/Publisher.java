package oop.lab10.observer.ex1;

import java.util.LinkedList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers;
    private String mainState;

    public Publisher() {
        subscribers = new LinkedList<>();
        mainState = "";
    }

    public boolean subscriber(Subscriber s) {
        return subscribers.add(s);
    }

    public boolean unsubscribe(Subscriber s) {
        return subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }

    public void mainBusinessLogic(String state) {
        this.mainState = state;
        this.notifySubscribers();
    }
}
