package oop.lab10.decorator.ex1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(shape);
        shapeDecorator.draw();
    }
}
