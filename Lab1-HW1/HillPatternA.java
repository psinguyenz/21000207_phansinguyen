import java.util.*;
class HillPatternA{
    public static void main(String[] args)
    {
        int numRows;
        int numCol;
       System.out.println("Enter the rows: ");
       Scanner sc = new Scanner(System.in);
       numRows = sc.nextInt();
       numCol = 2*numRows - 1;
       for(int row=1; row<=numRows; row++)
       {
           for(int col=1; col<=numCol; col++)
           {
                if((row+col>=numRows+1) && (row >= col - numRows+1))
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
           }
           System.out.println(" ");
       }
    }
}