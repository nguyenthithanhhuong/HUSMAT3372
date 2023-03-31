package oop.lab06.ex2p2;

public class Cylinder extends Circle{
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea()*height;
    }
}
