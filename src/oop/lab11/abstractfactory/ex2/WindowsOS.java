package oop.lab11.abstractfactory.ex2;

public class WindowsOS implements OperatingSystem {
    private String title;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void repaint() {
        System.out.println("WindowsOS repainted: " + this.title);
    }
}
