import java.util.*;
class SquarePattern{
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
               System.out.print("# ");
           }
           System.out.println(" ");
       }
    }
}