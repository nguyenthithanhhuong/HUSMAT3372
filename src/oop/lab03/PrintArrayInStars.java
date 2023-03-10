package oop.lab03;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUMITEMS = sc.nextInt();

        int[] items = new int[NUMITEMS];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < items.length; ++i) {
            System.out.print(i + ":");
            for (int starNo = 1; starNo <= items[i]; ++starNo) {
                System.out.print("*");
            }
            System.out.printf("(%d)", items[i]);
            System.out.println();
        }
    }
}
