package bai2;
public class RectangleGeo implements GeometricObject {
    private double length;
    private double width;

    RectangleGeo(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "RectangleGeo[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
}
