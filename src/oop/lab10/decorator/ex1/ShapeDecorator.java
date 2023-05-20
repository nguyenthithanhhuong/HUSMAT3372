package oop.lab10.decorator.ex1;

public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    public ShapeDecorator() {

    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {

    }
}
