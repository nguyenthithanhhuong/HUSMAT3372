package oop.lab11.bridge.ex1;

public class MacOS implements OperatingSystem {

    @Override
    public void startup() {
        System.out.println("Start MacOS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load url MacOS " + url);
    }
}
