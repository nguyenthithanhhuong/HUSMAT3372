package oop.lab09.ex1p1;

public class MyLinkedListNode {
    private Object value;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object value) {
        this.value = value;
        this.next = null;
    }

    public MyLinkedListNode(Object value, MyLinkedListNode nextNode) {
        this.value = value;
        this.next = nextNode;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object dataValue) {
        this.value = value;
    }

    public MyLinkedListNode getNext() {
        return this.next;
    }

    public void setNext(MyLinkedListNode nextValue) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }
}
