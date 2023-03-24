package oop.lab05.ex2p3.cline;

import oop.lab05.ex2p3.service.Author;
import oop.lab05.ex2p3.service.Book;

public class TestMain {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "AhTeck@nowwhere.com");
        System.out.println(author1);

        author1.setEmail("AhTeck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is : " + author1.getName());
        System.out.println("email is : " + author1.getEmail());

        Book book1 = new Book("12345", "Java for dummíes", author1, 8.8, 88);
        System.out.println(book1);

        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is : " + book1.getISBN());
        System.out.println(":name is : " + book1.getName());
        System.out.println("prince is : " + book1.getPrice());
        System.out.println("qty is : " + book1.getQty());
        System.out.println("author is : " + book1.getAuthor());

        System.out.println("author's name : " + book1.getAuthorName());
        System.out.println("author's name: " + book1.getAuthor().getName());
        System.out.println("author's email: " + book1.getAuthor().getEmail());
    }

}