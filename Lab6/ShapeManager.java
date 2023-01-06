public class ShapeManager {
    public static void main(String args[]) {
        Circle2 circle = new Circle2(1.0);
        System.out.println(circle);
        Square square = new Square(5);
        System.out.println(square);
        System.out.println(square.getArea());
    }
}
