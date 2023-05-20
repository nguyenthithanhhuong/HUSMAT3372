package oop.lab11.abstractfactory.ex2;

public class WindowsOSFactory implements GUIFactory {

    @Override
    public OperatingSystem createOperatingSystem() {
        return new WindowsOS();
    }

    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }
}
