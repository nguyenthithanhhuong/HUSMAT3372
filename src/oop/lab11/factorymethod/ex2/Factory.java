package oop.lab11.factorymethod.ex2;

public class Factory {
    public Product createProduct(String type) {
        Product product = null;
        if (type.equals("Product A")) {
            product = new ProductA();
        }
        if (type.equals("Product B")) {
            product = new ProductB();
        }
        return product;
    }
}
