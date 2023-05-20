package oop.lab11.bridge.ex3;

public class ConcreteShapeColor extends ShapeColor {
    private String color;

    public ConcreteShapeColor(String color, Shape shape) {
        super(shape);
        this.color = color;
    }


    @Override
    public void drawShape() {
        System.out.println("Draw in" + this.color);
        shape.draw();
    }
}
