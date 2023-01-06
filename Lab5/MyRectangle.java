public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    private MyPoint topRight;
    private MyPoint bottomLeft;


    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
        this.topRight = new MyPoint(x2, y1);
        this.bottomLeft = new MyPoint(x1, y2);

    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight, MyPoint topRight, MyPoint bottomLeft) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
    }

    public double getPerimeter() {
        double len1 = topLeft.distance(bottomLeft);
        double len2 = topLeft.distance(topRight);
        return (len1 + len2)*2;
    }

    public double getArea() {
        double len1 = topLeft.distance(bottomLeft);
        double len2 = topLeft.distance(topRight);
        return (len1 * len2);
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + topLeft +
                ", v2=" + bottomRight +
                ", v3=" + topRight +
                ']';
    }
}
