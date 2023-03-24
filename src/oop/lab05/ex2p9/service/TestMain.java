package oop.lab05.ex2p9.service;

import oop.lab05.ex2p8.service.MyCircle;
import oop.lab05.ex2p9.service.MyTriangle;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle mytriangle1 = new MyTriangle(1, 8, 1, 0, 0, 4);
        System.out.println(mytriangle1);

        System.out.println("perimeter is: " + mytriangle1.getPerimeter());

        System.out.println(mytriangle1.toString());
        System.out.println(mytriangle1.getType());

        MyTriangle mytriangle2 = new MyTriangle(new MyPoint(1, 2), new MyPoint(2, 6), new MyPoint(4, 8));
        System.out.println(mytriangle2);

        System.out.println("perimeter is: " + mytriangle2.getPerimeter());

        System.out.println(mytriangle2.toString());
        System.out.println(mytriangle2.getType());

    }

}
