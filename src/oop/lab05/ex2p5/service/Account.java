package oop.lab05.ex2p5.service;

public class Account {
    int id;
    Customer customer;
    double balance;

    public Account() {
        id = 0;
        customer = new Customer();
        balance = 0.0;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getID() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return this.customer.toString()
                + " balance=" + this.balance;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdraw exceeds the current balance!");
        }

        return this;
    }
}
