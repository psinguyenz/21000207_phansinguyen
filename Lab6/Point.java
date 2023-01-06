public class Point {
    private int x;
    private int y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] XY = new int[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }

    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another) {
        int x_new = another.getX();
        int y_new = another.getY();
        double output = Math.sqrt(Math.pow((x_new - this.x), 2) + Math.pow((y_new - this.y), 2));
        return output;
    }

    @Override
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }
}
