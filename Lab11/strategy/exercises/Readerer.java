package designpattern.strategy.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Readerer {
    private static BufferedReader instance;

    private Readerer() {

    }

    public static BufferedReader getInstance() {
        if(instance == null) {
            instance = new BufferedReader(new InputStreamReader(System.in));
        }
        return instance;
    }
}
