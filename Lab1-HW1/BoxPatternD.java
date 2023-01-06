import java.util.*;
class BoxPatternD{
    public static void main(String[] args)
    {
        int size;
       System.out.println("Enter the size: ");
       Scanner sc = new Scanner(System.in);
       size = sc.nextInt();
       for(int row=1; row<=size; row++)
       {
           for(int col=1; col<=size; col++)
           {
                if(row==1||row==size||row+col==size+1||row==col)
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