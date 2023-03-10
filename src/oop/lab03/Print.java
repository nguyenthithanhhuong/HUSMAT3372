package oop.lab03;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the value of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        print(array);
        sc.close();
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.printf("[%d,", array[i]);
            } else if (i == array.length - 1) {
                System.out.printf(" %d]", array[i]);
            } else {
                System.out.printf(" %d,", array[i]);
            }
        }
    }
}
