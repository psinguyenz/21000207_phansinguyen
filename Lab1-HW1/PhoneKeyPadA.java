import java.util.*;
class PhoneKeyPadA {
    public static void main (String[] args) {
        
        String inStr;
        int inStrLen;  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();
        for (int charIdx = 0; charIdx<=inStrLen; charIdx++)
        {
            char ch = inStr.charAt(charIdx);
            if(ch=='a'||ch=='b'||ch=='c')
            {
                System.out.print(2);
            }
            else if(ch=='d'||ch=='e'||ch=='f')
            {
                System.out.print(3);
            }
            else if(ch=='g'||ch=='h'||ch=='i')
            {
                System.out.print(4);
            }
            else if(ch=='j'||ch=='k'||ch=='l')
            {
                System.out.print(5);
            }
            else if(ch=='m'||ch=='n'||ch=='o')
            {
                System.out.print(6);
            }
            else if(ch=='p'||ch=='q'||ch=='r'||ch=='s')
            {
                System.out.print(7);
            }
            else if(ch=='t'||ch=='u'||ch=='v')
            {
                System.out.print(8);
            }
            else if(ch=='w'||ch=='x'||ch=='y'||ch=='z')
            {
                System.out.print(9);
            }
        }
    }
}