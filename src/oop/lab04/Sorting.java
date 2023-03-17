package oop.lab04;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 9, 8, 5};
        selectionSort(arr);
        bubbleSort(arr);
        insertionSort(arr);
    }

    // 2.3 Selection Sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minIdx = j;
                }
            }

            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
        System.out.print("Array after use Selection Sort: ");
        printArray(array);
        System.out.println();
    }

    // 2.4 Bubble Sort
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Array after use Bubble Sort: ");
        printArray(array);
        System.out.println();
    }

    // 2.5 Insertion Sort
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.print("Array after use Insertion Sort: ");
        printArray(array);
        System.out.println();
    }

    // Print Array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
