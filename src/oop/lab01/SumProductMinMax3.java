package oop.lab01;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int num3 = sc.nextInt();
        sc.close();

        int sum = 0;
        int product = 1;
        int min = num1;

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }

        int max = num1;

        if (num2 > num1) {
            max = num2;
        }

        if (num3 > num1) {
            max = num3;
        }

        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
