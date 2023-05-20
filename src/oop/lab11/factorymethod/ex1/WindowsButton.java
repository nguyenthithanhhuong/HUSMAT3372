package oop.lab11.factorymethod.ex1;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Render button Windows");
    }

    @Override
    public void onClick() {
        System.out.println("Windows click event");
    }
}
