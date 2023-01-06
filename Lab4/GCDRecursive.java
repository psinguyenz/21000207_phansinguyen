public class GCDRecursive {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b , remainder(a , b));
    }

    public static int remainder(int a, int b) {
        if (a >= b) {
            return a % b;
        }
        return b % a;
    }

    public static void main(String args[]) {
        System.out.println(gcd(30,35));
    }
}
