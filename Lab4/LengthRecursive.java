public class LengthRecursive {
    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n-1) + numOfDigits(n);
    }

    public static int numOfDigits(int n) {
        int numOfDi = 0;
        while (n > 0) {
            numOfDi += 1;
            n = n/10;
        }
        return numOfDi;
    }

    public static void main (String args[]) {
        System.out.println(len(11));
    }
}
