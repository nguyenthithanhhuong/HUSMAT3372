package oop.lab05.ex1p3.cline;

import oop.lab05.ex1p3.service.Rectangle;

public class TestMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);

        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);
        System.out.println(rectangle1);
        System.out.println("length is: " + rectangle1.getLength());
        System.out.println("width is: " + rectangle1.getWidth());

        System.out.printf("area is: %.2%n", rectangle1.getArea());
        System.out.printf("perimeter is : %.2f%n", rectangle1.getPerimeter());
    }
}
