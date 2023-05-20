package oop.lab11.factorymethod.ex1;

public class Application {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();
    }
}
