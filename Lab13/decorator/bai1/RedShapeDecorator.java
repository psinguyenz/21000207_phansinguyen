package designpattern.decorator.bai1;

public class RedShapeDecorator extends ShapeDecorator {
    public Shape shape;

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println(" with red border");
    }
}
