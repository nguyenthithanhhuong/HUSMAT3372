package oop.lab11.factorymethod.ex3;

public class Client {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit appleFruit = fruitFactory.provideFruit("Apple");
        Fruit bananaFruit = fruitFactory.provideFruit("Banana");
        appleFruit.produceJuice();
    }
}
