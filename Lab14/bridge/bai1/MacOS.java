package designpattern.bridge.bai1;

public class MacOS implements OperatingSystem{
    public MacOS() {}

    @Override
    public void startup() {
        System.out.println("MacOS starting up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("MacOS loading url!");
    }
}
