package oop.lab04;

public class ExercisesOnRecursion {
    public static void main(String[] args) {
        // 1.1 Factorial(Recursive)
        System.out.println("Factorial: ");
        for(int i = 1; i < 6; i++) {
            System.out.printf("factorial(%d) = %d", i, factorial(i));
            System.out.println();
        }

        // 1.2 Fibonacci(Recursive)
        System.out.println("Fibonacci: ");
        for (int i = 1; i < 6; i++) {
            System.out.printf("F(%d) = %d", i, fibonacci(i));
            System.out.println();
        }

        // 1.3 Length of a Running Number Sequence(Recursive)
        System.out.println("Length of a Running Number Sequence: ");
        for (int i = 1; i < 6; i++) {
            System.out.printf("S(%d) = %s", i, len(i));
            System.out.println();
        }

        // 1.4 GCD(Recursive)
        int num1 = 15;
        int num2 = 5;
        System.out.printf("gcd(%d, %d) = %d", num1, num2, gcd(num1, num2));
    }

    // 1.1 Factorial(Recursive)
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 1.2 Fibonacci(Recursive)
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 1.3 Length of a Running Number Sequence(recursive)
    public static String len(int n) {
        if (n == 1) {
            return "1";
        } else {
            return len(n - 1) + numOfDigits(n);
        }
    }

    public static String numOfDigits(int n) {
        return String.valueOf(n);
    }

    // 1.4 GCD(Recursive)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}
