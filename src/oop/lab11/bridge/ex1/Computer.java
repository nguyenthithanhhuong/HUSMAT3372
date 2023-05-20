package oop.lab11.bridge.ex1;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void startup();
    public abstract void browseInternet(String url);
    public abstract boolean canMoveCompute();
}
