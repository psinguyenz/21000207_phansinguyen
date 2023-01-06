import java.util.*;
class ExchangeCipher {
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
            if(ch=='A')
            {
                System.out.print('Z');
            }
            else if(ch=='B')
            {
                System.out.print('Y');
            }
            else if(ch=='C')
            {
                System.out.print('X');
            }
            else if(ch=='D')
            {
                System.out.print('W');
            }
            else if(ch=='E')
            {
                System.out.print('V');
            }
            else if(ch=='F')
            {
                System.out.print('U');
            }
            else if(ch=='G')
            {
                System.out.print('T');
            }
            else if(ch=='H')
            {
                System.out.print('S');
            }
            else if(ch=='I')
            {
                System.out.print('R');
            }
            else if(ch=='J')
            {
                System.out.print('Q');
            }
            else if(ch=='K')
            {
                System.out.print('P');
            }
            else if(ch=='L')
            {
                System.out.print('O');
            }
            else if(ch=='M')
            {
                System.out.print('N');
            }
            else if(ch=='N')
            {
                System.out.print('M');
            }
            else if(ch=='O')
            {
                System.out.print('L');
            }
            else if(ch=='P')
            {
                System.out.print('K');
            }
            else if(ch=='Q')
            {
                System.out.print('J');
            }
            else if(ch=='R')
            {
                System.out.print('I');
            }
            else if(ch=='S')
            {
                System.out.print('H');
            }
            else if(ch=='T')
            {
                System.out.print('G');
            }
            else if(ch=='U')
            {
                System.out.print('F');
            }
            else if(ch=='V')
            {
                System.out.print('E');
            }
            else if(ch=='W')
            {
                System.out.print('D');
            }
            else if(ch=='X')
            {
                System.out.print('C');
            }
            else if(ch=='Y')
            {
                System.out.print('B');
            }
            else if(ch=='Z')
            {
                System.out.print('A');
            }
        }
    }
}