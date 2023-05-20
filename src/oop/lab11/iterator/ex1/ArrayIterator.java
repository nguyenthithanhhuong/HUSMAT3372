package oop.lab11.iterator.ex1;

public class ArrayIterator implements Iterator {
    private String[] products;
    private int length;
    private int currentPosition;

    public ArrayIterator(String[] products, int length) {
        this.products = products;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return (this.currentPosition < this.length);
    }

    @Override
    public String next() {
        String currentProduct = this.products[this.currentPosition];
        this.currentPosition++;
        return currentProduct;
    }

    @Override
    public void remove() {
        System.out.println("Unsupported");
    }
}
