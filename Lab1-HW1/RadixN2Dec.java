import java.util.*;
public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = in.nextInt();
        if(radix < 10)
        {
            System.out.print("Enter the string: ");
            int binary = in.nextInt();
            int binaryOrg = binary;
            int decimal = 0;  
            int n = 0;  
            if (isBinaryNumber(binary, radix) == true)
            {
                while(true){  
                    if(binary == 0)
                    {  
                        break;  
                    } 
                    else 
                    {  
                        int temp = binary%10;  
                        decimal += temp*Math.pow(radix, n);  
                        binary = binary/10;  
                        n++;  
                    }  
                }  
                System.out.print("The equivalent decimal number \"" + binaryOrg + "\" is: ");
                System.out.print(decimal);
            }
            else 
            {
                System.out.print("error: invalid string \"" + binaryOrg + "\"");
            }
        }
        if(radix >= 10 && radix <= 16)
        {
            System.out.print("Enter the string: ");
            String hex = in.next();   
            int count = 0;
            if(radix==16)
            {
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
                    System.out.print("The equivalent decimal number \"" + hex + "\" is: ");
                    System.out.print(decimal);
                }
                else if (count!=0)
                {
                    System.out.print("error: invalid string \"" + hex + "\"");
                }
            }
            else if(radix==15)
            {
                for (int i=0; i<hex.length(); i++)
                {
                    char ch = hex.charAt(i);
                    if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'E') || (ch >= 'a' && ch <= 'e')))
                    {
                        count += 1;
                    }
                }
                if (count==0)
                {
                    hex = hex.toUpperCase();  
                    int decimal = 0;  
                    String hexString = "0123456789ABCDE";
                    for (int i = 0; i < hex.length(); i++)  
                    {  
                        char c = hex.charAt(i);  
                        int d = hexString.indexOf(c);  
                        decimal = 15*decimal + d;  
                    }  
                    System.out.print("The equivalent decimal number \"" + hex + "\" is: ");
                    System.out.print(decimal);
                }
                else if (count!=0)
                {
                    System.out.print("error: invalid string \"" + hex + "\"");
                }
            }
            else if(radix==14)
            {
                for (int i=0; i<hex.length(); i++)
                {
                    char ch = hex.charAt(i);
                    if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'D') || (ch >= 'a' && ch <= 'd')))
                    {
                        count += 1;
                    }
                }
                if (count==0)
                {
                    hex = hex.toUpperCase();  
                    int decimal = 0;  
                    String hexString = "0123456789ABCD";
                    for (int i = 0; i < hex.length(); i++)  
                    {  
                        char c = hex.charAt(i);  
                        int d = hexString.indexOf(c);  
                        decimal = 14*decimal + d;  
                    }  
                    System.out.print("The equivalent decimal number \"" + hex + "\" is: ");
                    System.out.print(decimal);
                }
                else if (count!=0)
                {
                    System.out.print("error: invalid string \"" + hex + "\"");
                }
            }
            else if(radix==13)
                {
                    for (int i=0; i<hex.length(); i++)
                    {
                        char ch = hex.charAt(i);
                        if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'C') || (ch >= 'a' && ch <= 'c')))
                        {
                            count += 1;
                        }
                    }
                    if (count==0)
                    {
                        hex = hex.toUpperCase();  
                        int decimal = 0;  
                        String hexString = "0123456789ABC";
                        for (int i = 0; i < hex.length(); i++)  
                        {  
                            char c = hex.charAt(i);  
                            int d = hexString.indexOf(c);  
                            decimal = 13*decimal + d;  
                        }  
                        System.out.print("The equivalent decimal number \"" + hex + "\" is: ");
                        System.out.print(decimal);
                    }
                    else if (count!=0)
                    {
                        System.out.print("error: invalid string \"" + hex + "\"");
                    }
                }
            else if(radix==12)
            {
                for (int i=0; i<hex.length(); i++)
                {
                    char ch = hex.charAt(i);
                    if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'B') || (ch >= 'a' && ch <= 'b')))
                    {
                        count += 1;
                    }
                }
                if (count==0)
                {
                    hex = hex.toUpperCase();  
                    int decimal = 0;  
                    String hexString = "0123456789AB";
                    for (int i = 0; i < hex.length(); i++)  
                    {  
                        char c = hex.charAt(i);  
                        int d = hexString.indexOf(c);  
                        decimal = 12*decimal + d;  
                    }  
                    System.out.print("The equivalent decimal number \"" + hex + "\" is: ");
                    System.out.print(decimal);
                }
                else if (count!=0)
                {
                    System.out.print("error: invalid string \"" + hex + "\"");
                }
            }    
            else if(radix==11)
            {
                for (int i=0; i<hex.length(); i++)
                {
                    char ch = hex.charAt(i);
                    if(!((ch >= '0' && ch <= '9') || (ch == 'A') || (ch == 'a')))
                    {
                        count += 1;
                    }
                }
                if (count==0)
                {
                    hex = hex.toUpperCase();  
                    int decimal = 0;  
                    String hexString = "0123456789A";
                    for (int i = 0; i < hex.length(); i++)  
                    {  
                        char c = hex.charAt(i);  
                        int d = hexString.indexOf(c);  
                        decimal = 11*decimal + d;  
                    }  
                    System.out.print("The equivalent decimal number \"" + hex + "\" is: ");
                    System.out.print(decimal);
                }
                else if (count!=0)
                {
                    System.out.print("error: invalid string \"" + hex + "\"");
                }
            }
            else if(radix==10)
            {
                for (int i=0; i<hex.length(); i++)
                {
                    char ch = hex.charAt(i);
                    if(!(ch >= '0' && ch <= '9'))
                    {
                        count += 1;
                    }
                }
                if (count==0)
                {
                    hex = hex.toUpperCase();  
                    int decimal = 0;  
                    String hexString = "0123456789";
                    for (int i = 0; i < hex.length(); i++)  
                    {  
                        char c = hex.charAt(i);  
                        int d = hexString.indexOf(c);  
                        decimal = 10*decimal + d;  
                    }  
                    System.out.print("The equivalent decimal number \"" + hex + "\" is: ");
                    System.out.print(decimal);
                }
                else if (count!=0)
                {
                    System.out.print("error: invalid string \"" + hex + "\"");
                }
            }
        }
    }
    public static boolean isBinaryNumber(int num, int radix)
    {
        if (num == 0 || num == 1|| num < 0) 
        {
            return false;
        }
        while (num != 0) 
        {
            if (num % 10 > radix) 
            {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}