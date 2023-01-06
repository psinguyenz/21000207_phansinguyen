import java.util.*;
class CheckerPattern{
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
                if ((row%2)==0)
                {
                    if (col==1)
                    {
                        System.out.print(" ");
                    }
                }
               System.out.print("# ");
           }
           System.out.println(" ");
       }
    }
}