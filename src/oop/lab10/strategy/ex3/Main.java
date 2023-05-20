package oop.lab10.strategy.ex3;

public class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        System.out.println(dataSet);

        dataSet.setStrategy(new SelectionSort());
        dataSet.sort();
        System.out.println(dataSet);

        dataSet.reset();
        System.out.println(dataSet);

        dataSet.setStrategy(new InsertionSort());
        dataSet.sort();
        System.out.println(dataSet);

        dataSet.reset();
        System.out.println(dataSet);

        dataSet.setStrategy(new BubbleSort());
        dataSet.sort();
        System.out.println(dataSet);
    }
}
