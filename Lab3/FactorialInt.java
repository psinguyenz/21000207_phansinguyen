
public class FactorialInt {

    public static void main(String[] args) {
        allFactorialInt();
    }

    public static void allFactorialInt() {
        int n = 0;
        int fact = 1;
        int maxInt = Integer.MAX_VALUE;
        while (maxInt / fact >= n + 1) {
            fact = fact * (n + 1);
            n = n + 1;
            System.out.println("The factorial of " + n + " is " + fact);

        }
        System.out.println("The factorial of " + (n + 1) + " is out of range");


    }
}
