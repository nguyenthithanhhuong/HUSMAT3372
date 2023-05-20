package oop.lab11.iterator.ex1;

public class ArrayProductsCatalog implements ProductCatalog {
    private String[] product;
    private int length;

    public ArrayProductsCatalog() {
        this.product = new String[100];
        this.length = 0;
    }

    @Override
    public void add(String product) {
        this.product[this.length] = product;
        this.length++;
    }

    public void remove(int index) {
        for (int i = index; i < this.length - 1; i++) {
            this.product[i] = this.product[i + 1];
        }
        this.product[this.length - 1] = null;
        this.length--;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this.product, this.length);
    }
}
