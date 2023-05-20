package oop.lab00.ex2;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        int[] arr = randomArray();
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        printArray(arr);
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
    public static int[] randomArray() {
        Random rand = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        result += "]";
        System.out.println("Array with format: " + result);
    }
}
