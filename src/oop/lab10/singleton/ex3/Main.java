package oop.lab10.singleton.ex3;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();
    }
}
