package oop.lab11.visitor.ex1;

public class BusinessBook implements Book {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "Publisher";
    }
}
