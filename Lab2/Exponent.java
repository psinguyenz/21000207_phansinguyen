import java.util.*;

public class Exponent {
    public static int exponent(int base, int exp) {
        int answer = 1;
        for (int idx = 0; idx < exp; idx++) {
            answer = answer * base;
        }
        return answer;
    }

    public static void main(String args[]) {
        int exp;
        int base;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the exponent: ");
        exp = in.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }
}
