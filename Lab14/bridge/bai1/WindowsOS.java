package designpattern.bridge.bai1;

public class WindowsOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("WindowsOS starting up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("WindowsOS loading url!");
    }
}
