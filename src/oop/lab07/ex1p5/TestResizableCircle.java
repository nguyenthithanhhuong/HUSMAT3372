package oop.lab07.ex1p5;

public class TestResizableCircle {
    public static void main(String[] args) {
        GeometricObject geoObj1 = new Circle(1.8);
        System.out.println(geoObj1);
        System.out.println("Perimeter is: " + geoObj1.getPerimeter());
        System.out.println("Area is: " + geoObj1.getArea());

        GeometricObject geoObj2 = new ResizableCircle(1.8);
        System.out.println(geoObj2);

        ((ResizableCircle) geoObj2).resize(10);

        GeometricObject geoObj3 = (GeometricObject) geoObj2;
        System.out.println(geoObj3);
        System.out.println("Perimeter is " + geoObj3.getPerimeter());
        System.out.println("Area is " + geoObj3.getArea());
    }
}
