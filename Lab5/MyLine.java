public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        int[] XY = new int[2];
        XY[0] = this.getBeginX();
        XY[1] = this.getBeginY();
        return XY;
    }

    public int[] getEndXY() {
        int[] XY = new int[2];
        XY[0] = this.getEndX();
        XY[1] = this.getEndY();
        return XY;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        double len = begin.distance(end);
        return len;
    }

    public double getGradient() {
        int x1 = getBeginX();
        int x2 = getEndX();
        double xDiff = Math.abs(x1-x2);
        int y1 = getBeginY();
        int y2 = getEndY();
        double yDiff = Math.abs(y1-y2);
        double gra = Math.atan2(xDiff, yDiff);
        return gra;
    }

    @Override
    public String toString() {
        return "MyLine[" +
                "begin=" + begin +
                ", end=" + end +
                ']';
    }
}
