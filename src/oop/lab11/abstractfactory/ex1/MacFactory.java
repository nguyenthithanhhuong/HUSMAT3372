package oop.lab11.abstractfactory.ex1;

public class MacFactory implements GUIFactory {
    public Button createButton() {
        Button macButton = new MacButton();
        return macButton;
    }

    @Override
    public Checkbox createCheckBox() {
        Checkbox macCheckbox = new MacCheckbox();
        return macCheckbox;
    }
}
