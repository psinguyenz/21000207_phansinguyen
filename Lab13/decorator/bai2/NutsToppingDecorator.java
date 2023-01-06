package designpattern.decorator.bai2;

public class NutsToppingDecorator extends ToppingDecorator{
    public IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " add nuts";
    }
}

