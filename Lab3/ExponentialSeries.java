import java.lang.Math;

public class ExponentialSeries {
    public static double specialSeries(double x, int numTerms) {
        for (int idx = 0; idx < numTerms; idx++) {
            if (idx % 2 == 1) {
                double up = 1.0;
                for (int i = 0; i < idx; i++) {
                    if (idx % 2 == 1) {
                        up = up * i;
                    }
                }
                up = up * Math.pow(x, (double) idx);
                double down = 1.0;
                for (int i = 0; i < idx; i++) {
                    if (idx % 2 == 0) {
                        down = down * i;
                    }
                }
                down = down * idx;
                x += up / down;
            }
        }
        return x;
    }
}
