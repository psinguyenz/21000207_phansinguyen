import java.util.*;
class DecipherCaesarCode {
    public static void main (String[] args) {
        
        String inStr;
        int inStrLen;  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a ciphertext string: ");
        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();
        System.out.print("The plaintext string is: ");
        for (int charIdx = 0; charIdx<inStrLen; charIdx++)
        {
            char ch = inStr.charAt(charIdx);
            if(ch=='A')
            {
                System.out.print('X');
            }
            else if(ch=='B')
            {
                System.out.print('Y');
            }
            else if(ch=='C')
            {
                System.out.print('Z');
            }
            else 
            {
                System.out.print((char)(ch-3));
            }
        }
    }
}