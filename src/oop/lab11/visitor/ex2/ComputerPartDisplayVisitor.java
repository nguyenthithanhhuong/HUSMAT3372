package oop.lab11.visitor.ex2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("display Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display Mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display Monitor");
    }
}
