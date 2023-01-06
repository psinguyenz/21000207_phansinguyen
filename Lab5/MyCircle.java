public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle (MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] XY = new int[2];
        XY[0] = this.getCenterX();
        XY[1] = this.getCenterY();
        return XY;
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "radius=" + radius +
                ", center=" + center +
                ']';
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return this.radius * 2 * Math.PI;
    }

    public double distance(MyCircle another) {
        MyPoint newCenter = new MyPoint();
        newCenter = another.getCenter();
        int x1 = this.center.getX();
        int y1 = this.center.getY();
        int x2 = newCenter.getX();
        int y2 = newCenter.getY();
        double output = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y2 - y1), 2));
        return output;
    }
}
