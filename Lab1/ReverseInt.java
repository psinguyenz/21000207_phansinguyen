import java.util.*;
public class ReverseInt {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        System.out.print("The reverse is: ");
        while (n>0) {
            int digit = n % 10;
            System.out.print(digit);
            n = n/10;
        }
    }
}