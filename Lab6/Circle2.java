public class Circle2 extends Shape {
    private double radius;

    public Circle2() { //default constructor
        super();
        this.radius = 1.0;
        System.out.println("Default constructor called");
    }

    public Circle2(double radius) {
        super();
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { //getters
        return radius;
    }

    public void setRadius(double radius) { //setters
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ", radius=" + radius +
                ']';
    }
}
