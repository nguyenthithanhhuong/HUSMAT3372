package oop.lab03;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != SENTINEL) {
            if (hasEight(num)) {
                sum += num;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            num = sc.nextInt();
        }
        System.out.printf("The magic sum is: %d", sum);
    }

    public static boolean hasEight(int num) {
        String str = String.valueOf(num);
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) == '8') {
                return true;
            }
        }
        return false;
    }
}
