package oop.lab03;

import java.util.Scanner;

public class GradesStatistics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] grades = new int[numStudents];
        if (grades.length > 0) {
            for (int i = 0; i < grades.length; ++i) {
                System.out.printf("Enter the grades for student %d: ", (i + 1));
                grades[i] = sc.nextInt();
            }
        }
        System.out.print("The grades are: ");
        print(grades);
        System.out.println();
        if (checkArr(grades)) {
            System.out.printf("The average is: %.2f\n", average(grades));
            System.out.printf("The median is: %.2f\n", median(grades));
            System.out.printf("The minimum is: %d\n", min(grades));
            System.out.printf("The maximum is: %d\n", max(grades));
            System.out.printf("The standard deviation is: %.2f", stdDev(grades));
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.printf("[%d,", array[i]);
            } else if (i == array.length - 1) {
                System.out.printf(" %d]", array[i]);
            } else {
                System.out.printf(" %d,", array[i]);
            }
        }
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum*1.0/(array.length));
    }

    public static void Sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int min(int[] array) {
        Sort(array);
        return array[0];
    }

    public static int max(int[] array) {
        Sort(array);
        return array[array.length - 1];
    }

    public static double median(int[] array) {
        int arrayLen = array.length;
        Sort(array);
        if (arrayLen % 2 == 0) {
            return (array[arrayLen / 2] + array[(arrayLen / 2) - 1]) / 2;
        } else {
            return array[arrayLen / 2];
        }
    }

    public static double stdDev(int[] array) {
        double result = 0.0;
        double temp = average(array);
        for (int i = 0; i < array.length; i++) {
            result += array[i]*array[i] - temp*temp;
        }
        result /= (array.length);
        result = Math.sqrt(result);
        return result;
    }

    public static boolean checkArr(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > 100) {
                return false;
            }
        }
        return true;
    }
}
