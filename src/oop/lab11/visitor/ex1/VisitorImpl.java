package oop.lab11.visitor.ex1;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(BusinessBook book) {
        System.out.println("Business book");
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Design Pattern book");
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("Java Core book");
    }
}
