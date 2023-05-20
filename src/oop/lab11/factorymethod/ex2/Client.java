package oop.lab11.factorymethod.ex2;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product1 = factory.createProduct("Product A");
        Product product2 = factory.createProduct("Product B");
        product1.use();
        product2.use();
    }
}
