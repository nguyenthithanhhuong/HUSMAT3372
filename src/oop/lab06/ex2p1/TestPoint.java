package oop.lab06.ex2p1;

public class TestPoint {
    public static void mai(String[] args) {
        Point p1 = new Point(10,20);
        System.out.println(p1);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        p1.setX(4);

        System.out.println(p1);
        System.out.println(p1.toString());
    }
}
