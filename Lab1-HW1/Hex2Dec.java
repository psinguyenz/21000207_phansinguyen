import java.util.*;
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hex = in.next();   
        int count = 0;
        for (int i=0; i<hex.length(); i++)
        {
            char ch = hex.charAt(i);
            if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f')))
            {
                count += 1;
            }
        }
        if (count==0)
        {
            hex = hex.toUpperCase();  
            int decimal = 0;  
            String hexString = "0123456789ABCDEF";
            for (int i = 0; i < hex.length(); i++)  
            {  
                char c = hex.charAt(i);  
                int d = hexString.indexOf(c);  
                decimal = 16*decimal + d;  
            }  
            System.out.print("The equivalent decimal number for hexadecimal \"" + hex + "\" is: ");
            System.out.print(decimal);
        }
        else if (count!=0)
        {
            System.out.print("error: invalid hexadecimal string \"" + hex + "\"");
        }
    }
}