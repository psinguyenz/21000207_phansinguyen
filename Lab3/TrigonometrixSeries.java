import java.lang.Math;

public class TrigonometrixSeries {
    public static double sin(double x, int numTerms) {
        int count = 1;
        for (int idx = 2; idx < numTerms; idx++) {
            if (idx % 2 == 1) {
                int mul = 1;
                for (int i = 0; i < idx; i++) {
                    mul = mul * i;
                }
                x += Math.pow(-1, count) * (Math.pow(x, (double) idx) / mul);
                count += 1;
            }
        }
        return x;
    }

    public static double cos(double x, int numTerms) {
        int count = 1;
        for (int idx = 2; idx < numTerms; idx++) {
            if (idx % 2 == 0) {
                int mul = 1;
                for (int i = 0; i < idx; i++) {
                    mul = mul * i;
                }
                x += Math.pow(-1, count) * (Math.pow(x, (double) idx) / mul);
                count += 1;
            }
        }
        return 1 - x;
    }
}
