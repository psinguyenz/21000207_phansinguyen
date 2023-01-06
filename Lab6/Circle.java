public class Circle {
    private double radius;
    private String color;

    public Circle() { //default constructor
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Default constructor called");
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() { //getters
        return radius;
    }

    public void setRadius(double radius) { //setters
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * this.radius;
    }
    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle").append("[")
                .append("radius= ").append(this.radius)
                .append(" color= ").append(this.color)
                .append("]");
        return description.toString();
    }
}
