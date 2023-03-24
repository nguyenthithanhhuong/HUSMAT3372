package oop.lab05.ex2p8.cline;

import oop.lab05.ex2p7.service.MyLine;
import oop.lab05.ex2p8.service.MyCircle;

public class TestMain {
    public static void main(String[] args) {
        MyCircle mycircle1 = new MyCircle(1, 8, 10);
        System.out.println(mycircle1);

        System.out.println(mycircle1.getRadius());
        System.out.println(mycircle1.getCenter());

        System.out.println(mycircle1.getCenterX());
        System.out.println(mycircle1.getCenterY());

        System.out.println("area is: " + mycircle1.getArea());
        System.out.println("circumference is: " + mycircle1.Circumference());

        mycircle1.setRadius(4);
        mycircle1.setCenterX(10);
        System.out.println(mycircle1);

        System.out.println("area is: " + mycircle1.getArea());
        System.out.println("circumference is: " + mycircle1.Circumference());

        System.out.println(mycircle1.toString());
    }

}
