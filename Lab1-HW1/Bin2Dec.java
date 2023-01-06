import java.util.*;
public class Bin2Dec {
    public static boolean isBinaryNumber(int num)
    {
        if (num == 0 || num == 1|| num < 0) 
        {
            return false;
        }
        while (num != 0) 
        {
            if (num % 10 > 1) 
            {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        int binary = in.nextInt();
        int binaryOrg = binary;
        int decimal = 0;  
        int n = 0;  
        if (isBinaryNumber(binary) == true)
        {
            while(true){  
                if(binary == 0)
                {  
                    break;  
                } 
                else 
                {  
                    int temp = binary%10;  
                    decimal += temp*Math.pow(2, n);  
                    binary = binary/10;  
                    n++;  
                }  
            }  
            System.out.print("The equivalent decimal number for binary \"" + binaryOrg + "\" is: ");
            System.out.print(decimal);
        }
        else 
        {
            System.out.print("error: invalid binary string \"" + binaryOrg + "\"");
        }
    }
}