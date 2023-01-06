import java.util.*;
class PhoneKeyPad {
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
        }
    }
}