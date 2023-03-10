package oop.lab02;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        sc.close();

        int inStrLen = inStr.length();
        int vowels = CountVowels(inStr);
        int digits = CountDigits(inStr);
        double perVowels = (double) 100*(vowels)/inStrLen;
        double perDigits = 100 - perVowels;

        System.out.printf("Number of vowels: %d (%.2f%s)\n", vowels, perVowels, "%");
        System.out.printf("Number of digits: %d (%.2f%s)", digits, perDigits, "%");
    }

    public static int CountVowels(String str) {
        int strLen = str.length();
        int count = 0;

        for (int charIdx = 0; charIdx <= strLen - 1; charIdx++) {
            switch (str.charAt(charIdx)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case 'A':
                    count++;
                    break;
                case 'E':
                    count++;
                    break;
                case 'I':
                    count++;
                    break;
                case 'O':
                    count++;
                    break;
                case 'U':
                    count++;
                    break;
            }
        }
        return count;
    }

    public static int CountDigits(String str) {
        int strLen = str.length();
        int count = 0;

        for (int charIdx = 0; charIdx <= strLen - 1; charIdx++) {
            switch (str.charAt(charIdx)) {
                case '0':
                    count++;
                    break;
                case '1':
                    count++;
                    break;
                case '2':
                    count++;
                    break;
                case '3':
                    count++;
                    break;
                case '4':
                    count++;
                    break;
                case '5':
                    count++;
                    break;
                case '6':
                    count++;
                    break;
                case '7':
                    count++;
                    break;
                case '8':
                    count++;
                    break;
                case '9':
                    count++;
                    break;
            }
        }
        return count;
    }
}
