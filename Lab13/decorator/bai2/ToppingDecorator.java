package designpattern.decorator.bai2;

public class ToppingDecorator implements IceCream{
    public IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    public String addTopping() {
        return null;
    }
}
