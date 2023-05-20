package oop.lab11.abstractfactory.ex2;

public class MacOSFactory implements  GUIFactory {

    @Override
    public OperatingSystem createOperatingSystem() {
        return new MacOS();
    }

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
