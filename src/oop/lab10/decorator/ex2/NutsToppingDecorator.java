package oop.lab10.decorator.ex2;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription();
    }

    public String addTopping() {
        return "topping: nuts";
    }
}
