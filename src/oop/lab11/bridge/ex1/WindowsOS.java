package oop.lab11.bridge.ex1;

public class WindowsOS implements OperatingSystem {

    @Override
    public void startup() {
        System.out.println("Start WindowOS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load url WindowOS" + url);
    }
}
