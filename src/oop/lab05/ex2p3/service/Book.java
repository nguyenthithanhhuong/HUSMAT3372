package oop.lab05.ex2p3.service;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book() {
        this.isbn = "";
        this.name = "";
        this.author = new Author();
        this.price = 0.0;
        this.qty = 0;
    }

    public Book(String isbn, String name, Author author, double price) {
        super();
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        super();
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getISBN() {
        return this.isbn;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
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

    public String getAuthorName() {
        return "Book[isbn=" + this.isbn
                + ",name=" + this.name
                + "," + author.toString()
                + ",price=" + this.price
                + ",qty=" + this.qty;
    }
}
