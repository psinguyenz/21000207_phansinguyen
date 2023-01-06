import java.util.*;
public class OctToDec {
    public static boolean isOctalNumber(int num)
    {
        while (num > 0) 
        {
            if (num % 10 > 7) 
            {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        int oct = in.nextInt();
        int octOrg = oct;
        int decimal = 0;  
        int n = 0;  
        if (isOctalNumber(oct) == true)
        {
            while(true){  
                if(oct == 0)
                {  
                    break;  
                } 
                else 
                {  
                    int temp = oct%10;  
                    decimal += temp*Math.pow(8, n);  
                    oct = oct/10;  
                    n++;  
                }  
            }  
            System.out.print("The equivalent decimal number for Octal \"" + octOrg + "\" is: ");
            System.out.print(decimal);
        }
        else 
        {
            System.out.print("error: invalid Oct string \"" + octOrg + "\"");
        }
    }
}