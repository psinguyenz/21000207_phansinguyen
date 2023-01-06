import java.util.*;
public class TestPalindromicPhrase {
    public static boolean isLetter(char c)
    {
        if(c>= 'a' && c<='z')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int fi = 0;
        System.out.print("Enter a word: ");
        String inStr = in.next()toLowerCase();
        int inStrLen = inStr.length();
        int bi = inStrLen - 1;
        for (fi = 0, bi = inStrLen - 1; fi<bi; fi++, bi--)
        {
            if(isLetter(inStr.charAt(fi)) == false)
            {
                bi++;
                fi++;
            }
            else if(isLetter(inStr.charAt(bi)) == false)
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
            System.out.print(inStr + " is a palindrome");
        }
        else if (count != 0)
        {
            System.out.print(inStr + "is not a palindrome");
        }
    }
}