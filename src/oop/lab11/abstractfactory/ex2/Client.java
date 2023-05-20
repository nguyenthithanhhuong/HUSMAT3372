package oop.lab11.abstractfactory.ex2;

public class Client {
    public static void main(String[] args) {
        GUIFactory guiFactory = new MacOSFactory();

        OperatingSystem operatingSystem = guiFactory.createOperatingSystem();
        Button button = guiFactory.createButton();

        operatingSystem.setTitle("factory demo");
        button.render();
        operatingSystem.repaint();
    }
}
