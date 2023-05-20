package oop.lab11.visitor.ex2;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
