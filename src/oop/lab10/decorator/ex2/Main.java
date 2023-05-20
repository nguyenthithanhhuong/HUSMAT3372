package oop.lab10.decorator.ex2;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateIceCream();
        iceCream.getDescription();
        IceCream honeyToppingDecorator = new HoneyToppingDecorator(iceCream);
        honeyToppingDecorator.getDescription();
    }
}
