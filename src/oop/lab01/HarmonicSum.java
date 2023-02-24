package oop.lab01;

public class HarmonicSum {
    public static void main(String[] args) {
        final int maxDenominator = 100000;

        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += (1.0/denominator);
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        for (int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += (1.0/denominator);
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
    }
}
