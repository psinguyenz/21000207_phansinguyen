package abstractfactory.bai2;

public class App {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory roundedShapeFactory = producer.getFactory("Rounded");
        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");

        AbstractFactory ShapeFactory = producer.getFactory("Not Rounded");
        Shape notRoundedSquare = roundedShapeFactory.getShape("Square");
    }
}
