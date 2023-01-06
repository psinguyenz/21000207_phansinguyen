package Bai1;

public class MyMath {
    public MyMath() {}

    public static double cos(double x){
        double sum = 1.0;
        double minus = -1.0;
        for(int i = 2; i<10 ; i++) {
            if(i%2==0) {
                int value = 1;
                for (int j = 1; j <= i; j++) {
                    value *= j;
                }
                sum += minus * (Math.pow(x, i) / value);
                minus = minus * (-1);
            }
        }
        return sum;
    }

    public static double exp(double x) {
        double sum = 1.0;
        for(int i = 1; i<10; i++) {
            int value = 1;
            for(int j=1; j<=i; j++) {
                value *= j;
            }
            sum += (Math.pow(x, i)/value);
        }
        return sum;
    }

    public static void main(String[] args) {
        double test = cos(3.3);
        double test2 = exp(2.2);
        System.out.println("e^2.2 * cos(3.3) = " + test*test2);
        System.out.println("Ham trong thu vien Java = " + Math.cos(3.3) * Math.exp(2.2));
    }
}
