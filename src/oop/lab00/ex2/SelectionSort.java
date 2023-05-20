package oop.lab00.ex2;

public class SelectionSort implements ISort {
    public SelectionSort() {

    }

    @Override
    public int sort(int[] data) {
        int dataLength = data.length;

        for (int i = 0; i < dataLength - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < dataLength; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
        return 0;
    }
}
