public class TestMyRectangle {
    public static void main(String args[]) {
        MyRectangle rectangle = new MyRectangle(4,0,0,2);
        double peri = rectangle.getPerimeter();
        System.out.println(peri);
        double area = rectangle.getArea();
        System.out.println(area);
    }
}
