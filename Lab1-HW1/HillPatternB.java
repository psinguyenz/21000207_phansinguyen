import java.util.*;
class HillPatternB{
    public static void main(String[] args)
    {
        int numRows;
        int numCol;
       System.out.println("Enter the rows: ");
       Scanner sc = new Scanner(System.in);
       numRows = sc.nextInt();
       numCol = 2*numRows - 1;
       for(int row=numRows; row>=1; row--)
       {
           for(int col=numCol; col>=1; col--)
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