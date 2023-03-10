package oop.lab03;

import java.util.Scanner;

public class Swap {
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
        int[] arr2 = new int[size2];
        System.out.print("Enter the value of array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        swap(arr1, arr2);
        System.out.print("Array 1 after swap: ");
        printArray(arr1);
        System.out.print("Array 2 after swap: ");
        printArray(arr2);
    }

    public static boolean swap(int[] array1, int[] array2) {
        int arrLen1 = array1.length;
        int arrLen2 = array2.length;
        if (arrLen1 != arrLen2) {
            return false;
        }
        for (int i = 0; i < arrLen1; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
