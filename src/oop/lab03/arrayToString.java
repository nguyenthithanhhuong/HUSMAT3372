package oop.lab03;

import java.util.Scanner;

public class arrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the value of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        System.out.print(arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        String result = "[" + array[0] + ",";
        for (int i = 1; i < array.length - 1; i++) {
            result += " " + array[i] + ",";
        }
        result += " " + array[array.length - 1] + "]";
        return result;
    }
}
