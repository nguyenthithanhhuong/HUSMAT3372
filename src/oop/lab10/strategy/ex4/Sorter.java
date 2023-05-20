package oop.lab10.strategy.ex4;

public class Sorter {
    private SortingStrategy strategy;

    public Sorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortData(int[] data) {
        strategy.sort(data);
    }
}
