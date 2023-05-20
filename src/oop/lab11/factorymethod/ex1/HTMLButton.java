package oop.lab11.factorymethod.ex1;

public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("Render button HTML");
    }

    @Override
    public void onClick() {
        System.out.println("HTML click event");
    }
}
