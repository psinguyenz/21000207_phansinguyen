import java.util.*;
public class AverageWithInputValidation {
    public static void main(String args[])
    {
        final int NUMS_STUDENT = 3;
        double avg;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int numberIn;
        boolean isValid;
        for (int studentNo = 1; studentNo <= NUMS_STUDENT; studentNo++)
        {
            isValid = false;
            do
            {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = in.nextInt();
                if (numberIn >= 0)
                {
                    if (numberIn <= 100)
                    {
                        isValid = true;
                    }
                }
                else if(numberIn<0)
                {
                    System.out.println("Invalid input, try again ... ");
                }
                else {
                    System.out.println("Invalid input, try again ... ");
                }
            } while (!isValid);
            sum += numberIn;
        }
        avg = (double)sum/NUMS_STUDENT;
        System.out.println("The average is: " + avg);
    }
}