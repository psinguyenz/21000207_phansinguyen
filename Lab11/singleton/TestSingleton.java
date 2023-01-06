package designpattern.singleton;

import javax.xml.crypto.Data;

public class TestSingleton {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        System.out.println(db1);

        Database db2 = Database.getInstance();
        System.out.println(db2);
    }
}
