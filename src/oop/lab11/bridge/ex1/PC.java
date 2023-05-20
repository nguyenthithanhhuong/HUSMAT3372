package oop.lab11.bridge.ex1;

public class PC extends Computer {
    public PC(OperatingSystem os) {
        super(os);
    }
    @Override
    public void startup() {
        System.out.print("Start PC");
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        System.out.print("Browse internet PC ");
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveCompute() {
        return false;
    }
}
