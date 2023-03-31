package oop.lab06.ex2p1;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(10, 4);
        Point p2 = new Point(18, 12);

        l1.setBeginXY(p1.getX(), p1.getY());
        l1.setEndXY(p2.getX(), p2.getY());

        System.out.println(l1);
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
    }
}
