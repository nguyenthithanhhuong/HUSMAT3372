package oop.lab03;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thenumber of items: ");
        final int NUMITEMS = sc.nextInt();

        int[] items = new int[NUMITEMS];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (sepatated by space): ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                System.out.printf("[%d,", items[i]);
            } else if (i > 0 && i < items.length - 1) {
                System.out.printf(" %d,", items[i]);
            } else {
                System.out.printf(" %d]", items[i]);
            }
        }
    }
}
