package oop.lab05.ex2p1.cline;

import oop.lab05.ex2p1.service.Author;
import oop.lab05.ex2p1.service.Book;

public class TestMain {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java For Dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        System.out.println("Quantity is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
    }
}
