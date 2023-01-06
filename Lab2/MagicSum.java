import java.util.*;

public class MagicSum {
    public static boolean hasEight(int number) {
        String num = Integer.toString(number);
        for (int idx = 0; idx < num.length(); idx++) {
            if (num.charAt(idx) == '8') {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int number = 1;
        Scanner in = new Scanner(System.in);
        final int SENTINEL = -1;
        int sum = 0;
        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
            if (hasEight(number) == true) {
                sum += number;
            }
        }
        System.out.print("The magic sum is: " + sum);
    }
}
