public class LineSub extends Point{
    Point end;
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin() {
        Point begin = new Point();
        begin.setX(super.getX());
        begin.setY(super.getY());
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public double getLength() {
        Point begin = new Point();
        begin.setX(this.getX());
        begin.setY(this.getY());
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

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    @Override
    public String toString() {
        return "LineSub{" + super.toString() +
                "end=" + end +
                '}';
    }
}
