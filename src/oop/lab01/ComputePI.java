package oop.lab01;

public class ComputePI {
    public static void main(String[] args) {
        int maxDenominator1000 = 1000;
        int maxDenominator10000 = 10000;
        int maxDenominator100000 = 100000;
        int maxDenominator1000000 = 1000000;

        System.out.println("The value of pi use the maximum denominator of " + maxDenominator1000 + " is: " + ComputeTheValueOfPI(maxDenominator1000));
        System.out.println("The value of pi use the maximum denominator of " + maxDenominator10000 + " is: " + ComputeTheValueOfPI(maxDenominator10000));
        System.out.println("The value of pi use the maximum denominator of " + maxDenominator100000 + " is: " +  ComputeTheValueOfPI(maxDenominator100000));
        System.out.println("The value of pi use the maximum denominator of " + maxDenominator1000000 + " is: " + ComputeTheValueOfPI(maxDenominator1000000));
    }

    public static double ComputeTheValueOfPI(int maxDenominator) {
        double sum = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            if (denominator % 4 == 1) {
                sum += (1.0/denominator);
            }
            if (denominator % 4 == 3) {
                sum -= (1.0/denominator);
            }
        }
        return 4*sum;
    }
}
