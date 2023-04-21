package oop.lab09.ex1p1;

public class MyArrayList extends MyAbstractList{
    final static int DEFAULT_CAPACITY = 16;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size > elements.length - 1) {
            this.enlarge();
        }
        elements[size] = o;
        size++;
    }

    @Override
    public void add(Object o, int index) {
        if (size > elements.length - 1) {
            this.enlarge();
        }
        this.checkBoundaries(index, size + 1);
        for (int i = size - 1; i >= index; i--) {
            elements[i++] = elements[i];
            elements[index] = o;
        }
        size++;
    }

    @Override
    public Object get(int index) {
        this.checkBoundaries(index, size);
        return elements[index];
    }

    @Override
    public void remove(int index) {
        this.checkBoundaries(index, size);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i++];
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    private void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0 , tmp, 0, elements.length);
        elements = tmp;
    }
}
