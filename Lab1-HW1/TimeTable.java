import java.util.*;
class TimeTable {
    public static void main(String args[])
    {
        int size;
       System.out.println("Enter the size: ");
       Scanner sc = new Scanner(System.in);
       size = sc.nextInt();
       System.out.print( "   *");
        System.out.print(" | ");
        for(int i=1; i<=size; i++)
        {
            System.out.printf("%4d", i);
        }
        System.out.println(" ");
        for(int j=1; j<=size+2; j++)
        {
            System.out.print( "----");
        }
        System.out.println(" ");
       for(int row=1; row<=size; row++)
       {
            System.out.printf( "%4d", row);
            System.out.print(" | ");
           for(int col=1; col<=size; col++)
           {
               System.out.printf("%4d", row*col);
           }
           System.out.println(" ");
       }
    }
}