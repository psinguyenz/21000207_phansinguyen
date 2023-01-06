package designpattern.decorator.bai2;

public class Demo {
    public static void main(String[] args) {
        VanillaIceCream vanillaIceCream = new VanillaIceCream();
        System.out.println(vanillaIceCream.getDescription());
        ToppingDecorator toppingDecorator = new ToppingDecorator(vanillaIceCream);
        HoneyToppingDecorator toppingDecorator1 = new HoneyToppingDecorator(vanillaIceCream);
        System.out.println(toppingDecorator.getDescription());
        System.out.println(toppingDecorator1.getDescription());
        NutsToppingDecorator toppingDecorator2 = new NutsToppingDecorator(toppingDecorator1);
        System.out.println(toppingDecorator2.getDescription());
    }
}
