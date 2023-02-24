package oop.lab01;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int lowerBound = 1;
        final int upperBound = 100;

        System.out.println("The average use for-loop is: " + SumAverageUseForLoop(lowerBound, upperBound));
        System.out.println("The average use do-while loop is: " + SumAverageUseDoWhileLoop(lowerBound, upperBound));
    }

    // Use a for-loop to sum-average from lowerbound to upperbound
    public static double SumAverageUseForLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }
        return (double) (sum/count);
    }

    public static double SumAverageUseDoWhileLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = lowerBound;
        do {
            sum += count;
            count++;
        } while (count <= upperBound);
        return (double) (sum/count);
    }
}
