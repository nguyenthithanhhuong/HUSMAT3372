package oop.lab02;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String inStr = sc.nextLine();
        sc.close();

        if (!checkOctStr(inStr)) {
            System.out.printf("error: invalid octal string \"%s\"", inStr);
        } else {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr, oct2Dec(inStr));
        }
    }

    public static boolean checkOctStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 0 && str.charAt(i) < 8)) {
                return false;
            }
        }
        return true;
    }

    public static int oct2Dec(String strOct) {
        int strLen = strOct.length();
        int result = 0;
        for (int charIdx = strLen - 1; charIdx >= 0; charIdx--) {
            int temp = strOct.charAt(charIdx) - '0';
            result += temp*Math.pow(8, (strLen - charIdx - 1));
        }
        return result;
    }
}
