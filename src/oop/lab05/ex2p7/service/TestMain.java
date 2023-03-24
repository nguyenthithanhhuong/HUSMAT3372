package oop.lab05.ex2p7.service;

public class TestMain {
    public static void main(String[] args) {
        MyLine myline1 = new MyLine(1, 8, 1, 2);
        System.out.println(myline1);

        System.out.println(myline1.getBegin());
        System.out.println(myline1.getEnd());

        System.out.println(myline1.getBeginX());
        System.out.println(myline1.getEndY());

        System.out.println("length is: " + myline1.getLength());
        System.out.println("gradient is: " + myline1.getGradient());

        myline1.setBeginX(4);
        myline1.setEndXY(10, 4);
        System.out.println(myline1);

        System.out.println("length is: " + myline1.getLength());
        System.out.println("gradient is: " + myline1.getGradient());

        System.out.println(myline1.toString());
    }
}
