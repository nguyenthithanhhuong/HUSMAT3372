package oop.lab11.bridge.ex3;

public abstract class ShapeColor {
    protected Shape shape;

    public ShapeColor(Shape shape) {
        this.shape = shape;
    }

    public abstract void drawShape();
}
