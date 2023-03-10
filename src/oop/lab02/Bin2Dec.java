package oop.lab02;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String inStr = sc.nextLine();
        sc.close();

        if (checkBin(inStr) == false) {
            System.out.printf("error: invalid binary string \"%s\"", inStr);
        } else {
            bin2Dec(inStr);
        }
    }

    public static int bin2Dec(String str) {
        int strLen = str.length();
        int result = 0;
        for (int charIdx = strLen - 1; charIdx >= 0; charIdx--) {
            int temp = str.charAt(charIdx) - '0';
            result += temp*Math.pow(2, (strLen - charIdx));
        }
        return result;
    }

    public static boolean checkBin(String str) {
        int strLen = str.length();
        boolean result = true;
        for (int charIdx = strLen - 1; charIdx >= 0; charIdx--) {
            if (str.charAt(charIdx) == 0 || str.charAt(charIdx) == 1) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
