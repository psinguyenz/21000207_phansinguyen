import java.util.Scanner;

public class NumberGuess {
    public static String check(int input, int SECRET_NUMBER)
    {
        String output = " ";
        if(input == SECRET_NUMBER)
        {
            output = "equals";
        }
        else if(input < SECRET_NUMBER)
        {
            output = "high";
        }
        else
        {
            output = "low";
        }
        return output;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int SECRET_NUMBER = (int)(Math.random()*100);
        int count = 0;
        System.out.println("Key in your guess: ");
        int input = in.nextInt();
        int trials = 1;
        if(check(input, SECRET_NUMBER) == "equals")
        {
            System.out.println("You got it in 1 trial!");
        }
        else
        {
            while(count==0)
            {
                if(check(input, SECRET_NUMBER) == "high")
                {
                    System.out.println("Try higher");
                    input = in.nextInt();
                    trials+=1;
                }
                if(check(input, SECRET_NUMBER) == "low")
                {
                    System.out.println("Try lower");
                    input = in.nextInt();
                    trials+=1;
                }
                if(check(input, SECRET_NUMBER) == "equals")
                {
                    System.out.println("You got it in " + trials + " trials!");
                    count += 1;
                }
            }
        }
    }
}
