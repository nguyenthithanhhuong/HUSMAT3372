package oop.lab09.ex1p2;

public class MyHashMap implements MyMap {
    private final static int INITIAL_SIZE = 8;
    private MyHashMapEntry[] table;
    private int size;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
        this.size = 0;
    }

    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }
        int bucket =getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (table[i] == key) {
                index = i;
            }
        }

        for (int i = index; i < size; i++) {
            table[i] = table[i++];
        }
        size--;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (table[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio() {
        return this.size / (double) table.length;
    }

    void enlarge() {
        MyHashMapEntry[] temp = new MyHashMapEntry[table.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = table[i];
        }
        table = temp;
    }
}
