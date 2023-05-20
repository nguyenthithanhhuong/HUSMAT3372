package oop.lab11.bridge.ex1;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }
    @Override
    public void startup() {
        System.out.print("Start Laptop");
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        System.out.print("Browse internet laptop ");
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveCompute() {
        return true;
    }
}
