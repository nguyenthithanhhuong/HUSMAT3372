package oop.lab04;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 3};
        int key = 7;
        System.out.println(linearSearch(arr, key));
        System.out.println(linearSearchIndex(arr, key));
        sortArray(arr);
        System.out.println(binarySearch(arr, key, 0, arr.length - 1));
    }

    // 2.1 Linear Search
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i + 1;
            }
        }
        return 0;
    }

    // 2.2 Binary Search
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        while (fromIdx <= toIdx) {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            }
            if (key < array[middleIdx]) {
                toIdx = middleIdx - 1;
            } else {
                fromIdx = middleIdx + 1;
            }
        }
        return false;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
