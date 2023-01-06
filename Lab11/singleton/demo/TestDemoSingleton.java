package designpattern.singleton.demo;

public class TestDemoSingleton {
    public static void main(String[] args) {
        SingletonDemp sd1 = SingletonDemp.getInstances("A");
        System.out.println(sd1);

        SingletonDemp sd2 = SingletonDemp.getInstances("B");
        System.out.println(sd2);
    }
}
