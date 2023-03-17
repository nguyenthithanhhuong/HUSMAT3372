package oop.lab04;

import java.util.Scanner;

public class NumberTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3.1 Perfect and Deficient Numbers
        System.out.print("Enter the upper bound: ");
        int uppBound01 = sc.nextInt();

        perfectNumberList(uppBound01);
        deficientNumberList(uppBound01);
        System.out.println();
        // 3.2 Prime Numbers
        System.out.print("Please enter the upper bound: ");
        int uppBound02 = sc.nextInt();
        primeList(uppBound02);
        System.out.println();

        // 3.3 Prime Factors
        System.out.print("Enter the upper bound: ");
        int uppBound = sc.nextInt();
        printPerfectPrimeFactorList(uppBound);
        System.out.println();

        // 3.4 Greatest Common Divisor
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.printf("GCD(%d, %d) = %d", num1, num2, gcd(num1, num2));
        sc.close();
    }

    // 3.1 Perfect and Deficient Numbers
    public static boolean isPerfect(int aPosInt) {
        if (sumDivisorsOfNumber(aPosInt) == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        if (sumDivisorsOfNumber(aPosInt) < aPosInt) {
            return true;
        }
        return false;
    }

    public static int sumDivisorsOfNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void perfectNumberList(int n) {
        System.out.println("These numbers are perfect:");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double perPerfectNumber = (double) count*100/n;
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]", count, perPerfectNumber);
    }

    public static void deficientNumberList(int n) {
        System.out.println("\nThese numbers are neither deficient nor perfect:");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double perDeficientNumber = (double) count*100/n;
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, perDeficientNumber);
    }

    // 3.2 Prime Numbers
    public static boolean isPrime(int aPosInt) {
        if (aPosInt == 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeList(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        double perPrimeNumber = (double) count*100/n;
        System.out.printf("[%d primes found (%.2f%%)]", count, perPrimeNumber);
    }

    // 3.3
    public static boolean isPerfectPrimeFactor(int n) {
        int product = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        return product == n;
    }

    public static void printPerfectPrimeFactorList(int uppBound) {
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors:");
        for (int i = 1; i <= uppBound; i++) {
            if (isPerfectPrimeFactor(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double perPerfectPrime = (double) count*100/uppBound;
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, perPerfectPrime);
    }

    // 3.4 Greatest Common Divisor
    public static int gcd(int a, int b) {
        int result = 0;
        if (b == 0) {
            result = b;
        }
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        result = a;
        return result;
    }
}
