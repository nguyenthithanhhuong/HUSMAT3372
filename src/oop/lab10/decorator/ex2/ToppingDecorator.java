package oop.lab10.decorator.ex2;

public abstract class ToppingDecorator extends IceCream {
    protected IceCream iceCream;
    public abstract String getDescription();
    public abstract String addTopping();
}
