package oop.lab10.strategy.ex4;

public class Main {
    public static void main(String[] args) {
        int[] data = {3, 6, 9, 5};

        SortingStrategy quickSort = new QuickSort();
        Sorter sorter = new Sorter(quickSort);
        sorter.sortData(data);

        SortingStrategy mergeSort = new MergeSort();
        sorter = new Sorter(mergeSort);
        sorter.sortData(data);
    }
}
