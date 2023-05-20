package oop.lab10.decorator.ex2;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    public String getDescription() {
        return iceCream.getDescription();
    }

    public String addTopping() {
        return "topping: honey";
    }


}
