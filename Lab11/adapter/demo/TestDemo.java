package designpattern.adapter.demo;

public class TestDemo {
    public static void main(String[] args) {
        Tree tree = new Tree("Johnny");
        Water water = new Water("clean");
        System.out.println(tree.canBeWater(water));

        DirtyWater dirtyWater = new DirtyWater("dirty");
        Water adapter = new Filter(dirtyWater);
        System.out.println(tree.canBeWater(adapter));
    }
}
