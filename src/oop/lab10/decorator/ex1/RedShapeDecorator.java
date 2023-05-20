package oop.lab10.decorator.ex1;

public class RedShapeDecorator extends ShapeDecorator {
    Shape shape;

    public RedShapeDecorator() {

    }

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override

    public void draw() {
        System.out.println("Red...");
    }

    private void setRedBorder() {

    }
}
