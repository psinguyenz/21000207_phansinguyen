package abstractfactory.bai2;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if(type.equals("Rectangle")) {
            return new RoundedRectangle();
        }
        return new RoundedSquare();
    }
}
