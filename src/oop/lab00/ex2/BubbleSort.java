package oop.lab00.ex2;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        int dataLength = data.length;

        for (int i = 0; i < dataLength - 1; i++) {
            for (int j = i + 1; j < dataLength; j++) {
                if (data[j] < data[i]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return 0;
    }
}
