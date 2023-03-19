package oop.lab03;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter the value of array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array 2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size1];
        System.out.print("Enter the value of array 2: ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print(equals(arr1, arr2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        int arrLen1 = array1.length;
        int arrLen2 = array2.length;
        if (arrLen1 != arrLen2) {
            return false;
        } else {
            for (int i = 0; i < arrLen1; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
