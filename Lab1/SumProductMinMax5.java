import java.util.*;
public class SumProductMinMax5
{
    public static void main (String args[])
    {
        int number1;
        int number2;
        int number3, number4, number5;

        int sum;
        int product;
        int min;
        int max;

        Scanner in = new Scanner(System.in);
        System.out.print ("Enter 1st integer: ");
        number1 = in.nextInt();
        System.out.print ("Enter 2nd integer: ");
        number2 = in.nextInt();
        System.out.print("Enter 3rd integer: ");
        number3 = in.nextInt();
        in.close();
        System.out.print("Enter 4th integer: ");
        number4 = in.nextInt();
        in.close();
        System.out.print("Enter 5th integer: ");
        number5 = in.nextInt();
        in.close();

        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;

        min = number1;
        if (number2<min)
        {
            min = number2;
        }
        if (number3<min)
        {
            min = number3;
        }
        if (number4<min)
        {
            min = number4;
        }
        if (number5<min)
        {
            min = number5;
        }

        max = number1;
        if (number2>max)
        {
            max = number2;
        }
        if (number3>max) {
            max = number3;
        }
        if (number4>max) {
            max = number4;
        }
        if (number5>max) {
            max = number5;
        }
    System.out.println("The sum is: " + sum);
    System.out.println("The product is: " + product);
    System.out.println("The min is: " + min);
    System.out.println("The max is: " + max);
    }
}

