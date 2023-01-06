public class TestMyCircle {
    public static void main(String args[]) {
        MyCircle circle = new MyCircle(0,0,3);
        double area = circle.getArea();
        MyCircle circle2 = new MyCircle(0,0,3);
        int x1 = circle.getCenterX();
        int y1 = circle.getCenterY();
        int x2 = circle2.getCenterX();
        int y2 = circle2.getCenterY();
        System.out.println(x1);
        System.out.println(y1);
        circle.setCenterX(1);
        circle.setCenterY(1);
        circle2.setCenterX(0);
        circle2.setCenterY(0);
        int cc1[] = new int[2];
        cc1 = circle.getCenterXY();
        System.out.println(cc1[0]);
        System.out.println(cc1[1]);
        double cir = circle.getCircumference();
        System.out.println(area);
        System.out.println(cir);
        double dis = circle.distance(circle2);
        System.out.println(circle);
    }
}
