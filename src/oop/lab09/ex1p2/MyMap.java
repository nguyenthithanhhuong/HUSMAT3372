package oop.lab09.ex1p2;

public interface MyMap {
    Object get(Object key) ;
    void put(Object key, Object value);
    void remove(Object key);
    boolean contains(Object key);
    int size();
}
