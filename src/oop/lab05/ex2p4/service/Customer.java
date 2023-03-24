package oop.lab05.ex2p4.service;

public class Customer {
    int id;
    String name;
    int discount;

    public Customer() {
        id = 0;
        name = "";
        discount = 0;
    }

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return "name(" + this.id + ")(" + this.discount + "%)";
    }
}
