package oop.lab11.bridge.ex3;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();

        ShapeColor redCircle = new ConcreteShapeColor("red", circle);

        redCircle.drawShape();
    }
}
