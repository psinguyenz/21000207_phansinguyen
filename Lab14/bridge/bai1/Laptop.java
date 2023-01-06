package designpattern.bridge.bai1;

public class Laptop extends Computer{
    private boolean on = false;
    protected OperatingSystem os;

    public Laptop() {};

    public Laptop(OperatingSystem os) {
        this.os = os;
    }

    @Override
    public void startup() {
        on = true;
    }

    @Override
    public void browseInternet(String url) {
        System.out.println("Accessing: " + url);
        this.os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}
