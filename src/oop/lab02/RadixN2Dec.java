package oop.lab02;

import java.util.Locale;
import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if (checkRadix(str, radix)) {
            System.out.printf("The equivalent decimal number \"%s\" is: %d", str, radixN2Dec(str, radix));
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean checkRadix(String str, int radix) {
        String[] chars = {"" , "0", "01", "012", "0123", "01234", "012345", "0123456",
                "01234567", "012345678", "0123456789", "0123456789A", "0123456789AB", "0123456789ABC",
                "0123456789ABCD", "0123456789ABCDE", "0123456789ABCDEF"};
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (chars[radix].indexOf(str.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int radixN2DecChar(char ch, int radix) {
        String digits = "0123456789";
        String chars = "ABCDEF";
        if (digits.indexOf(ch) != -1) {
            return ch - '0';
        } else if (chars.indexOf(ch) != -1) {
            return 10 + (ch - 'A');
        } else {
            return 0;
        }
    }

    public static int radixN2Dec(String str, int radix) {
        str = str.toUpperCase();
        int decimal = 0;
        int temp = 1;
        for (int index = str.length() - 1; index >= 0; index--) {
            decimal += (radixN2DecChar(str.charAt(index), radix)) * temp;
            temp *= radix;
        }
        return decimal;
    }
}
