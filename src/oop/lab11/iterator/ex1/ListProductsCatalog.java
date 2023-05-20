package oop.lab11.iterator.ex1;

import java.util.LinkedList;
import java.util.List;

public class ListProductsCatalog implements ProductCatalog {
    private List<String> product;

    public ListProductsCatalog() {
        this.product = new LinkedList<>();
    }

    @Override
    public void add(String product) {
        this.product.add(product);
    }

    @Override
    public void remove(int index) {
        this.product.remove(index);
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(this.product);
    }
}
