package oop.lab05.ex1p1.service;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    public String toString() {
        return "Circle[radius=" + this.radius +",color=" +this.color + "]";
    }
}
