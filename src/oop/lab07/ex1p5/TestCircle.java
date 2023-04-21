package oop.lab07.ex1p5;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject geoObj1 = new Circle(1.8);
        System.out.println(geoObj1);
        System.out.println("Perimeter is: " + geoObj1.getPerimeter());
        System.out.println("Area is: " + geoObj1.getArea());
    }
}
