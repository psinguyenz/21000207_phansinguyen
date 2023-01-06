package abstractfactory.bai2;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if(type.equals("Rectangle")) {
            return new Rectangle();
        }
        return new Square();
    }
}
