import java.util.*;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hex = in.next();
        int count = 0;
        for (int idx = 0; idx < hex.length(); idx++) {
            char ch = hex.charAt(idx);
            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
                count += 1;
            }
        }
        if (count == 0) {
            hex = hex.toUpperCase();
            int decimal = 0;
            String hexString = "0123456789ABCDEF";
            final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                    "0100", "0101", "0110", "0111",
                    "1000", "1001", "1010", "1011",
                    "1100", "1101", "1110", "1111"};
            System.out.print("The equivalent binary for hexadecimel \"" + hex + "\" is: ");
            for (int idx = 0; idx < hex.length(); idx++) {
                char c = hex.charAt(idx);
                if (c >= '0' && c <= '9') {
                    System.out.print(HEX_BITS[(c - 48)] + " ");
                }
                if (c == 'A') {
                    System.out.print(HEX_BITS[10] + " ");
                }
                if (c == 'B') {
                    System.out.print(HEX_BITS[11] + " ");
                }
                if (c == 'C') {
                    System.out.print(HEX_BITS[12] + " ");
                }
                if (c == 'D') {
                    System.out.print(HEX_BITS[13] + " ");
                }
                if (c == 'E') {
                    System.out.print(HEX_BITS[14] + " ");
                }
                if (c == 'F') {
                    System.out.print(HEX_BITS[15] + " ");
                }
            }

        } else if (count != 0) {
            System.out.print("error: invalid hexadecimal string \"" + hex + "\"");
        }
    }
}