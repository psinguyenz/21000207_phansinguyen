import java.util.*;
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = in.nextLine();
        int inStrLen = inStr.length();
        int count = 0;
        for (int i=0; i<inStrLen; i++)
        {
            char ch = inStr.charAt(i);
            if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f')))
            {
                count += 1;
            }
        }
        if (count==0)
        {
            System.out.print("\"" + inStr + "\" is a hex string");
        }
        else if (count != 0)
        {
            System.out.print("\"" + inStr + "\" is not a hex string");
        }
    }
}