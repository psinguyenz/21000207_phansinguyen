package factorymethod.bai2.factorysimple;

public class App {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit;
        fruit = fruitFactory.provideFruit("Apple");
        fruit.produceJuice();

        fruit = fruitFactory.provideFruit("Banana");
        fruit.produceJuice();
    }
}
