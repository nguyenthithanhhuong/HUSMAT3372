package oop.lab05.ex1p2.service;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
}
