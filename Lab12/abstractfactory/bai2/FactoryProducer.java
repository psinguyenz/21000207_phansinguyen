package abstractfactory.bai2;

public class FactoryProducer {
    public AbstractFactory getFactory(String type) {
        if(type.equals("Rounded")) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
