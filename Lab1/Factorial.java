public class Factorial {
    public static void main(String [] args)
    {
        int n = 20; //may tinh bat dau tinh sai tu 13! tro di
        int factorial = 1;
        for (int i = 1; i<=n; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}