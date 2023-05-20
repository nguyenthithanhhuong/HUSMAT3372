package oop.lab11.visitor.ex1;

public class DesignPatternBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return null;
    }

    public String getBestSeller() {
        return null;
    }
}
