public class SumAverageRunningInt {
    public static void main(String args[])
    {
        int sum = 0;
        double avg;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;
        int count = 0;
        int sumofthesquare = 0;
        int sumOdd = 0;
        int sumEven = 0;
        while (number <= UPPERBOUND)
        {
            sumofthesquare += (number*number);
            sum += number;
            number++;
            count++;
        }
        for (number = LOWERBOUND; number <= UPPERBOUND; number++)
        {
            if (number % 2 == 0)
            {
                sumEven += number;
            }
            else
            {
                sumOdd += number;
            }
        }
        avg = sum / (double)count;
        int absDiff = 0;
        if (sumOdd > sumEven)
        {
            absDiff = sumOdd - sumEven;
        }
        else
        {
            absDiff = sumEven - sumOdd;
        }
        System.out.println("The sum of 1 to 100 is" + sum);
        System.out.println("The average is " + avg);
        System.out.println("The sum of the squares is " + sumofthesquare);
        System.out.println("The sum of Even numbers is " + sumEven);
        System.out.println("The sum of Odd numbers is " + sumOdd);
        System.out.println("The absolute difference is " + absDiff);
    }
}