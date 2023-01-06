import java.util.*;

public class PerfectNumberList {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperbound = in.nextInt();
        System.out.println("These numbers are perfect: ");
        int count = 0;
        for (int i = 1; i <= upperbound; i++) {
            if (isPerfect(i) == true) {
                count += 1;
                System.out.print(i + " ");
            }
        }
        double rate = ((double) count / upperbound) * 100;
        System.out.println();
        System.out.print("[");
        System.out.print(count + " perfect numbers found (");
        System.out.printf("%.2f", rate);
        System.out.println("%)]");
        System.out.println();
        System.out.println("These numbers are neither deficient nor perfect: ");
        count = 0;
        for (int i = 1; i <= upperbound; i++) {
            if (isDeficient(i) == false) {
                if (isPerfect(i) == false) {
                    count += 1;
                    System.out.print(i + " ");
                }
            }
        }
        rate = ((double) count / upperbound) * 100;
        System.out.println();
        System.out.print("[");
        System.out.print(count + " numbers found (");
        System.out.printf("%.2f", rate);
        System.out.println("%)]");
    }
}
