package oop.lab05.ex2p4.service;

public class Invoice {
    int id;
    Customer customer;
    double amount;

    public Invoice() {
        id = 0;
        customer = new Customer();
        amount = 0.0;
    }

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount ) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getID();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return (this.amount - (this.amount*this.customer.getDiscount()/100));
    }

    public String toString() {
        return "Invoice[id=" + this.id + ",customer=" + this.customer.toString() + ",amount=" + this.amount + "]";
    }
}
