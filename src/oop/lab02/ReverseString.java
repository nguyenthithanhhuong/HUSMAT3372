package oop.lab02;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        sc.close();

        int inStrLen = inStr.length();

        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
