package oop.lab09.ex2p1;

public class Book extends Item {
    private int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public String toString() {
        return "Book[" + "pages=" + this.pages
                + ", title=" + this.getTitle() + "\'"
                + ", year=" + this.getYear() + "]";
    }
}
