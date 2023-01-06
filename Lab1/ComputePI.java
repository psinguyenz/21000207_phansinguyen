public class ComputePI {
    public static void main (String args[])
    {
        double sum = 0.0;
        int MAX_DENOMINATOR = 10000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator+=2)
        {
            if (denominator % 4 == 1)
            {
                sum += (double)1/(denominator);
            }
            else
            {
                sum -= (double)1/(denominator);
            }
        }
        sum = 4*sum;
        System.out.println(sum);
    }
}