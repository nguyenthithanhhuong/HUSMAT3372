package oop.lab05.ex1p6.service;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account() {
        this.id = "";
        this.name = "";
        this.balance = 0;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance += amount;
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String toString() {
        return "Account[id=" + this.id
                + ",name=" + this.name
                + ",balance=" + this.balance + "]";
    }
}
