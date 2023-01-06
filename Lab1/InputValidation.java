import java.util.*;
public class InputValidation {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int numberIn;
        boolean isValid;
        isValid = false;
        do
        {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = in.nextInt();
            if (numberIn >= 0)
            {
                if (numberIn <= 10)
                {
                    isValid = true;
                }
            }
            else if (numberIn >= 90)
            {
                if (numberIn <= 100)
                {
                    isValid = true;
                }
            }
            System.out.println("Invalid input, try again ... ");
        } while (!isValid);
        System.out.print("You have entered: " + numberIn);
    }
}