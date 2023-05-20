package oop.lab11.abstractfactory.ex1;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        Button winButton = new WinButton();
        return winButton;
    }

    @Override
    public Checkbox createCheckBox() {
        Checkbox winCheckbox = new WinCheckbox();
        return winCheckbox;
    }
}
