import java.util.*;
class CaesarCode {
    public static void main (String[] args) {
        
        String inStr;
        int inStrLen;  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a plaintext string: ");
        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();
        System.out.print("The ciphertext string is: ");
        for (int charIdx = 0; charIdx<inStrLen; charIdx++)
        {
            char ch = inStr.charAt(charIdx);
            if(ch=='X')
            {
                System.out.print('A');
            }
            else if(ch=='Y')
            {
                System.out.print('B');
            }
            else if(ch=='Z')
            {
                System.out.print('C');
            }
            else 
            {
                System.out.print((char)(ch+3));
            }
        }
    }
}