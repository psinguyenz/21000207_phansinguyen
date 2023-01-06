public class TestMyTriangle {
    public static void main(String args[]) {
        MyTriangle triangle = new MyTriangle(0,0,1,1,2,2);
        double peri = triangle.getPerimeter();
        System.out.println(peri);
        String type = triangle.getType();
        System.out.println(type);
    }
}
