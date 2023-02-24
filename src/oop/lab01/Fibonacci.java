package oop.lab01;

public class Fibonacci {
    public static void main(String[] args) {
        int nMax = 20;
        PrintFibonacciNumbers(nMax);
    }

    public static void PrintFibonacciNumbers(int nMax) {
        int n = 3;
        int fn = 0;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        average = sum*1.0/nMax;
        System.out.println();
        System.out.println("The average is " + average);
    }
}
