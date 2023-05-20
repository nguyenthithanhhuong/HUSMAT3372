package oop.lab11.abstractfactory.ex1;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
        this.button = null;
    }
    public void createUI() {
        this.button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
