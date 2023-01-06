import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static boolean isPrime(int aPosInt) {
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                if (isPrime(i) == true) {
                    product *= i;
                }
            }
        }
        if (product == aPosInt) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperbound = in.nextInt();
        int count = 0;
        for (int i = 1; i <= upperbound; i++) {
            if (isProductOfPrimeFactors(i) == true) {
                count += 1;
                System.out.println(i);
            }
        }
        double rate = ((double) count / upperbound) * 100;
        System.out.println();
        System.out.print("[");
        System.out.print(count + " numbers found (");
        System.out.printf("%.2f", rate);
        System.out.println("%)]");
    }
}
