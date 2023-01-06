import java.util.*;
public class TestPalindromicWord {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int fi = 0;
        System.out.print("Enter a word: ");
        String inStrOrg = in.next();
        String inStr = inStrOrg.toLowerCase();
        int inStrLen = inStr.length();
        int bi = inStrLen - 1;
        for (fi = 0, bi = inStrLen - 1; fi<bi; fi++, bi--)
        {
            if(inStr.charAt(fi)==' ')
            {
                bi++;
                fi++;
            }
            else if(inStr.charAt(bi)==' ')
            {
                bi--;
                fi--;
            }
            else
            {
                if(inStr.charAt(fi) != inStr.charAt(bi))
                {
                    count += 1;
                }
            }
        }
        if (count==0)
        {
            System.out.print("\"" + inStrOrg + "\" is a palindrome");
        }
        else if (count != 0)
        {
            System.out.print("\"" + inStrOrg + "\" is not a palindrome");
        }
    }
}