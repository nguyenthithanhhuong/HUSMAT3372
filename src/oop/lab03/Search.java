package oop.lab03;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.print("Enter the value of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.close();
        System.out.print(search(arr, key));
    }

    public static int search(int[] array, int key) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                result = i;
            }
        }
        return result;
    }
}
