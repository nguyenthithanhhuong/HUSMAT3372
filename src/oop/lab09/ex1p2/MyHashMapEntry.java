package oop.lab09.ex1p2;

public class MyHashMapEntry {
    private final Object key;
    private final Object value;

    MyHashMapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }
}
