public class Circle2 {
    private double radius;

    public Circle2() { //default constructor
        this.radius = 1.0;
        System.out.println("Default constructor called");
    }

    public Circle2(double radius) {
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

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle").append("[")
                .append("radius= ").append(this.radius)
                .append("]");
        return description.toString();
    }
}
