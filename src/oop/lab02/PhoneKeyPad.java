package oop.lab02;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        sc.close();

        PhoneKeyPadUseNestedIf(inStr);
        PhoneKeyPadUseSwitchCase(inStr);
    }

    public static void PhoneKeyPadUseNestedIf(String str) {
        int strLen = str.length();
        String newStr = str.toLowerCase();
        for (int charIdx = 0; charIdx <= strLen - 1; charIdx++) {
            if (newStr.charAt(charIdx) == 'a' || newStr.charAt(charIdx) == 'b' || newStr.charAt(charIdx) == 'c') {
                System.out.print(2);
            } else if (newStr.charAt(charIdx) == 'd' || newStr.charAt(charIdx) == 'e' || newStr.charAt(charIdx) == 'f') {
                System.out.print(3);
            } else if (newStr.charAt(charIdx) == 'g' || newStr.charAt(charIdx) == 'h' || newStr.charAt(charIdx) == 'i') {
                System.out.print(4);
            } else if (newStr.charAt(charIdx) == 'j' || newStr.charAt(charIdx) == 'k' || newStr.charAt(charIdx) == 'l') {
                System.out.print(5);
            } else if (newStr.charAt(charIdx) == 'm' || newStr.charAt(charIdx) == 'n' || newStr.charAt(charIdx) == 'o') {
                System.out.print(6);
            } else if (newStr.charAt(charIdx) == 'p' || newStr.charAt(charIdx) == 'q' || newStr.charAt(charIdx) == 'r' || newStr.charAt(charIdx) == 's') {
                System.out.print(7);
            } else if (newStr.charAt(charIdx) == 't' || newStr.charAt(charIdx) == 'u' || newStr.charAt(charIdx) == 'v') {
                System.out.print(8);
            } else {
                System.out.print(9);
            }
        }
        System.out.println();
    }

    public static void PhoneKeyPadUseSwitchCase(String str) {
        int strLen = str.length();
        String newStr = str.toLowerCase();
        for (int charIdx = 0; charIdx <= strLen - 1; charIdx++) {
            switch (newStr.charAt(charIdx)) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print(9);
                    break;
            }
        }
    }
}
