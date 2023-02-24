package oop.lab01;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            --n;
            n = n / 10;
        }
    }
}
