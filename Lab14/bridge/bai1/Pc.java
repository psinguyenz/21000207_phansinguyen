package designpattern.bridge.bai1;

public class Pc extends Computer{
    private boolean on = false;
    protected OperatingSystem os;

    public Pc() {};

    public Pc(OperatingSystem os) {
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
