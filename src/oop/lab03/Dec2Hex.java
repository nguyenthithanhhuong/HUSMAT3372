package oop.lab03;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();
        sc.close();
        System.out.print("The equivalent hexadecimal number is ");
        dec2hex(decNum);
    }

    public static void dec2hex(int decNum) {
        int[] hexNum = new int[100];

        int idx = 0;
        while (decNum != 0) {
            hexNum[idx] = decNum % 16;
            decNum /= 16;
            idx++;
        }

        for (int i = idx - 1; i >= 0; i--) {
            if (hexNum[i] > 0 && hexNum[i] < 10) {
                System.out.print(hexNum[i]);
            } else {
                System.out.print((char) (55 + hexNum[i]));
            }
        }
    }
}
