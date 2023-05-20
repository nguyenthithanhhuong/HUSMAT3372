package oop.lab11.bridge.ex1;

public class Client {
    public static void main(String[] args) {
        OperatingSystem windowsOS = new WindowsOS();
        OperatingSystem macOS = new MacOS();

        Computer laptop = new Laptop(windowsOS);
        Computer pc = new PC(macOS);

        laptop.startup();
        pc.startup();

        laptop.browseInternet("google.com");
        pc.browseInternet("youtube.com");
    }
}
