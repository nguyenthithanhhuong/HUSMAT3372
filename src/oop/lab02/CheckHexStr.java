package oop.lab02;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = sc.nextLine();
        sc.close();

        if (checkHexStr(inStr)) {
            System.out.print(inStr + " is a hex string");
        } else {
            System.out.print(inStr + " is NOT a hex string");
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
}
