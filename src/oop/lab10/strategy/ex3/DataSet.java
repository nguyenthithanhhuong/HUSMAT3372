package oop.lab10.strategy.ex3;

public class DataSet {
    private int[] data;
    private int[] originalData;

    private Sorter strategy;

    public DataSet() {
        this.data = new int[] {3, 1, 5, 2, 7};
        this.originalData = this.data.clone();
    }

    public void reset() {
        this.data = this.originalData.clone();
    }

    public void setStrategy(Sorter strategy) {
        this.strategy = strategy;
    }


    public void sort() {
    }
}
