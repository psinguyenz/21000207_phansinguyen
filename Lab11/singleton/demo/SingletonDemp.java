package designpattern.singleton.demo;

public class SingletonDemp {
    private static SingletonDemp instances;
    public static String value;

    private SingletonDemp(String value) {
        this.value = value;
    }

    public static SingletonDemp getInstances(String value) {
        if(instances == null) {
            instances = new SingletonDemp(value);
        }
        return instances;
    }
}

