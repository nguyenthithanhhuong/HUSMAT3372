package oop.lab05.ex2p2.cline;

import oop.lab05.ex2p2.service.Author;
import oop.lab05.ex2p2.service.Book;

public class TestMain {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
