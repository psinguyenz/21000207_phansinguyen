import java.util.*;

public class Dec2Hex {
    public static String decimal2hex(int decimal) {
        String digits = "0123456789ABCDEF";
        if (decimal <= 0) return "0";
        int base = 16;
        String hex = "";
        while (decimal > 0) {
            int digit = decimal % base;
            hex = digits.charAt(digit) + hex;
            decimal = decimal / base;
        }
        return hex;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double decimalInput = in.nextDouble();
        int decimal = (int) decimalInput;
        String hex = decimal2hex(decimal);
        System.out.print("The equivalent hexadecimal number is " + hex);
    }
}