package oop.lab02;

import java.util.Locale;
import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = sc.nextLine();
        sc.close();
        String uppInStr = inStr.toUpperCase();

        if (!(checkHexStr(inStr))) {
            System.out.printf("error: invalid hexadecimal string \"%s\"", inStr);
        } else {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr, hex2Dec(uppInStr));
        }
    }

    public static boolean checkHexStr(String str) {
        int lenStr = str.length();
        for (int charIdx = 0; charIdx <= lenStr - 1; charIdx++) {
            char inChar = str.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9')
                    || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static int hex2Dec(String strHex) {
        int result = 0;
        int strLen = strHex.length();
        for (int charIdx = strLen - 1; charIdx >= 0; charIdx--) {
            char tempChar = strHex.charAt(charIdx);
            int temp = 0;
            switch (tempChar) {
                case 'a':
                case 'A':
                case 'b':
                case 'B':
                case 'c':
                case 'C':
                case 'd':
                case 'D':
                case 'e':
                case 'E':
                case 'f':
                case 'F':
                    temp = 10 + (tempChar - 'A');
                    break;
                default:
                    temp = tempChar - '0';
            }
            result += temp*(Math.pow(16, strLen - charIdx - 1));
        }
        return result;
    }
}
