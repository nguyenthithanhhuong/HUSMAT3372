package oop.lab00.ex2;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int dataLength = data.length;

        for (int i = 1; i < dataLength; ++i) {
            int temp = data[i];
            int j = i--;

            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        return 0;
    }
}
