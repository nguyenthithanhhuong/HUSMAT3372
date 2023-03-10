package oop.lab02;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        for (int row = -1; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                if (row == -1 && col == 0) {
                    System.out.printf("%4s\t|", "*");
                } else if (row == -1 && col > 0) {
                    System.out.printf("%4d", col);
                } else if (row == 0) {
                    System.out.printf("%4s-", "----");
                } else if (col == 0 && row > 0) {
                    System.out.printf("%4d\t|", row);
                } else {
                    System.out.printf("%4d", (row * col));
                }
            }
            System.out.println();
        }
    }
}
