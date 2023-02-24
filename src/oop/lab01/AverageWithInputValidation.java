package oop.lab01;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numStudents = 3;

        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;

        for (int studentNo = 1; studentNo <= numStudents; ++studentNo) {
            System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
            numberIn = sc.nextInt();

            isValid = false;
            do {
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                    numberIn = sc.nextInt();
                }
            } while (!isValid);

            sum += numberIn;
        }

        average = sum*1.0/3;

        System.out.printf("The average is: %.2f%n", average);
    }
}
