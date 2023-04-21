package oop.lab09.ex2p1;

public abstract class Item {
    private String title;
    private int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return "Item[" + "title=" + this.title + "\'"
                + ", year=" + this.year + "]";
    }
}
