package oop.lab07.ex1p5;

public class Circle implements GeometricObject {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius" + this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
