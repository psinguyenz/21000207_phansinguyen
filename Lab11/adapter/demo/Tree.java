package designpattern.adapter.demo;

public class Tree {
    private String name;

    public Tree (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean canBeWater(Water water) {
        if (water.getClean() == "clean") {
            return true;
        }
        return false;
    }
}
