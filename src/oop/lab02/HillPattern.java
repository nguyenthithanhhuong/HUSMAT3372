package oop.lab02;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int size = sc.nextInt();
        sc.close();

        HillPatternA(size);
        System.out.println();
        HillPatternB(size);
        System.out.println();
        HillPatternC(size);
    }

    public static void HillPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void HillPatternB(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = row; col < size; col++) {
                System.out.print("# ");
            }
            for (int col = row; col < size - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void HillPatternC(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        HillPatternB(size);
    }
}
