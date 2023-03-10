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
    }

    public static void HillPatternA(int size) {
        int numRows = size;
        int numCol = 2*numRows - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void HillPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col <= 2*size - 1; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void HillPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {

            }
        }
    }

    public static void HillPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {

            }
        }
    }
}
