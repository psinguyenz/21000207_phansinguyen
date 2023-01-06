import java.util.*;
class CountVowelsDigits {
    public static boolean isDigit(char c)
        {
            if(c >= '0' && c<='9')
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public static void main (String[] args) {
        
        String inStr;
        int inStrLen;  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();
        int countDigits = 0;
        double countDigitsPercent = 0.0;
        int countVowels = 0;
        double countVowelsPercent = 0.0;
        for (int charIdx = inStrLen-1; charIdx>=0; charIdx--)
        {
            char ch = inStr.charAt(charIdx);
            if(isDigit(ch)==true)
            {
                countDigits += 1;
            }
            if(ch == 'a'||ch== 'e'||ch =='o'||ch=='i'||ch=='u')
            {
                countVowels += 1;
            }
        }
        System.out.print("Number of vowels: "+ countVowels+ " ");
        countVowelsPercent = (double)(countVowels) / inStrLen * 100;
        System.out.printf("(%.2f%%", countVowelsPercent );
        System.out.print("Number of digits: "+ countDigits+ " ");
        countDigitsPercent = (double)(countDigits) / inStrLen * 100;
        System.out.printf("(%.2f%%)", countDigitsPercent);
    }
}