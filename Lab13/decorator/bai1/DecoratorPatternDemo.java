package designpattern.decorator.bai1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        System.out.println();
        RedShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        shapeDecorator.draw();
    }
}
