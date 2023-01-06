public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int remainder(int a, int b) {
        if (a >= b) {
            return a % b;
        }
        return b % a;
    }

    public static void main(String args[]) {
        System.out.println(gcd(35,30));
    }
}
