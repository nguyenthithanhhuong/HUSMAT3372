package oop.lab08.ex1;

import java.util.*;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
        System.out.println(list);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
        System.out.println(list);
    }

    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
        System.out.println(list);
    }

    public static void removeThird(List<Integer> list) {
        list.remove(2);
        System.out.println(list);
    }

    public static void removeEvil(List<Integer> list) {
        list.removeIf(n -> (n == 666));
        System.out.println(list);
    }

    public static List<Integer> generateSquare() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i * i);
        }
        return list;

    }

    public static boolean contains(List<Integer> list, int value) {
        boolean integerExists = list.contains(value);
        return integerExists;
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        int temp1, temp2;

        for (int i = 0; i < source.size(); i++) {
            temp1 = source.get(i);
            temp2 = target.get(i);
            temp2 = temp1;
            System.out.print(temp2);
        }
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size(); j > 0; j--) {
                int temp1 = list.get(i);
                int temp2 = list.get(j);
                int temp = temp1;
                temp1 = temp2;
                temp2 = temp;

                System.out.print(temp1);
            }
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
        System.out.println(list);
    }
}
