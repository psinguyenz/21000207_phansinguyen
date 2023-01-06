package designpattern.decorator.bai2;

public class HoneyToppingDecorator extends ToppingDecorator{
    public IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " add honey";
    }
}
