package oop.lab05.ex2p5.service;

public class Customer {
    int ID;
    String name;
    char gender;

    public Customer() {
        ID = 0;
        name = "";
        gender = 'm';
    }

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
    }
}
