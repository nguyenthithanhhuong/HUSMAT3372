package oop.lab05.ex2p2.service;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        super();
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        super();
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String result = "Book[name=" + this.name
                + ",authors = {";
        for (int i = 0; i < this.authors.length - 1; i++) {
            result += authors[i].toString() + ", ";
        }
        result += authors[authors.length - 1] + "},price=" + this.price
                + ",qty=" + this.qty + "]";
        return result;
    }

    public String getAuthorNames() {
        String result = "";
        for (int i = 0; i < this.authors.length - 1; i++) {
            result += authors[i] + ",";
        }
        result += authors[authors.length - 1];
        return result;
    }
}
