package oop.lab11.factorymethod.ex3;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        Fruit fruit = null;
        if (type.equals("Apple")) {
            fruit = new Apple();
        }
        if (type.equals("Banana")) {
            fruit = new Banana();
        }
        if (type.equals("Orange")) {
            fruit = new Orange();
        }
        return fruit;
    }
}
