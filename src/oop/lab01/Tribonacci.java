package oop.lab01;

public class Tribonacci {
    public static void main(String[] args) {
        int nMax = 20;
        PrintTribonacci(nMax);
    }

    public static void PrintTribonacci(int nMax) {
        int n = 4;
        int tn;
        int tnMinus1 = 1;
        int tnMinus2 = 1;
        int tnMinus3 = 2;
        int sum = tnMinus1 + tnMinus2 + tnMinus3;
        double average;

        System.out.println("The first " + nMax + " Tribonacci numbers are: ");
        System.out.print(tnMinus1 + " ");
        System.out.print(tnMinus2 + " ");
        System.out.print(tnMinus3 + " ");

        while (n <= nMax) {
            tn = tnMinus1 + tnMinus2 + tnMinus3;
            System.out.print(tn + " ");
            sum += tn;
            ++n;
            tnMinus1 = tnMinus2;
            tnMinus2 = tnMinus3;
            tnMinus3 = tn;
        }
        average = sum*1.0/nMax;
        System.out.println();
        System.out.println("The average is " + average);
    }
}
