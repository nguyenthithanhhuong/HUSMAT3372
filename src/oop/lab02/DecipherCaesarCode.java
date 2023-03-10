package oop.lab02;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        sc.close();
        decipherCaesarCode(inStr);
    }

    public static void decipherCaesarCode(String str) {
        System.out.print("The ciphertext string is: ");
        int strLen = str.length();
        String newStr = str.toUpperCase();
        for (int charIdx = 0; charIdx <= strLen - 1; charIdx++) {
            System.out.print((char) ((newStr.charAt(charIdx)) - 3));
        }
    }
}
