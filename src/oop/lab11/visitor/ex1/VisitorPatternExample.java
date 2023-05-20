package oop.lab11.visitor.ex1;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        BusinessBook businessBook = new BusinessBook();
        businessBook.accept(visitor);

        DesignPatternBook designPatternBook = new DesignPatternBook();
        designPatternBook.accept(visitor);

        JavaCoreBook javaCoreBook = new JavaCoreBook();
        javaCoreBook.accept(visitor);
    }
}
