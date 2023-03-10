package oop.lab02;


import java.util.Locale;
import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        sc.close();

        String tempStr = inStr.toUpperCase();
        System.out.print("The ciphertext string is: " + exchangeCipher(tempStr));
    }

    public static String exchangeCipher(String str) {
        int strLen = str.length();
        String newStr = "";
        for (int charIdx = 0; charIdx <= strLen - 1; charIdx++) {
            newStr += (char) ('A' + 'Z' - str.charAt(charIdx));
        }
        return newStr;
    }
}
