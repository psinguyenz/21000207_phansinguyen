public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {
        double len1 = v1.distance(v2);
        double len2 = v2.distance(v3);
        double len3 = v3.distance(v1);
        return len1 + len2 + len3;
    }

    public String getType() {
        double len1 = v1.distance(v2);
        double len2 = v2.distance(v3);
        double len3 = v3.distance(v1);
        double compare12=Double.compare(len1, len2);
        if(compare12 > 0 || compare12 < 0){
            double compare23=Double.compare(len2, len3);
            if(compare23 > 0 || compare23 < 0) {
                return "Isosceles";
            }
            else {
                return "Equilateral";
            }
        }
        else {
            double compare32=Double.compare(len2, len3);
            if(compare32 > 0 || compare32 < 0) {
                double compare31=Double.compare(len1, len3);
                if(compare31 > 0 || compare31 < 0) {
                    return "Scalene";
                }
                else {
                    return "Isosceles";
                }
            }
            else {
                return "Isosceles";
            }
        }
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }
}
