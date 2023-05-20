package oop.lab11.iterator.ex1;

import java.util.List;

public class ListIterator implements Iterator {
    private List<String> products;
    private int currentPosition;

    public ListIterator(List<String> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return (this.currentPosition < this.products.size());
    }

    @Override
    public String next() {
        String currentProduct = this.products.get(this.currentPosition);
        this.currentPosition++;
        return currentProduct;
    }

    @Override
    public void remove() {
        this.products.remove(this.currentPosition);
    }
}
